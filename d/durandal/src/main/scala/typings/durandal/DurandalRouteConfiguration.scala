package typings.durandal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurandalRouteConfiguration extends StObject {
  
  var hasChildRoutes: js.UndefOr[Boolean] = js.undefined
  
  var hash: js.UndefOr[String] = js.undefined
  
  var isActive: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ Any
  ] = js.undefined
  
  var moduleId: js.UndefOr[String] = js.undefined
  
  var nav: js.UndefOr[Any] = js.undefined
  
  var route: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var routePattern: js.UndefOr[js.RegExp] = js.undefined
  
  var title: js.UndefOr[Any] = js.undefined
  
  var viewUrl: js.UndefOr[String] = js.undefined
}
object DurandalRouteConfiguration {
  
  inline def apply(): DurandalRouteConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurandalRouteConfiguration]
  }
  
  extension [Self <: DurandalRouteConfiguration](x: Self) {
    
    inline def setHasChildRoutes(value: Boolean): Self = StObject.set(x, "hasChildRoutes", value.asInstanceOf[js.Any])
    
    inline def setHasChildRoutesUndefined: Self = StObject.set(x, "hasChildRoutes", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setIsActive(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ Any
    ): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
    
    inline def setNav(value: Any): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
    
    inline def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
    
    inline def setRoute(value: String | js.Array[String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRoutePattern(value: js.RegExp): Self = StObject.set(x, "routePattern", value.asInstanceOf[js.Any])
    
    inline def setRoutePatternUndefined: Self = StObject.set(x, "routePattern", js.undefined)
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setRouteVarargs(value: String*): Self = StObject.set(x, "route", js.Array(value*))
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setViewUrl(value: String): Self = StObject.set(x, "viewUrl", value.asInstanceOf[js.Any])
    
    inline def setViewUrlUndefined: Self = StObject.set(x, "viewUrl", js.undefined)
  }
}
