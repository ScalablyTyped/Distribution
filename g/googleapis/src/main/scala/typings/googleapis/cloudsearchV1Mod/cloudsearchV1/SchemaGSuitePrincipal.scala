package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGSuitePrincipal extends StObject {
  
  /**
    * This principal represents all users of the Google Workspace domain of the customer.
    */
  var gsuiteDomain: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This principal references a Google Workspace group name.
    */
  var gsuiteGroupEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This principal references a Google Workspace user account.
    */
  var gsuiteUserEmail: js.UndefOr[String | Null] = js.undefined
}
object SchemaGSuitePrincipal {
  
  inline def apply(): SchemaGSuitePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGSuitePrincipal]
  }
  
  extension [Self <: SchemaGSuitePrincipal](x: Self) {
    
    inline def setGsuiteDomain(value: Boolean): Self = StObject.set(x, "gsuiteDomain", value.asInstanceOf[js.Any])
    
    inline def setGsuiteDomainNull: Self = StObject.set(x, "gsuiteDomain", null)
    
    inline def setGsuiteDomainUndefined: Self = StObject.set(x, "gsuiteDomain", js.undefined)
    
    inline def setGsuiteGroupEmail(value: String): Self = StObject.set(x, "gsuiteGroupEmail", value.asInstanceOf[js.Any])
    
    inline def setGsuiteGroupEmailNull: Self = StObject.set(x, "gsuiteGroupEmail", null)
    
    inline def setGsuiteGroupEmailUndefined: Self = StObject.set(x, "gsuiteGroupEmail", js.undefined)
    
    inline def setGsuiteUserEmail(value: String): Self = StObject.set(x, "gsuiteUserEmail", value.asInstanceOf[js.Any])
    
    inline def setGsuiteUserEmailNull: Self = StObject.set(x, "gsuiteUserEmail", null)
    
    inline def setGsuiteUserEmailUndefined: Self = StObject.set(x, "gsuiteUserEmail", js.undefined)
  }
}
