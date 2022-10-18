package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherHttpInputAuthentication extends StObject {
  
  var basic: WatcherHttpInputBasicAuthentication
}
object WatcherHttpInputAuthentication {
  
  inline def apply(basic: WatcherHttpInputBasicAuthentication): WatcherHttpInputAuthentication = {
    val __obj = js.Dynamic.literal(basic = basic.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherHttpInputAuthentication]
  }
  
  extension [Self <: WatcherHttpInputAuthentication](x: Self) {
    
    inline def setBasic(value: WatcherHttpInputBasicAuthentication): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
  }
}
