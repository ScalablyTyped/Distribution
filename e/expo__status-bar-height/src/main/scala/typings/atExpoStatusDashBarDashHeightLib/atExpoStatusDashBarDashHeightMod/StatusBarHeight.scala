package typings
package atExpoStatusDashBarDashHeightLib.atExpoStatusDashBarDashHeightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/status-bar-height", "StatusBarHeight")
@js.native
class StatusBarHeight () extends js.Object {
  /**
    * Add 'willChange' event listener
    */
  def addEventListener(handler: StatusBarHeightHandler): scala.Unit = js.native
  /**
    * Get the current status bar height
    */
  def getAsync(): js.Promise[scala.Double] = js.native
  /**
    * Remove 'willChange' event listener
    */
  def removeEventListener(handler: StatusBarHeightHandler): scala.Unit = js.native
}

