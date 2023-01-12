package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseGetRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var accept_enterprise: js.UndefOr[Boolean] = js.undefined
  
  var local: js.UndefOr[Boolean] = js.undefined
}
object LicenseGetRequest {
  
  inline def apply(): LicenseGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseGetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicenseGetRequest] (val x: Self) extends AnyVal {
    
    inline def setAccept_enterprise(value: Boolean): Self = StObject.set(x, "accept_enterprise", value.asInstanceOf[js.Any])
    
    inline def setAccept_enterpriseUndefined: Self = StObject.set(x, "accept_enterprise", js.undefined)
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
  }
}
