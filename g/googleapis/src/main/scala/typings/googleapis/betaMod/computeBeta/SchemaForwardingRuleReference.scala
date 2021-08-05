package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaForwardingRuleReference extends StObject {
  
  var forwardingRule: js.UndefOr[String] = js.undefined
}
object SchemaForwardingRuleReference {
  
  inline def apply(): SchemaForwardingRuleReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForwardingRuleReference]
  }
  
  extension [Self <: SchemaForwardingRuleReference](x: Self) {
    
    inline def setForwardingRule(value: String): Self = StObject.set(x, "forwardingRule", value.asInstanceOf[js.Any])
    
    inline def setForwardingRuleUndefined: Self = StObject.set(x, "forwardingRule", js.undefined)
  }
}
