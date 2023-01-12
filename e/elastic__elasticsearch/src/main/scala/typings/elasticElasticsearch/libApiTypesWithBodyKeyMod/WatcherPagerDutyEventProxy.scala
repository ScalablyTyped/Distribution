package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherPagerDutyEventProxy extends StObject {
  
  var host: js.UndefOr[Host] = js.undefined
  
  var port: js.UndefOr[integer] = js.undefined
}
object WatcherPagerDutyEventProxy {
  
  inline def apply(): WatcherPagerDutyEventProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherPagerDutyEventProxy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherPagerDutyEventProxy] (val x: Self) extends AnyVal {
    
    inline def setHost(value: Host): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPort(value: integer): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
