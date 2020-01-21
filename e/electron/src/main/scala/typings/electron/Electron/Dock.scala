package typings.electron.Electron

import typings.electron.electronStrings.critical
import typings.electron.electronStrings.informational
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dock extends js.Object {
  /**
    * When critical is passed, the dock icon will bounce until either the application
    * becomes active or the request is canceled. When informational is passed, the
    * dock icon will bounce for one second. However, the request remains active until
    * either the application becomes active or the request is canceled. Nota Bene:
    * This method can only be used while the app is not focused; when the app is
    * focused it will return -1.
    */
  def bounce(): Double = js.native
  @JSName("bounce")
  def bounce_critical(`type`: critical): Double = js.native
  @JSName("bounce")
  def bounce_informational(`type`: informational): Double = js.native
  /**
    * Cancel the bounce of id.
    */
  def cancelBounce(id: Double): Unit = js.native
  /**
    * Bounces the Downloads stack if the filePath is inside the Downloads folder.
    */
  def downloadFinished(filePath: String): Unit = js.native
  def getBadge(): String = js.native
  def getMenu(): Menu | Null = js.native
  /**
    * Hides the dock icon.
    */
  def hide(): Unit = js.native
  def isVisible(): Boolean = js.native
  /**
    * Sets the string to be displayed in the dock’s badging area.
    */
  def setBadge(text: String): Unit = js.native
  def setIcon(image: String): Unit = js.native
  /**
    * Sets the image associated with this dock icon.
    */
  def setIcon(image: NativeImage_): Unit = js.native
  /**
    * Sets the application's dock menu.
    */
  def setMenu(menu: Menu): Unit = js.native
  def show(): js.Promise[Unit] = js.native
}

