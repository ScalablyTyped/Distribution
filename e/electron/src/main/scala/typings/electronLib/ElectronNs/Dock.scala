package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dock extends js.Object {
  /**
    * When critical is passed, the dock icon will bounce until either the application
    * becomes active or the request is canceled. When informational is passed, the
    * dock icon will bounce for one second. However, the request remains active until
    * either the application becomes active or the request is canceled.
    */
  def bounce(): scala.Double = js.native
  @JSName("bounce")
  def bounce_critical(`type`: electronLib.electronLibStrings.critical): scala.Double = js.native
  @JSName("bounce")
  def bounce_informational(`type`: electronLib.electronLibStrings.informational): scala.Double = js.native
  /**
    * Cancel the bounce of id.
    */
  def cancelBounce(id: scala.Double): scala.Unit = js.native
  /**
    * Bounces the Downloads stack if the filePath is inside the Downloads folder.
    */
  def downloadFinished(filePath: java.lang.String): scala.Unit = js.native
  def getBadge(): java.lang.String = js.native
  /**
    * Hides the dock icon.
    */
  def hide(): scala.Unit = js.native
  def isVisible(): scala.Boolean = js.native
  /**
    * Sets the string to be displayed in the dock’s badging area.
    */
  def setBadge(text: java.lang.String): scala.Unit = js.native
  /**
    * Sets the image associated with this dock icon.
    */
  def setIcon(image: NativeImage): scala.Unit = js.native
  def setIcon(image: java.lang.String): scala.Unit = js.native
  /**
    * Sets the application's dock menu.
    */
  def setMenu(menu: Menu): scala.Unit = js.native
  /**
    * Shows the dock icon.
    */
  def show(): scala.Unit = js.native
}

