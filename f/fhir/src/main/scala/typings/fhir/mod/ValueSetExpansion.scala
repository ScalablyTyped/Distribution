package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSetExpansion
  extends StObject
     with BackboneElement {
  
  var _identifier: js.UndefOr[Element] = js.undefined
  
  var _timestamp: js.UndefOr[Element] = js.undefined
  
  /**
    * The codes that are contained in the value set expansion.
    */
  var contains: js.UndefOr[js.Array[ValueSetExpansionContains]] = js.undefined
  
  /**
    * An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so.
    */
  var identifier: String
  
  /**
    * If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.
    */
  var parameter: js.UndefOr[js.Array[ValueSetExpansionParameter]] = js.undefined
  
  /**
    * The time at which the expansion was produced by the expanding system.
    */
  var timestamp: String
  
  /**
    * The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter.
    */
  var total: js.UndefOr[Double] = js.undefined
}
object ValueSetExpansion {
  
  inline def apply(identifier: String, timestamp: String): ValueSetExpansion = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetExpansion]
  }
  
  extension [Self <: ValueSetExpansion](x: Self) {
    
    inline def setContains(value: js.Array[ValueSetExpansionContains]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setContainsVarargs(value: ValueSetExpansionContains*): Self = StObject.set(x, "contains", js.Array(value*))
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setParameter(value: js.Array[ValueSetExpansionParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setParameterVarargs(value: ValueSetExpansionParameter*): Self = StObject.set(x, "parameter", js.Array(value*))
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def set_identifier(value: Element): Self = StObject.set(x, "_identifier", value.asInstanceOf[js.Any])
    
    inline def set_identifierUndefined: Self = StObject.set(x, "_identifier", js.undefined)
    
    inline def set_timestamp(value: Element): Self = StObject.set(x, "_timestamp", value.asInstanceOf[js.Any])
    
    inline def set_timestampUndefined: Self = StObject.set(x, "_timestamp", js.undefined)
  }
}
