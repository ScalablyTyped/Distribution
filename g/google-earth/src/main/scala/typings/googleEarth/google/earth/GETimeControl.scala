package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GETimeControl extends GEControl {
  
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
  
  @scala.inline
  implicit class GETimeControlOps[Self <: GETimeControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetAvailableImageDates(value: () => KmlObjectList[KmlTimeStamp]): Self = this.set("getAvailableImageDates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCalculatedRate(value: () => Double): Self = this.set("getCalculatedRate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExtents(value: () => KmlTimeSpan): Self = this.set("getExtents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisibility(value: () => GEVisibilityEnum): Self = this.set("getVisibility", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetVisibility(value: GEVisibilityEnum => Unit): Self = this.set("setVisibility", js.Any.fromFunction1(value))
  }
}
