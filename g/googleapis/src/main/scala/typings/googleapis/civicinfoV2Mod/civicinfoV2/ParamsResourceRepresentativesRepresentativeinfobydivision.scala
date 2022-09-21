package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRepresentativesRepresentativeinfobydivision
  extends StObject
     with StandardParameters {
  
  /**
    * A list of office levels to filter by. Only offices that serve at least one of these levels will be returned. Divisions that don't contain a matching office will not be returned.
    */
  var levels: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The Open Civic Data division identifier of the division to look up.
    */
  var ocdId: js.UndefOr[String] = js.undefined
  
  /**
    * If true, information about all divisions contained in the division requested will be included as well. For example, if querying ocd-division/country:us/district:dc, this would also return all DC's wards and ANCs.
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of office roles to filter by. Only offices fulfilling one of these roles will be returned. Divisions that don't contain a matching office will not be returned.
    */
  var roles: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceRepresentativesRepresentativeinfobydivision {
  
  inline def apply(): ParamsResourceRepresentativesRepresentativeinfobydivision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRepresentativesRepresentativeinfobydivision]
  }
  
  extension [Self <: ParamsResourceRepresentativesRepresentativeinfobydivision](x: Self) {
    
    inline def setLevels(value: js.Array[String]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setLevelsVarargs(value: String*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setOcdId(value: String): Self = StObject.set(x, "ocdId", value.asInstanceOf[js.Any])
    
    inline def setOcdIdUndefined: Self = StObject.set(x, "ocdId", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}
