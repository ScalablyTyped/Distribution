package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDnsauthorizationsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the dns authorization to delete. Must be in the format `projects/x/locations/x/dnsAuthorizations/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDnsauthorizationsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsDnsauthorizationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDnsauthorizationsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDnsauthorizationsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
