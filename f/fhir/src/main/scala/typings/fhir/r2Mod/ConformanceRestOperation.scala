package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformanceRestOperation
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Where the formal definition can be found.
    */
  var definition: Reference
  
  /**
    * The name of a query, which is used in the _query parameter when the query is called.
    */
  var name: String
}
object ConformanceRestOperation {
  
  inline def apply(definition: Reference, name: String): ConformanceRestOperation = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformanceRestOperation]
  }
  
  extension [Self <: ConformanceRestOperation](x: Self) {
    
    inline def setDefinition(value: Reference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
