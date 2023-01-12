package typings.djangoBananas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageInterfaceBase extends StObject {
  
  var referer: js.UndefOr[String] = js.undefined
  
  var route: RouteData
  
  var title: String
}
object PageInterfaceBase {
  
  inline def apply(route: RouteData, title: String): PageInterfaceBase = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInterfaceBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageInterfaceBase] (val x: Self) extends AnyVal {
    
    inline def setReferer(value: String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
    
    inline def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
    
    inline def setRoute(value: RouteData): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
