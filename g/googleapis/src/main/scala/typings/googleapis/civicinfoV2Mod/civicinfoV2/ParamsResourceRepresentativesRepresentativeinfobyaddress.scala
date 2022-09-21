package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRepresentativesRepresentativeinfobyaddress
  extends StObject
     with StandardParameters {
  
  /**
    * The address to look up. May only be specified if the field ocdId is not given in the URL
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to return information about offices and officials. If false, only the top-level district information will be returned.
    */
  var includeOffices: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of office levels to filter by. Only offices that serve at least one of these levels will be returned. Divisions that don't contain a matching office will not be returned.
    */
  var levels: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of office roles to filter by. Only offices fulfilling one of these roles will be returned. Divisions that don't contain a matching office will not be returned.
    */
  var roles: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceRepresentativesRepresentativeinfobyaddress {
  
  inline def apply(): ParamsResourceRepresentativesRepresentativeinfobyaddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRepresentativesRepresentativeinfobyaddress]
  }
  
  extension [Self <: ParamsResourceRepresentativesRepresentativeinfobyaddress](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setIncludeOffices(value: Boolean): Self = StObject.set(x, "includeOffices", value.asInstanceOf[js.Any])
    
    inline def setIncludeOfficesUndefined: Self = StObject.set(x, "includeOffices", js.undefined)
    
    inline def setLevels(value: js.Array[String]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setLevelsVarargs(value: String*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}
