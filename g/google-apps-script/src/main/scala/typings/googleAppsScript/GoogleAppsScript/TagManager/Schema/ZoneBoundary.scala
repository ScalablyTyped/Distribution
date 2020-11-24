package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoneBoundary extends js.Object {
  
  var condition: js.UndefOr[js.Array[Condition]] = js.native
  
  var customEvaluationTriggerId: js.UndefOr[js.Array[String]] = js.native
}
object ZoneBoundary {
  
  @scala.inline
  def apply(): ZoneBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneBoundary]
  }
  
  @scala.inline
  implicit class ZoneBoundaryOps[Self <: ZoneBoundary] (val x: Self) extends AnyVal {
    
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
    def setConditionVarargs(value: Condition*): Self = this.set("condition", js.Array(value :_*))
    
    @scala.inline
    def setCondition(value: js.Array[Condition]): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setCustomEvaluationTriggerIdVarargs(value: String*): Self = this.set("customEvaluationTriggerId", js.Array(value :_*))
    
    @scala.inline
    def setCustomEvaluationTriggerId(value: js.Array[String]): Self = this.set("customEvaluationTriggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEvaluationTriggerId: Self = this.set("customEvaluationTriggerId", js.undefined)
  }
}
