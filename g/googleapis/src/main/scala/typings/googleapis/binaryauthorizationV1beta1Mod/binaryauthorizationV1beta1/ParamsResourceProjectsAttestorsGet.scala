package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAttestorsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the attestor to retrieve, in the format `projects/x/attestors/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAttestorsGet {
  
  inline def apply(): ParamsResourceProjectsAttestorsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAttestorsGet]
  }
  
  extension [Self <: ParamsResourceProjectsAttestorsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
