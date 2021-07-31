package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All fields defined in a principal are ANDed.
  */
trait SchemaPrincipal extends StObject {
  
  /**
    * An expression to specify custom condition.
    */
  var condition: js.UndefOr[String] = js.undefined
  
  /**
    * The groups the principal belongs to. Exact match, prefix match, and
    * suffix match are supported.
    */
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * IPv4 or IPv6 address or range (In CIDR format)
    */
  var ips: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The namespaces. Exact match, prefix match, and suffix match are
    * supported.
    */
  var namespaces: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Negate of groups. Specifies exclusions.
    */
  var notGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Negate of IPs. Specifies exclusions.
    */
  var notIps: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Negate of namespaces. Specifies exclusions.
    */
  var notNamespaces: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Negate of users. Specifies exclusions.
    */
  var notUsers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A map of Istio attribute to expected values. Exact match, prefix match,
    * and suffix match are supported for values. For example,
    * `request.headers[version]: ?v1?`. The properties are ANDed together.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The user names/IDs or service accounts. Exact match, prefix match, and
    * suffix match are supported.
    */
  var users: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaPrincipal {
  
  @scala.inline
  def apply(): SchemaPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrincipal]
  }
  
  @scala.inline
  implicit class SchemaPrincipalMutableBuilder[Self <: SchemaPrincipal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setIps(value: js.Array[String]): Self = StObject.set(x, "ips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpsUndefined: Self = StObject.set(x, "ips", js.undefined)
    
    @scala.inline
    def setIpsVarargs(value: String*): Self = StObject.set(x, "ips", js.Array(value :_*))
    
    @scala.inline
    def setNamespaces(value: js.Array[String]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
    
    @scala.inline
    def setNamespacesVarargs(value: String*): Self = StObject.set(x, "namespaces", js.Array(value :_*))
    
    @scala.inline
    def setNotGroups(value: js.Array[String]): Self = StObject.set(x, "notGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotGroupsUndefined: Self = StObject.set(x, "notGroups", js.undefined)
    
    @scala.inline
    def setNotGroupsVarargs(value: String*): Self = StObject.set(x, "notGroups", js.Array(value :_*))
    
    @scala.inline
    def setNotIps(value: js.Array[String]): Self = StObject.set(x, "notIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotIpsUndefined: Self = StObject.set(x, "notIps", js.undefined)
    
    @scala.inline
    def setNotIpsVarargs(value: String*): Self = StObject.set(x, "notIps", js.Array(value :_*))
    
    @scala.inline
    def setNotNamespaces(value: js.Array[String]): Self = StObject.set(x, "notNamespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotNamespacesUndefined: Self = StObject.set(x, "notNamespaces", js.undefined)
    
    @scala.inline
    def setNotNamespacesVarargs(value: String*): Self = StObject.set(x, "notNamespaces", js.Array(value :_*))
    
    @scala.inline
    def setNotUsers(value: js.Array[String]): Self = StObject.set(x, "notUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotUsersUndefined: Self = StObject.set(x, "notUsers", js.undefined)
    
    @scala.inline
    def setNotUsersVarargs(value: String*): Self = StObject.set(x, "notUsers", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
