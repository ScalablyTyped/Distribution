package typings.dwt.addonWebcamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaType extends js.Object {
  
  /**
    * Return the specified media type.
    */
  def Get(index: Double): String = js.native
  
  /**
    * Return the number of available media types.
    */
  def GetCount(): Double = js.native
  
  /**
    * Return the current media type.
    */
  def GetCurrent(): String = js.native
  
  /**
    * internal use
    */
  var _resultlist: js.Any = js.native
}
object MediaType {
  
  @scala.inline
  def apply(Get: Double => String, GetCount: () => Double, GetCurrent: () => String, _resultlist: js.Any): MediaType = {
    val __obj = js.Dynamic.literal(Get = js.Any.fromFunction1(Get), GetCount = js.Any.fromFunction0(GetCount), GetCurrent = js.Any.fromFunction0(GetCurrent), _resultlist = _resultlist.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaType]
  }
  
  @scala.inline
  implicit class MediaTypeOps[Self <: MediaType] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def set_resultlist(value: js.Any): Self = this.set("_resultlist", value.asInstanceOf[js.Any])
  }
}
