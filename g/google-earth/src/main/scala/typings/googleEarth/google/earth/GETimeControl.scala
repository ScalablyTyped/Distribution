package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GETimeControl")
@js.native
class GETimeControl () extends GEControl {
  /**
    * Returns an array containing the KmlTimeStamp objects associated with the historical imagery available in this view.
    */
  def getAvailableImageDates(): KmlObjectList[KmlTimeStamp] = js.native
  /**
    * Returns the clock rate that the plugin would use, if the play button on the time slider UI was pressed.
    * This rate is calculated by the plugin based on the time range currently present in the slider.
    */
  def getCalculatedRate(): Double = js.native
  /**
    * Returns a KmlTimeSpan object encompassing the earliest and latest times present in the time slider.
    * For more information, refer to the Time chapter of the Developer's Guide.
    */
  def getExtents(): KmlTimeSpan = js.native
  /**
    * Whether the time slider is visible or not.
    */
  def getVisibility(): GEVisibilityEnum = js.native
  /**
    * Specifies whether the control is visible or hidden.
    */
  def setVisibility(visibility: GEVisibilityEnum): Unit = js.native
}

