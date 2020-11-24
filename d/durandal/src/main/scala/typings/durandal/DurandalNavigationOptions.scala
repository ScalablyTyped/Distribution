package typings.durandal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurandalNavigationOptions extends js.Object {
  
  var replace: Boolean = js.native
  
  var trigger: Boolean = js.native
}
object DurandalNavigationOptions {
  
  @scala.inline
  def apply(replace: Boolean, trigger: Boolean): DurandalNavigationOptions = {
    val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurandalNavigationOptions]
  }
  
  @scala.inline
  implicit class DurandalNavigationOptionsOps[Self <: DurandalNavigationOptions] (val x: Self) extends AnyVal {
    
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
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: Boolean): Self = this.set("trigger", value.asInstanceOf[js.Any])
  }
}
