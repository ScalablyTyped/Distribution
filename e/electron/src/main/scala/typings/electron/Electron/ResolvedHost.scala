package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedHost extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/resolved-host
  /**
    * resolved DNS entries for the hostname
    */
  var endpoints: js.Array[ResolvedEndpoint]
}
object ResolvedHost {
  
  inline def apply(endpoints: js.Array[ResolvedEndpoint]): ResolvedHost = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedHost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedHost] (val x: Self) extends AnyVal {
    
    inline def setEndpoints(value: js.Array[ResolvedEndpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsVarargs(value: ResolvedEndpoint*): Self = StObject.set(x, "endpoints", js.Array(value*))
  }
}
