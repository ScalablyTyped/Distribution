package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDnsauthorizationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the dns authorization to describe. Must be in the format `projects/x/locations/x/dnsAuthorizations/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDnsauthorizationsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsDnsauthorizationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDnsauthorizationsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDnsauthorizationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
