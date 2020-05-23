package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GETimeControl extends GEControl {
  /**
    * Returns an array containing the KmlTimeStamp objects associated with the historical imagery available in this view.
    */
  def getAvailableImageDates(): KmlObjectList[KmlTimeStamp]
  /**
    * Returns the clock rate that the plugin would use, if the play button on the time slider UI was pressed.
    * This rate is calculated by the plugin based on the time range currently present in the slider.
    */
  def getCalculatedRate(): Double
  /**
    * Returns a KmlTimeSpan object encompassing the earliest and latest times present in the time slider.
    * For more information, refer to the Time chapter of the Developer's Guide.
    */
  def getExtents(): KmlTimeSpan
  /**
    * Whether the time slider is visible or not.
    */
  def getVisibility(): GEVisibilityEnum
  /**
    * Specifies whether the control is visible or hidden.
    */
  def setVisibility(visibility: GEVisibilityEnum): Unit
}

object GETimeControl {
  @scala.inline
  def apply(
    getAvailableImageDates: () => KmlObjectList[KmlTimeStamp],
    getCalculatedRate: () => Double,
    getExtents: () => KmlTimeSpan,
    getVisibility: () => GEVisibilityEnum,
    setVisibility: GEVisibilityEnum => Unit
  ): GETimeControl = {
    val __obj = js.Dynamic.literal(getAvailableImageDates = js.Any.fromFunction0(getAvailableImageDates), getCalculatedRate = js.Any.fromFunction0(getCalculatedRate), getExtents = js.Any.fromFunction0(getExtents), getVisibility = js.Any.fromFunction0(getVisibility), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.asInstanceOf[GETimeControl]
  }
}

