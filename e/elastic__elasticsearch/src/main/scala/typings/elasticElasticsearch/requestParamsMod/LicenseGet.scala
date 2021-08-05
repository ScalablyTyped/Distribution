package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseGet
  extends StObject
     with Generic {
  
  var accept_enterprise: js.UndefOr[Boolean] = js.undefined
  
  var local: js.UndefOr[Boolean] = js.undefined
}
object LicenseGet {
  
  inline def apply(): LicenseGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseGet]
  }
  
  extension [Self <: LicenseGet](x: Self) {
    
    inline def setAccept_enterprise(value: Boolean): Self = StObject.set(x, "accept_enterprise", value.asInstanceOf[js.Any])
    
    inline def setAccept_enterpriseUndefined: Self = StObject.set(x, "accept_enterprise", js.undefined)
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
  }
}
