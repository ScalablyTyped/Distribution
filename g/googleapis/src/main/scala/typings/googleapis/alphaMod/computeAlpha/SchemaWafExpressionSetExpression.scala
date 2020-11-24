package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaWafExpressionSetExpression extends js.Object {
  
  /**
    * Expression ID should uniquely identify the origin of the expression. E.g.
    * owasp-crs-v020901-id973337 identifies Owasp core rule set version 2.9.1
    * rule id 973337. The ID could be used to determine the individual attack
    * definition that has been detected. It could also be used to exclude it
    * from the policy in case of false positive.
    */
  var id: js.UndefOr[String] = js.native
}
object SchemaWafExpressionSetExpression {
  
  @scala.inline
  def apply(): SchemaWafExpressionSetExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWafExpressionSetExpression]
  }
  
  @scala.inline
  implicit class SchemaWafExpressionSetExpressionOps[Self <: SchemaWafExpressionSetExpression] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
