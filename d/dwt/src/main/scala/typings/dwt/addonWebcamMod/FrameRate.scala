package typings.dwt.addonWebcamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameRate extends js.Object {
  
  /**
    * Return the specified frame rate.
    */
  def Get(index: Double): Double = js.native
  
  /**
    * Return the number of available frame rates.
    */
  def GetCount(): Double = js.native
  
  /**
    * Return the current frame rate.
    */
  def GetCurrent(): Double = js.native
}
object FrameRate {
  
  @scala.inline
  def apply(Get: Double => Double, GetCount: () => Double, GetCurrent: () => Double): FrameRate = {
    val __obj = js.Dynamic.literal(Get = js.Any.fromFunction1(Get), GetCount = js.Any.fromFunction0(GetCount), GetCurrent = js.Any.fromFunction0(GetCurrent))
    __obj.asInstanceOf[FrameRate]
  }
  
  @scala.inline
  implicit class FrameRateOps[Self <: FrameRate] (val x: Self) extends AnyVal {
    
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
    def setGet(value: Double => Double): Self = this.set("Get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("GetCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrent(value: () => Double): Self = this.set("GetCurrent", js.Any.fromFunction0(value))
  }
}
