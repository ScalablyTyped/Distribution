package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherPagerDutyContext extends StObject {
  
  var href: js.UndefOr[String] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var `type`: WatcherPagerDutyContextType
}
object WatcherPagerDutyContext {
  
  inline def apply(`type`: WatcherPagerDutyContextType): WatcherPagerDutyContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherPagerDutyContext]
  }
  
  extension [Self <: WatcherPagerDutyContext](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setType(value: WatcherPagerDutyContextType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
