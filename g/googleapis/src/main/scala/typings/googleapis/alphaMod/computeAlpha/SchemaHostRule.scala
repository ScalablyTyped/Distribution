package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHostRule extends StObject {
  
  /**
    * An optional description of this resource. Provide this property when you create the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character, and if followed by anything, the immediate following character must be either - or .. * based matching is not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
    */
  var hosts: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion.
    */
  var pathMatcher: js.UndefOr[String | Null] = js.undefined
}
object SchemaHostRule {
  
  inline def apply(): SchemaHostRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHostRule]
  }
  
  extension [Self <: SchemaHostRule](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHosts(value: js.Array[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsNull: Self = StObject.set(x, "hosts", null)
    
    inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
    
    inline def setHostsVarargs(value: String*): Self = StObject.set(x, "hosts", js.Array(value*))
    
    inline def setPathMatcher(value: String): Self = StObject.set(x, "pathMatcher", value.asInstanceOf[js.Any])
    
    inline def setPathMatcherNull: Self = StObject.set(x, "pathMatcher", null)
    
    inline def setPathMatcherUndefined: Self = StObject.set(x, "pathMatcher", js.undefined)
  }
}
