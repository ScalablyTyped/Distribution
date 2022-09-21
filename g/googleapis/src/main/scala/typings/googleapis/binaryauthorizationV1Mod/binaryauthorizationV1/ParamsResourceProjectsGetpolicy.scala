package typings.googleapis.binaryauthorizationV1Mod.binaryauthorizationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetpolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the policy to retrieve, in the format `projects/x/policy`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGetpolicy {
  
  inline def apply(): ParamsResourceProjectsGetpolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetpolicy]
  }
  
  extension [Self <: ParamsResourceProjectsGetpolicy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
