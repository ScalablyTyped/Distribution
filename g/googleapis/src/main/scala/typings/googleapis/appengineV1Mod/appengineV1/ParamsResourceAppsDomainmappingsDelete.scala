package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsDomainmappingsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. Name of the resource to delete. Example: apps/myapp/domainMappings/example.com.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var domainMappingsId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsDomainmappingsDelete {
  
  inline def apply(): ParamsResourceAppsDomainmappingsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsDomainmappingsDelete]
  }
  
  extension [Self <: ParamsResourceAppsDomainmappingsDelete](x: Self) {
    
    inline def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    inline def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    inline def setDomainMappingsId(value: String): Self = StObject.set(x, "domainMappingsId", value.asInstanceOf[js.Any])
    
    inline def setDomainMappingsIdUndefined: Self = StObject.set(x, "domainMappingsId", js.undefined)
  }
}
