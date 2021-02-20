package typings.emberRouting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait RenderOptions extends StObject {
    
    var controller: js.UndefOr[String] = js.native
    
    var into: js.UndefOr[String] = js.native
    
    var model: js.UndefOr[js.Any] = js.native
    
    var outlet: js.UndefOr[String] = js.native
    
    var view: js.UndefOr[String] = js.native
  }
  object RenderOptions {
    
    @scala.inline
    def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      @scala.inline
      def setInto(value: String): Self = StObject.set(x, "into", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntoUndefined: Self = StObject.set(x, "into", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setOutlet(value: String): Self = StObject.set(x, "outlet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutletUndefined: Self = StObject.set(x, "outlet", js.undefined)
      
      @scala.inline
      def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  @js.native
  trait RouteQueryParam extends StObject {
    
    var as: js.UndefOr[String] = js.native
    
    var refreshModel: js.UndefOr[Boolean] = js.native
    
    var replace: js.UndefOr[Boolean] = js.native
  }
  object RouteQueryParam {
    
    @scala.inline
    def apply(): RouteQueryParam = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteQueryParam]
    }
    
    @scala.inline
    implicit class RouteQueryParamMutableBuilder[Self <: RouteQueryParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setRefreshModel(value: Boolean): Self = StObject.set(x, "refreshModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshModelUndefined: Self = StObject.set(x, "refreshModel", js.undefined)
      
      @scala.inline
      def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    }
  }
}
