package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadNetworkResourceOptions extends StObject {
  
  var disableCache: Boolean
  
  var includeCredentials: Boolean
}
object LoadNetworkResourceOptions {
  
  inline def apply(disableCache: Boolean, includeCredentials: Boolean): LoadNetworkResourceOptions = {
    val __obj = js.Dynamic.literal(disableCache = disableCache.asInstanceOf[js.Any], includeCredentials = includeCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadNetworkResourceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadNetworkResourceOptions] (val x: Self) extends AnyVal {
    
    inline def setDisableCache(value: Boolean): Self = StObject.set(x, "disableCache", value.asInstanceOf[js.Any])
    
    inline def setIncludeCredentials(value: Boolean): Self = StObject.set(x, "includeCredentials", value.asInstanceOf[js.Any])
  }
}
