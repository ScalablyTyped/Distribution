package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityFieldRule extends StObject {
  
  var dn: js.UndefOr[Names] = js.undefined
  
  var groups: js.UndefOr[Names] = js.undefined
  
  var metadata: js.UndefOr[Any] = js.undefined
  
  var realm: js.UndefOr[SecurityRealm] = js.undefined
  
  var username: js.UndefOr[Name] = js.undefined
}
object SecurityFieldRule {
  
  inline def apply(): SecurityFieldRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityFieldRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityFieldRule] (val x: Self) extends AnyVal {
    
    inline def setDn(value: Names): Self = StObject.set(x, "dn", value.asInstanceOf[js.Any])
    
    inline def setDnUndefined: Self = StObject.set(x, "dn", js.undefined)
    
    inline def setDnVarargs(value: Name*): Self = StObject.set(x, "dn", js.Array(value*))
    
    inline def setGroups(value: Names): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: Name*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRealm(value: SecurityRealm): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    
    inline def setUsername(value: Name): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
