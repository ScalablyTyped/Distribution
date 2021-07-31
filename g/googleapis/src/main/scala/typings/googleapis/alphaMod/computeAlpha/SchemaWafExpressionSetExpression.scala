package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWafExpressionSetExpression extends StObject {
  
  /**
    * Expression ID should uniquely identify the origin of the expression. E.g.
    * owasp-crs-v020901-id973337 identifies Owasp core rule set version 2.9.1
    * rule id 973337. The ID could be used to determine the individual attack
    * definition that has been detected. It could also be used to exclude it
    * from the policy in case of false positive.
    */
  var id: js.UndefOr[String] = js.undefined
}
object SchemaWafExpressionSetExpression {
  
  @scala.inline
  def apply(): SchemaWafExpressionSetExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWafExpressionSetExpression]
  }
  
  @scala.inline
  implicit class SchemaWafExpressionSetExpressionMutableBuilder[Self <: SchemaWafExpressionSetExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
