package typings.durandal

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurandalRouteConfiguration extends StObject {
  
  var hasChildRoutes: js.UndefOr[Boolean] = js.undefined
  
  var hash: js.UndefOr[String] = js.undefined
  
  var isActive: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any
  ] = js.undefined
  
  var moduleId: js.UndefOr[String] = js.undefined
  
  var nav: js.UndefOr[js.Any] = js.undefined
  
  var route: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var routePattern: js.UndefOr[RegExp] = js.undefined
  
  var title: js.UndefOr[js.Any] = js.undefined
  
  var viewUrl: js.UndefOr[String] = js.undefined
}
object DurandalRouteConfiguration {
  
  @scala.inline
  def apply(): DurandalRouteConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurandalRouteConfiguration]
  }
  
  @scala.inline
  implicit class DurandalRouteConfigurationMutableBuilder[Self <: DurandalRouteConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasChildRoutes(value: Boolean): Self = StObject.set(x, "hasChildRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasChildRoutesUndefined: Self = StObject.set(x, "hasChildRoutes", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setIsActive(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any
    ): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    @scala.inline
    def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
    
    @scala.inline
    def setNav(value: js.Any): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
    
    @scala.inline
    def setRoute(value: String | js.Array[String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutePattern(value: RegExp): Self = StObject.set(x, "routePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutePatternUndefined: Self = StObject.set(x, "routePattern", js.undefined)
    
    @scala.inline
    def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    @scala.inline
    def setRouteVarargs(value: String*): Self = StObject.set(x, "route", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setViewUrl(value: String): Self = StObject.set(x, "viewUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUrlUndefined: Self = StObject.set(x, "viewUrl", js.undefined)
  }
}
