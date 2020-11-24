package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlmGetLifecycle extends Generic {
  
  var policy_id: js.UndefOr[String | js.Array[String]] = js.native
}
object SlmGetLifecycle {
  
  @scala.inline
  def apply(): SlmGetLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlmGetLifecycle]
  }
  
  @scala.inline
  implicit class SlmGetLifecycleOps[Self <: SlmGetLifecycle] (val x: Self) extends AnyVal {
    
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
    def setPolicy_idVarargs(value: String*): Self = this.set("policy_id", js.Array(value :_*))
    
    @scala.inline
    def setPolicy_id(value: String | js.Array[String]): Self = this.set("policy_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy_id: Self = this.set("policy_id", js.undefined)
  }
}
