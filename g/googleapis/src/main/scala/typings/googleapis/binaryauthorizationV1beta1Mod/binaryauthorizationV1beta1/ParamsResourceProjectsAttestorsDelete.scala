package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAttestorsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the attestors to delete, in the format `projects/x/attestors/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAttestorsDelete {
  
  inline def apply(): ParamsResourceProjectsAttestorsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAttestorsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsAttestorsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
