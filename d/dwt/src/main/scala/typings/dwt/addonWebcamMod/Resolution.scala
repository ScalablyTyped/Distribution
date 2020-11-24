package typings.dwt.addonWebcamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resolution extends js.Object {
  
  /**
    * Return the specified resolution.
    */
  def Get(index: Double): String = js.native
  
  /**
    * Return the number of available resolutions.
    */
  def GetCount(): Double = js.native
  
  /**
    * Return the current resolution.
    */
  def GetCurrent(): String = js.native
}
object Resolution {
  
  @scala.inline
  def apply(Get: Double => String, GetCount: () => Double, GetCurrent: () => String): Resolution = {
    val __obj = js.Dynamic.literal(Get = js.Any.fromFunction1(Get), GetCount = js.Any.fromFunction0(GetCount), GetCurrent = js.Any.fromFunction0(GetCurrent))
    __obj.asInstanceOf[Resolution]
  }
  
  @scala.inline
  implicit class ResolutionOps[Self <: Resolution] (val x: Self) extends AnyVal {
    
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
    def setGet(value: Double => String): Self = this.set("Get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("GetCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrent(value: () => String): Self = this.set("GetCurrent", js.Any.fromFunction0(value))
  }
}
