package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of an operation or a custom query
  */
trait CapabilityStatementRestOperation
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * The defined operation/query
    */
  var definition: Reference
  
  /**
    * Name by which the operation/query is invoked
    */
  var name: String
}
object CapabilityStatementRestOperation {
  
  inline def apply(definition: Reference, name: String): CapabilityStatementRestOperation = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestOperation]
  }
  
  extension [Self <: CapabilityStatementRestOperation](x: Self) {
    
    inline def setDefinition(value: Reference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
