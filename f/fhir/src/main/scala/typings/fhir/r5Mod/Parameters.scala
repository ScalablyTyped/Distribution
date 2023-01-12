package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters
  extends StObject
     with Resource
     with _FhirResource {
  
  /**
    * A parameter passed to or received from the operation.
    */
  var parameter: js.UndefOr[js.Array[ParametersParameter]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Parameters: typings.fhir.fhirStrings.Parameters
}
object Parameters {
  
  inline def apply(): Parameters = {
    val __obj = js.Dynamic.literal(resourceType = "Parameters")
    __obj.asInstanceOf[Parameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
    
    inline def setParameter(value: js.Array[ParametersParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setParameterVarargs(value: ParametersParameter*): Self = StObject.set(x, "parameter", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Parameters): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
