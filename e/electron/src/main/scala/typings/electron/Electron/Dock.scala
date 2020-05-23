package typings.electron.Electron

import typings.electron.electronStrings.critical
import typings.electron.electronStrings.informational
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dock extends js.Object {
  // Docs: http://electronjs.org/docs/api/dock
  /**
    * an ID representing the request.
    *
    * When `critical` is passed, the dock icon will bounce until either the
    * application becomes active or the request is canceled.
    *
    * When `informational` is passed, the dock icon will bounce for one second.
    * However, the request remains active until either the application becomes active
    * or the request is canceled.
    *
    * **Nota Bene:** This method can only be used while the app is not focused; when
    * the app is focused it will return -1.
    *
    * @platform darwin
    */
  def bounce(): Double = js.native
  @JSName("bounce")
  def bounce_critical(`type`: critical): Double = js.native
  @JSName("bounce")
  def bounce_informational(`type`: informational): Double = js.native
  /**
    * Cancel the bounce of `id`.
    *
    * @platform darwin
    */
  def cancelBounce(id: Double): Unit = js.native
  /**
    * Bounces the Downloads stack if the filePath is inside the Downloads folder.
    *
    * @platform darwin
    */
  def downloadFinished(filePath: String): Unit = js.native
  /**
    * The badge string of the dock.
    *
    * @platform darwin
    */
  def getBadge(): String = js.native
  /**
    * The application's [dock menu][dock-menu].
    *
    * @platform darwin
    */
  def getMenu(): Menu | Null = js.native
  /**
    * Hides the dock icon.
    *
    * @platform darwin
    */
  def hide(): Unit = js.native
  /**
    * Whether the dock icon is visible.
    *
    * @platform darwin
    */
  def isVisible(): Boolean = js.native
  /**
    * Sets the string to be displayed in the dock’s badging area.
    *
    * @platform darwin
    */
  def setBadge(text: String): Unit = js.native
  def setIcon(image: String): Unit = js.native
  /**
    * Sets the `image` associated with this dock icon.
    *
    * @platform darwin
    */
  def setIcon(image: NativeImage_): Unit = js.native
  /**
    * Sets the application's [dock menu][dock-menu].
    *
    * @platform darwin
    */
  def setMenu(menu: Menu): Unit = js.native
  /**
    * Resolves when the dock icon is shown.
    *
    * @platform darwin
    */
  def show(): js.Promise[Unit] = js.native
}

