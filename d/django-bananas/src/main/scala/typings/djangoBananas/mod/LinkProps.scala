package typings.djangoBananas.mod

import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkProps extends StObject {
  
  var children: String | ReactNode
  
  var hash: js.UndefOr[String] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var params: js.UndefOr[Record[String, String | Double]] = js.undefined
  
  var passHref: js.UndefOr[Boolean] = js.undefined
  
  var patch: js.UndefOr[Boolean] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var query: js.UndefOr[String | (Record[String, String | Double])] = js.undefined
  
  var route: js.UndefOr[String] = js.undefined
}
object LinkProps {
  
  inline def apply(): LinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkProps]
  }
  
  extension [Self <: LinkProps](x: Self) {
    
    inline def setChildren(value: String | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setParams(value: Record[String, String | Double]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPassHref(value: Boolean): Self = StObject.set(x, "passHref", value.asInstanceOf[js.Any])
    
    inline def setPassHrefUndefined: Self = StObject.set(x, "passHref", js.undefined)
    
    inline def setPatch(value: Boolean): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setQuery(value: String | (Record[String, String | Double])): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
  }
}
