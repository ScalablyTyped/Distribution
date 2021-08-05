package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Operation Request or Response
  */
trait Parameters
  extends StObject
     with ResourceBase
     with Resource {
  
  /**
    * Operation Parameter
    */
  var parameter: js.UndefOr[js.Array[ParametersParameter]] = js.undefined
}
object Parameters {
  
  inline def apply(): Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameters]
  }
  
  extension [Self <: Parameters](x: Self) {
    
    inline def setParameter(value: js.Array[ParametersParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setParameterVarargs(value: ParametersParameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
  }
}
