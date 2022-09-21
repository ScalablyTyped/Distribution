package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlRewrite extends StObject {
  
  /**
    * Before forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
    */
  var hostRewrite: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Before forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
    */
  var pathPrefixRewrite: js.UndefOr[String | Null] = js.undefined
}
object SchemaUrlRewrite {
  
  inline def apply(): SchemaUrlRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlRewrite]
  }
  
  extension [Self <: SchemaUrlRewrite](x: Self) {
    
    inline def setHostRewrite(value: String): Self = StObject.set(x, "hostRewrite", value.asInstanceOf[js.Any])
    
    inline def setHostRewriteNull: Self = StObject.set(x, "hostRewrite", null)
    
    inline def setHostRewriteUndefined: Self = StObject.set(x, "hostRewrite", js.undefined)
    
    inline def setPathPrefixRewrite(value: String): Self = StObject.set(x, "pathPrefixRewrite", value.asInstanceOf[js.Any])
    
    inline def setPathPrefixRewriteNull: Self = StObject.set(x, "pathPrefixRewrite", null)
    
    inline def setPathPrefixRewriteUndefined: Self = StObject.set(x, "pathPrefixRewrite", js.undefined)
  }
}
