package typings.dwt.addonWebcamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraControlPropertyExtra extends js.Object {
  
  /**
    * Return the default value of the property.
    */
  def GetDefaultValue(): Double = js.native
  
  /**
    * Return whether the property is set autmatically or not.
    */
  def GetIfAuto(): Boolean = js.native
  
  /**
    * Return the maximum value of the property.
    */
  def GetMaxValue(): Double = js.native
  
  /**
    * Return the minimum value of the property.
    */
  def GetMinValue(): Double = js.native
  
  /**
    * Return the smallest increment by which the property can change.
    */
  def GetSteppingDelta(): Double = js.native
}
object CameraControlPropertyExtra {
  
  @scala.inline
  def apply(
    GetDefaultValue: () => Double,
    GetIfAuto: () => Boolean,
    GetMaxValue: () => Double,
    GetMinValue: () => Double,
    GetSteppingDelta: () => Double
  ): CameraControlPropertyExtra = {
    val __obj = js.Dynamic.literal(GetDefaultValue = js.Any.fromFunction0(GetDefaultValue), GetIfAuto = js.Any.fromFunction0(GetIfAuto), GetMaxValue = js.Any.fromFunction0(GetMaxValue), GetMinValue = js.Any.fromFunction0(GetMinValue), GetSteppingDelta = js.Any.fromFunction0(GetSteppingDelta))
    __obj.asInstanceOf[CameraControlPropertyExtra]
  }
  
  @scala.inline
  implicit class CameraControlPropertyExtraOps[Self <: CameraControlPropertyExtra] (val x: Self) extends AnyVal {
    
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
    def setGetDefaultValue(value: () => Double): Self = this.set("GetDefaultValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIfAuto(value: () => Boolean): Self = this.set("GetIfAuto", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxValue(value: () => Double): Self = this.set("GetMaxValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinValue(value: () => Double): Self = this.set("GetMinValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSteppingDelta(value: () => Double): Self = this.set("GetSteppingDelta", js.Any.fromFunction0(value))
  }
}
