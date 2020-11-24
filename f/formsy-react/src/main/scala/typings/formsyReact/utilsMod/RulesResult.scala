package typings.formsyReact.utilsMod

import typings.formsyReact.interfacesMod.ValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulesResult extends js.Object {
  
  var errors: js.Array[ValidationError] = js.native
  
  var failed: js.Array[String] = js.native
  
  var success: js.Array[String] = js.native
}
object RulesResult {
  
  @scala.inline
  def apply(errors: js.Array[ValidationError], failed: js.Array[String], success: js.Array[String]): RulesResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesResult]
  }
  
  @scala.inline
  implicit class RulesResultOps[Self <: RulesResult] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: ValidationError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[ValidationError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedVarargs(value: String*): Self = this.set("failed", js.Array(value :_*))
    
    @scala.inline
    def setFailed(value: js.Array[String]): Self = this.set("failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessVarargs(value: String*): Self = this.set("success", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: js.Array[String]): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
