package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All fields defined in a principal are ANDed.
  */
@js.native
trait SchemaPrincipal extends js.Object {
  
  /**
    * An expression to specify custom condition.
    */
  var condition: js.UndefOr[String] = js.native
  
  /**
    * The groups the principal belongs to. Exact match, prefix match, and
    * suffix match are supported.
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * IPv4 or IPv6 address or range (In CIDR format)
    */
  var ips: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The namespaces. Exact match, prefix match, and suffix match are
    * supported.
    */
  var namespaces: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Negate of groups. Specifies exclusions.
    */
  var notGroups: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Negate of IPs. Specifies exclusions.
    */
  var notIps: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Negate of namespaces. Specifies exclusions.
    */
  var notNamespaces: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Negate of users. Specifies exclusions.
    */
  var notUsers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A map of Istio attribute to expected values. Exact match, prefix match,
    * and suffix match are supported for values. For example,
    * `request.headers[version]: ?v1?`. The properties are ANDed together.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The user names/IDs or service accounts. Exact match, prefix match, and
    * suffix match are supported.
    */
  var users: js.UndefOr[js.Array[String]] = js.native
}
object SchemaPrincipal {
  
  @scala.inline
  def apply(): SchemaPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrincipal]
  }
  
  @scala.inline
  implicit class SchemaPrincipalOps[Self <: SchemaPrincipal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setIpsVarargs(value: String*): Self = this.set("ips", js.Array(value :_*))
    
    @scala.inline
    def setIps(value: js.Array[String]): Self = this.set("ips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIps: Self = this.set("ips", js.undefined)
    
    @scala.inline
    def setNamespacesVarargs(value: String*): Self = this.set("namespaces", js.Array(value :_*))
    
    @scala.inline
    def setNamespaces(value: js.Array[String]): Self = this.set("namespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaces: Self = this.set("namespaces", js.undefined)
    
    @scala.inline
    def setNotGroupsVarargs(value: String*): Self = this.set("notGroups", js.Array(value :_*))
    
    @scala.inline
    def setNotGroups(value: js.Array[String]): Self = this.set("notGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotGroups: Self = this.set("notGroups", js.undefined)
    
    @scala.inline
    def setNotIpsVarargs(value: String*): Self = this.set("notIps", js.Array(value :_*))
    
    @scala.inline
    def setNotIps(value: js.Array[String]): Self = this.set("notIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotIps: Self = this.set("notIps", js.undefined)
    
    @scala.inline
    def setNotNamespacesVarargs(value: String*): Self = this.set("notNamespaces", js.Array(value :_*))
    
    @scala.inline
    def setNotNamespaces(value: js.Array[String]): Self = this.set("notNamespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotNamespaces: Self = this.set("notNamespaces", js.undefined)
    
    @scala.inline
    def setNotUsersVarargs(value: String*): Self = this.set("notUsers", js.Array(value :_*))
    
    @scala.inline
    def setNotUsers(value: js.Array[String]): Self = this.set("notUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotUsers: Self = this.set("notUsers", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: String*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[String]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
}
