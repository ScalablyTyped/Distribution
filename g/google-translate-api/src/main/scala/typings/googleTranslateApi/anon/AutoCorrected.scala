package typings.googleTranslateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoCorrected extends js.Object {
  
  var autoCorrected: Boolean = js.native
  
  var didYouMean: Boolean = js.native
  
  var value: String = js.native
}
object AutoCorrected {
  
  @scala.inline
  def apply(autoCorrected: Boolean, didYouMean: Boolean, value: String): AutoCorrected = {
    val __obj = js.Dynamic.literal(autoCorrected = autoCorrected.asInstanceOf[js.Any], didYouMean = didYouMean.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrected]
  }
  
  @scala.inline
  implicit class AutoCorrectedOps[Self <: AutoCorrected] (val x: Self) extends AnyVal {
    
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
    def setAutoCorrected(value: Boolean): Self = this.set("autoCorrected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDidYouMean(value: Boolean): Self = this.set("didYouMean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
