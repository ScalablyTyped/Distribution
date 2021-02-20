package typings.emberRouting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait As extends StObject {
    
    var as: js.UndefOr[String] = js.native
    
    var engineInfo: js.UndefOr[js.Any] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var resetNamespace: js.UndefOr[Boolean] = js.native
  }
  object As {
    
    @scala.inline
    def apply(): As = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[As]
    }
    
    @scala.inline
    implicit class AsMutableBuilder[Self <: As] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setEngineInfo(value: js.Any): Self = StObject.set(x, "engineInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineInfoUndefined: Self = StObject.set(x, "engineInfo", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setResetNamespace(value: Boolean): Self = StObject.set(x, "resetNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetNamespaceUndefined: Self = StObject.set(x, "resetNamespace", js.undefined)
    }
  }
  
  @js.native
  trait Outlet extends StObject {
    
    var outlet: js.UndefOr[String] = js.native
    
    var parentView: js.UndefOr[String] = js.native
  }
  object Outlet {
    
    @scala.inline
    def apply(): Outlet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Outlet]
    }
    
    @scala.inline
    implicit class OutletMutableBuilder[Self <: Outlet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutlet(value: String): Self = StObject.set(x, "outlet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutletUndefined: Self = StObject.set(x, "outlet", js.undefined)
      
      @scala.inline
      def setParentView(value: String): Self = StObject.set(x, "parentView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentViewUndefined: Self = StObject.set(x, "parentView", js.undefined)
    }
  }
  
  @js.native
  trait Path extends StObject {
    
    var path: js.UndefOr[String] = js.native
    
    var resetNamespace: js.UndefOr[Boolean] = js.native
  }
  object Path {
    
    @scala.inline
    def apply(): Path = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setResetNamespace(value: Boolean): Self = StObject.set(x, "resetNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetNamespaceUndefined: Self = StObject.set(x, "resetNamespace", js.undefined)
    }
  }
  
  @js.native
  trait QueryParam extends StObject {
    
    var queryParam: js.Object = js.native
  }
  object QueryParam {
    
    @scala.inline
    def apply(queryParam: js.Object): QueryParam = {
      val __obj = js.Dynamic.literal(queryParam = queryParam.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryParam]
    }
    
    @scala.inline
    implicit class QueryParamMutableBuilder[Self <: QueryParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryParam(value: js.Object): Self = StObject.set(x, "queryParam", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueryParams extends StObject {
    
    var queryParams: js.Object = js.native
  }
  object QueryParams {
    
    @scala.inline
    def apply(queryParams: js.Object): QueryParams = {
      val __obj = js.Dynamic.literal(queryParams = queryParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryParams]
    }
    
    @scala.inline
    implicit class QueryParamsMutableBuilder[Self <: QueryParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryParams(value: js.Object): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    }
  }
}
