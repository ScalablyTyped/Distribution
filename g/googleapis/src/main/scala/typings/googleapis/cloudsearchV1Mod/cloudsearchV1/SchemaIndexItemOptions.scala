package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIndexItemOptions extends StObject {
  
  /**
    * Specifies if the index request should allow Google Workspace principals that do not exist or are deleted.
    */
  var allowUnknownGsuitePrincipals: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaIndexItemOptions {
  
  inline def apply(): SchemaIndexItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndexItemOptions]
  }
  
  extension [Self <: SchemaIndexItemOptions](x: Self) {
    
    inline def setAllowUnknownGsuitePrincipals(value: Boolean): Self = StObject.set(x, "allowUnknownGsuitePrincipals", value.asInstanceOf[js.Any])
    
    inline def setAllowUnknownGsuitePrincipalsNull: Self = StObject.set(x, "allowUnknownGsuitePrincipals", null)
    
    inline def setAllowUnknownGsuitePrincipalsUndefined: Self = StObject.set(x, "allowUnknownGsuitePrincipals", js.undefined)
  }
}
