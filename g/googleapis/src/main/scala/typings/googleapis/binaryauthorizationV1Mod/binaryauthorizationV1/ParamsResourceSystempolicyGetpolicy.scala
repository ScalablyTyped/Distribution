package typings.googleapis.binaryauthorizationV1Mod.binaryauthorizationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSystempolicyGetpolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name, in the format `locations/x/policy`. Note that the system policy is not associated with a project.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceSystempolicyGetpolicy {
  
  inline def apply(): ParamsResourceSystempolicyGetpolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSystempolicyGetpolicy]
  }
  
  extension [Self <: ParamsResourceSystempolicyGetpolicy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
