package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterExpression extends js.Object {
  
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  var expressionValue: js.UndefOr[String] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var fieldIndex: js.UndefOr[Double] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var matchType: js.UndefOr[String] = js.native
}
object FilterExpression {
  
  @scala.inline
  def apply(): FilterExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterExpression]
  }
  
  @scala.inline
  implicit class FilterExpressionOps[Self <: FilterExpression] (val x: Self) extends AnyVal {
    
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setExpressionValue(value: String): Self = this.set("expressionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionValue: Self = this.set("expressionValue", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFieldIndex(value: Double): Self = this.set("fieldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldIndex: Self = this.set("fieldIndex", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMatchType(value: String): Self = this.set("matchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchType: Self = this.set("matchType", js.undefined)
  }
}
