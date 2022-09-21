package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrincipal extends StObject {
  
  /**
    * An expression to specify custom condition.
    */
  var condition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The groups the principal belongs to. Exact match, prefix match, and suffix match are supported.
    */
  var groups: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * IPv4 or IPv6 address or range (In CIDR format)
    */
  var ips: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The namespaces. Exact match, prefix match, and suffix match are supported.
    */
  var namespaces: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Negate of groups. Specifies exclusions.
    */
  var notGroups: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Negate of IPs. Specifies exclusions.
    */
  var notIps: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Negate of namespaces. Specifies exclusions.
    */
  var notNamespaces: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Negate of users. Specifies exclusions.
    */
  var notUsers: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A map of Istio attribute to expected values. Exact match, prefix match, and suffix match are supported for values. For example, `request.headers[version]: "v1"`. The properties are ANDed together.
    */
  var properties: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The user names/IDs or service accounts. Exact match, prefix match, and suffix match are supported.
    */
  var users: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaPrincipal {
  
  inline def apply(): SchemaPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrincipal]
  }
  
  extension [Self <: SchemaPrincipal](x: Self) {
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionNull: Self = StObject.set(x, "condition", null)
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsNull: Self = StObject.set(x, "groups", null)
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setIps(value: js.Array[String]): Self = StObject.set(x, "ips", value.asInstanceOf[js.Any])
    
    inline def setIpsNull: Self = StObject.set(x, "ips", null)
    
    inline def setIpsUndefined: Self = StObject.set(x, "ips", js.undefined)
    
    inline def setIpsVarargs(value: String*): Self = StObject.set(x, "ips", js.Array(value*))
    
    inline def setNamespaces(value: js.Array[String]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    inline def setNamespacesNull: Self = StObject.set(x, "namespaces", null)
    
    inline def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
    
    inline def setNamespacesVarargs(value: String*): Self = StObject.set(x, "namespaces", js.Array(value*))
    
    inline def setNotGroups(value: js.Array[String]): Self = StObject.set(x, "notGroups", value.asInstanceOf[js.Any])
    
    inline def setNotGroupsNull: Self = StObject.set(x, "notGroups", null)
    
    inline def setNotGroupsUndefined: Self = StObject.set(x, "notGroups", js.undefined)
    
    inline def setNotGroupsVarargs(value: String*): Self = StObject.set(x, "notGroups", js.Array(value*))
    
    inline def setNotIps(value: js.Array[String]): Self = StObject.set(x, "notIps", value.asInstanceOf[js.Any])
    
    inline def setNotIpsNull: Self = StObject.set(x, "notIps", null)
    
    inline def setNotIpsUndefined: Self = StObject.set(x, "notIps", js.undefined)
    
    inline def setNotIpsVarargs(value: String*): Self = StObject.set(x, "notIps", js.Array(value*))
    
    inline def setNotNamespaces(value: js.Array[String]): Self = StObject.set(x, "notNamespaces", value.asInstanceOf[js.Any])
    
    inline def setNotNamespacesNull: Self = StObject.set(x, "notNamespaces", null)
    
    inline def setNotNamespacesUndefined: Self = StObject.set(x, "notNamespaces", js.undefined)
    
    inline def setNotNamespacesVarargs(value: String*): Self = StObject.set(x, "notNamespaces", js.Array(value*))
    
    inline def setNotUsers(value: js.Array[String]): Self = StObject.set(x, "notUsers", value.asInstanceOf[js.Any])
    
    inline def setNotUsersNull: Self = StObject.set(x, "notUsers", null)
    
    inline def setNotUsersUndefined: Self = StObject.set(x, "notUsers", js.undefined)
    
    inline def setNotUsersVarargs(value: String*): Self = StObject.set(x, "notUsers", js.Array(value*))
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersNull: Self = StObject.set(x, "users", null)
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
