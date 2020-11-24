package typings.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddLifecycleRuleOptions extends js.Object {
  
  var append: js.UndefOr[Boolean] = js.native
}
object AddLifecycleRuleOptions {
  
  @scala.inline
  def apply(): AddLifecycleRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddLifecycleRuleOptions]
  }
  
  @scala.inline
  implicit class AddLifecycleRuleOptionsOps[Self <: AddLifecycleRuleOptions] (val x: Self) extends AnyVal {
    
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
    def setAppend(value: Boolean): Self = this.set("append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
  }
}
