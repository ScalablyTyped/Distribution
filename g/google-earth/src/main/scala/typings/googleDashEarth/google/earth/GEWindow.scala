package typings.googleDashEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GEWindow")
@js.native
class GEWindow () extends GEEventEmitter {
  /**
    * Removes focus from the Google Earth object.
    */
  def blur(): Unit = js.native
  /**
    * Gives the Google Earth object focus.
    */
  def focus(): Unit = js.native
  /**
    * Toggles the overall visibility of Google Earth inside the browser.
    */
  def getVisibility(): Boolean = js.native
  /**
    * Toggles the overall visibility of Google Earth inside the browser.
    */
  def setVisibility(visibility: Boolean): Unit = js.native
}

