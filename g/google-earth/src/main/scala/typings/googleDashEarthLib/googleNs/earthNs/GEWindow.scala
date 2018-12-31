package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GEWindow")
@js.native
class GEWindow () extends GEEventEmitter {
  /**
    * Removes focus from the Google Earth object.
    */
  def blur(): scala.Unit = js.native
  /**
    * Gives the Google Earth object focus.
    */
  def focus(): scala.Unit = js.native
  /**
    * Toggles the overall visibility of Google Earth inside the browser.
    */
  def getVisibility(): scala.Boolean = js.native
  /**
    * Toggles the overall visibility of Google Earth inside the browser.
    */
  def setVisibility(visibility: scala.Boolean): scala.Unit = js.native
}

