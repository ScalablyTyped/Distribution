package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAclInfo extends StObject {
  
  /**
    * Number of groups which have at least read access to the document.
    */
  var groupsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The scope to which the content was shared.
    */
  var scope: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of users which have at least read access to the document.
    */
  var usersCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAclInfo {
  
  inline def apply(): SchemaAclInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAclInfo]
  }
  
  extension [Self <: SchemaAclInfo](x: Self) {
    
    inline def setGroupsCount(value: Double): Self = StObject.set(x, "groupsCount", value.asInstanceOf[js.Any])
    
    inline def setGroupsCountNull: Self = StObject.set(x, "groupsCount", null)
    
    inline def setGroupsCountUndefined: Self = StObject.set(x, "groupsCount", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setUsersCount(value: Double): Self = StObject.set(x, "usersCount", value.asInstanceOf[js.Any])
    
    inline def setUsersCountNull: Self = StObject.set(x, "usersCount", null)
    
    inline def setUsersCountUndefined: Self = StObject.set(x, "usersCount", js.undefined)
  }
}
