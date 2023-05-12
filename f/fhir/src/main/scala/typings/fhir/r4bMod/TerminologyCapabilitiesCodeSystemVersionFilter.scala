package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminologyCapabilitiesCodeSystemVersionFilter
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _op: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Code of the property supported.
    */
  var code: String
  
  /**
    * Operations supported for the property.
    */
  var op: js.Array[String]
}
object TerminologyCapabilitiesCodeSystemVersionFilter {
  
  inline def apply(code: String, op: js.Array[String]): TerminologyCapabilitiesCodeSystemVersionFilter = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminologyCapabilitiesCodeSystemVersionFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerminologyCapabilitiesCodeSystemVersionFilter] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setOp(value: js.Array[String]): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpVarargs(value: String*): Self = StObject.set(x, "op", js.Array(value*))
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_op(value: js.Array[Element]): Self = StObject.set(x, "_op", value.asInstanceOf[js.Any])
    
    inline def set_opUndefined: Self = StObject.set(x, "_op", js.undefined)
    
    inline def set_opVarargs(value: Element*): Self = StObject.set(x, "_op", js.Array(value*))
  }
}
