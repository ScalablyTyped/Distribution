package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationDefinitionParameterReferencedFrom
  extends StObject
     with BackboneElement {
  
  var _source: js.UndefOr[Element] = js.undefined
  
  var _sourceId: js.UndefOr[Element] = js.undefined
  
  /**
    * The name of the parameter or dot-separated path of parameter names pointing to the resource parameter that is expected to contain a reference to this resource.
    */
  var source: String
  
  /**
    * The id of the element in the referencing resource that is expected to resolve to this resource.
    */
  var sourceId: js.UndefOr[String] = js.undefined
}
object OperationDefinitionParameterReferencedFrom {
  
  inline def apply(source: String): OperationDefinitionParameterReferencedFrom = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDefinitionParameterReferencedFrom]
  }
  
  extension [Self <: OperationDefinitionParameterReferencedFrom](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    inline def set_source(value: Element): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceId(value: Element): Self = StObject.set(x, "_sourceId", value.asInstanceOf[js.Any])
    
    inline def set_sourceIdUndefined: Self = StObject.set(x, "_sourceId", js.undefined)
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
  }
}
