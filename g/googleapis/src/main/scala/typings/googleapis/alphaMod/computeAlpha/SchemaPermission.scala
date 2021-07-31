package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All fields defined in a permission are ANDed.
  */
trait SchemaPermission extends StObject {
  
  /**
    * Extra custom constraints. The constraints are ANDed together.
    */
  var constraints: js.UndefOr[js.Array[SchemaPermissionConstraint]] = js.undefined
  
  /**
    * Used in Ingress or Egress Gateway cases to specify hosts that the policy
    * applies to. Exact match, prefix match, and suffix match are supported.
    */
  var hosts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * HTTP method.
    */
  var methods: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Negate of hosts. Specifies exclusions.
    */
  var notHosts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Negate of methods. Specifies exclusions.
    */
  var notMethods: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Negate of paths. Specifies exclusions.
    */
  var notPaths: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Negate of ports. Specifies exclusions.
    */
  var notPorts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * HTTP request paths or gRPC methods. Exact match, prefix match, and suffix
    * match are supported.
    */
  var paths: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Port names or numbers.
    */
  var ports: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaPermission {
  
  @scala.inline
  def apply(): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermission]
  }
  
  @scala.inline
  implicit class SchemaPermissionMutableBuilder[Self <: SchemaPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraints(value: js.Array[SchemaPermissionConstraint]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    @scala.inline
    def setConstraintsVarargs(value: SchemaPermissionConstraint*): Self = StObject.set(x, "constraints", js.Array(value :_*))
    
    @scala.inline
    def setHosts(value: js.Array[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
    
    @scala.inline
    def setHostsVarargs(value: String*): Self = StObject.set(x, "hosts", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    @scala.inline
    def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
    
    @scala.inline
    def setNotHosts(value: js.Array[String]): Self = StObject.set(x, "notHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotHostsUndefined: Self = StObject.set(x, "notHosts", js.undefined)
    
    @scala.inline
    def setNotHostsVarargs(value: String*): Self = StObject.set(x, "notHosts", js.Array(value :_*))
    
    @scala.inline
    def setNotMethods(value: js.Array[String]): Self = StObject.set(x, "notMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotMethodsUndefined: Self = StObject.set(x, "notMethods", js.undefined)
    
    @scala.inline
    def setNotMethodsVarargs(value: String*): Self = StObject.set(x, "notMethods", js.Array(value :_*))
    
    @scala.inline
    def setNotPaths(value: js.Array[String]): Self = StObject.set(x, "notPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotPathsUndefined: Self = StObject.set(x, "notPaths", js.undefined)
    
    @scala.inline
    def setNotPathsVarargs(value: String*): Self = StObject.set(x, "notPaths", js.Array(value :_*))
    
    @scala.inline
    def setNotPorts(value: js.Array[String]): Self = StObject.set(x, "notPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotPortsUndefined: Self = StObject.set(x, "notPorts", js.undefined)
    
    @scala.inline
    def setNotPortsVarargs(value: String*): Self = StObject.set(x, "notPorts", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: js.Array[String]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: String*): Self = StObject.set(x, "ports", js.Array(value :_*))
  }
}
