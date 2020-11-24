package typings.dwt.addonWebcamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoControlProperty extends js.Object {
  
  /**
    * Return whether the property is set autmatically or not.
    */
  def GetIfAuto(): Boolean = js.native
  
  /**
    * Return the value of the property.
    */
  def GetValue(): Double = js.native
}
object VideoControlProperty {
  
  @scala.inline
  def apply(GetIfAuto: () => Boolean, GetValue: () => Double): VideoControlProperty = {
    val __obj = js.Dynamic.literal(GetIfAuto = js.Any.fromFunction0(GetIfAuto), GetValue = js.Any.fromFunction0(GetValue))
    __obj.asInstanceOf[VideoControlProperty]
  }
  
  @scala.inline
  implicit class VideoControlPropertyOps[Self <: VideoControlProperty] (val x: Self) extends AnyVal {
    
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
    def setGetIfAuto(value: () => Boolean): Self = this.set("GetIfAuto", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => Double): Self = this.set("GetValue", js.Any.fromFunction0(value))
  }
}
