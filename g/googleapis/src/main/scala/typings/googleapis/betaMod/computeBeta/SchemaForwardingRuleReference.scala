package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaForwardingRuleReference extends StObject {
  
  var forwardingRule: js.UndefOr[String] = js.native
}
object SchemaForwardingRuleReference {
  
  @scala.inline
  def apply(): SchemaForwardingRuleReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForwardingRuleReference]
  }
  
  @scala.inline
  implicit class SchemaForwardingRuleReferenceMutableBuilder[Self <: SchemaForwardingRuleReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForwardingRule(value: String): Self = StObject.set(x, "forwardingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardingRuleUndefined: Self = StObject.set(x, "forwardingRule", js.undefined)
  }
}
