package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All fields defined in a permission are ANDed.
  */
@js.native
trait SchemaPermission extends js.Object {
  
  /**
    * Extra custom constraints. The constraints are ANDed together.
    */
  var constraints: js.UndefOr[js.Array[SchemaPermissionConstraint]] = js.native
  
  /**
    * Used in Ingress or Egress Gateway cases to specify hosts that the policy
    * applies to. Exact match, prefix match, and suffix match are supported.
    */
  var hosts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * HTTP method.
    */
  var methods: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Negate of hosts. Specifies exclusions.
    */
  var notHosts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Negate of methods. Specifies exclusions.
    */
  var notMethods: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Negate of paths. Specifies exclusions.
    */
  var notPaths: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Negate of ports. Specifies exclusions.
    */
  var notPorts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * HTTP request paths or gRPC methods. Exact match, prefix match, and suffix
    * match are supported.
    */
  var paths: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Port names or numbers.
    */
  var ports: js.UndefOr[js.Array[String]] = js.native
}
object SchemaPermission {
  
  @scala.inline
  def apply(): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermission]
  }
  
  @scala.inline
  implicit class SchemaPermissionOps[Self <: SchemaPermission] (val x: Self) extends AnyVal {
    
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
    def setConstraintsVarargs(value: SchemaPermissionConstraint*): Self = this.set("constraints", js.Array(value :_*))
    
    @scala.inline
    def setConstraints(value: js.Array[SchemaPermissionConstraint]): Self = this.set("constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    
    @scala.inline
    def setHostsVarargs(value: String*): Self = this.set("hosts", js.Array(value :_*))
    
    @scala.inline
    def setHosts(value: js.Array[String]): Self = this.set("hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHosts: Self = this.set("hosts", js.undefined)
    
    @scala.inline
    def setMethodsVarargs(value: String*): Self = this.set("methods", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: js.Array[String]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setNotHostsVarargs(value: String*): Self = this.set("notHosts", js.Array(value :_*))
    
    @scala.inline
    def setNotHosts(value: js.Array[String]): Self = this.set("notHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotHosts: Self = this.set("notHosts", js.undefined)
    
    @scala.inline
    def setNotMethodsVarargs(value: String*): Self = this.set("notMethods", js.Array(value :_*))
    
    @scala.inline
    def setNotMethods(value: js.Array[String]): Self = this.set("notMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotMethods: Self = this.set("notMethods", js.undefined)
    
    @scala.inline
    def setNotPathsVarargs(value: String*): Self = this.set("notPaths", js.Array(value :_*))
    
    @scala.inline
    def setNotPaths(value: js.Array[String]): Self = this.set("notPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotPaths: Self = this.set("notPaths", js.undefined)
    
    @scala.inline
    def setNotPortsVarargs(value: String*): Self = this.set("notPorts", js.Array(value :_*))
    
    @scala.inline
    def setNotPorts(value: js.Array[String]): Self = this.set("notPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotPorts: Self = this.set("notPorts", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: String*): Self = this.set("ports", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: js.Array[String]): Self = this.set("ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePorts: Self = this.set("ports", js.undefined)
  }
}
