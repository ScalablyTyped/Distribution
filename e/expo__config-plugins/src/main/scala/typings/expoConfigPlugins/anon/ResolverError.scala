package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolverError extends StObject {
  
  var _resolverError: js.Error
}
object ResolverError {
  
  inline def apply(_resolverError: js.Error): ResolverError = {
    val __obj = js.Dynamic.literal(_resolverError = _resolverError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolverError] (val x: Self) extends AnyVal {
    
    inline def set_resolverError(value: js.Error): Self = StObject.set(x, "_resolverError", value.asInstanceOf[js.Any])
  }
}
