package typings.falcorRouter

import typings.falcor.mod.DataSource
import typings.falcorJsonGraph.mod.InvalidPath
import typings.falcorJsonGraph.mod.JSONEnvelope
import typings.falcorJsonGraph.mod.JSONGraph
import typings.falcorJsonGraph.mod.JSONGraphEnvelope
import typings.falcorJsonGraph.mod.PathSet
import typings.falcorJsonGraph.mod.PathValue_
import typings.rxLiteAggregates.Rx.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("falcor-router", JSImport.Namespace)
  @js.native
  open class ^ protected () extends FalcorRouter {
    def this(routes: js.Array[RouteDefinition]) = this()
    def this(routes: js.Array[RouteDefinition], options: RouterOptions) = this()
  }
  @JSImport("falcor-router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("falcor-router", "CreatedRouter")
  @js.native
  open class CreatedRouter () extends FalcorRouter {
    def this(options: RouterOptions) = this()
  }
  
  /* static member */
  inline def createClass(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClass")().asInstanceOf[Any]
  inline def createClass(routes: js.Array[RouteDefinition]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClass")(routes.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait CallRoute
    extends StObject
       with Route
       with RouteDefinition {
    
    def call(callPath: RoutePathSet, args: js.Array[Any]): CallRouteResult | js.Promise[CallRouteResult] | Observable[CallRouteResult]
  }
  object CallRoute {
    
    inline def apply(
      call: (RoutePathSet, js.Array[Any]) => CallRouteResult | js.Promise[CallRouteResult] | Observable[CallRouteResult],
      route: String
    ): CallRoute = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction2(call), route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallRoute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallRoute] (val x: Self) extends AnyVal {
      
      inline def setCall(
        value: (RoutePathSet, js.Array[Any]) => CallRouteResult | js.Promise[CallRouteResult] | Observable[CallRouteResult]
      ): Self = StObject.set(x, "call", js.Any.fromFunction2(value))
    }
  }
  
  type CallRouteResult = PathValue_ | InvalidPath | (js.Array[PathValue_ | InvalidPath]) | JSONGraphEnvelope
  
  @js.native
  trait FalcorRouter extends DataSource {
    
    /**
      * When a route misses on a call, get, or set the unhandledDataSource will
      * have a chance to fulfill that request.
      **/
    def routeUnhandledPathsTo(dataSource: DataSource): Unit = js.native
  }
  
  trait GetRoute
    extends StObject
       with Route
       with RouteDefinition {
    
    def get(pathset: RoutePathSet): RouteResult | js.Promise[RouteResult] | Observable[RouteResult]
  }
  object GetRoute {
    
    inline def apply(
      get: RoutePathSet => RouteResult | js.Promise[RouteResult] | Observable[RouteResult],
      route: String
    ): GetRoute = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRoute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetRoute] (val x: Self) extends AnyVal {
      
      inline def setGet(value: RoutePathSet => RouteResult | js.Promise[RouteResult] | Observable[RouteResult]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  trait Route extends StObject {
    
    var route: String
  }
  object Route {
    
    inline def apply(route: String): Route = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.falcorRouter.mod.GetRoute
    - typings.falcorRouter.mod.SetRoute
    - typings.falcorRouter.mod.CallRoute
  */
  trait RouteDefinition extends StObject
  object RouteDefinition {
    
    inline def CallRoute(
      call: (RoutePathSet, js.Array[Any]) => CallRouteResult | js.Promise[CallRouteResult] | Observable[CallRouteResult],
      route: String
    ): typings.falcorRouter.mod.CallRoute = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction2(call), route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.falcorRouter.mod.CallRoute]
    }
    
    inline def GetRoute(
      get: RoutePathSet => RouteResult | js.Promise[RouteResult] | Observable[RouteResult],
      route: String
    ): typings.falcorRouter.mod.GetRoute = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.falcorRouter.mod.GetRoute]
    }
    
    inline def SetRoute(route: String, set: JSONGraph => RouteResult | js.Promise[RouteResult] | Observable[RouteResult]): typings.falcorRouter.mod.SetRoute = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[typings.falcorRouter.mod.SetRoute]
    }
  }
  
  type RoutePathSet = PathSet
  
  type RouteResult = PathValue_ | js.Array[PathValue_] | JSONEnvelope[Any]
  
  trait RouterOptions extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var maxPaths: js.UndefOr[Double] = js.undefined
    
    var maxRefFollow: js.UndefOr[Double] = js.undefined
  }
  object RouterOptions {
    
    inline def apply(): RouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouterOptions] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setMaxPaths(value: Double): Self = StObject.set(x, "maxPaths", value.asInstanceOf[js.Any])
      
      inline def setMaxPathsUndefined: Self = StObject.set(x, "maxPaths", js.undefined)
      
      inline def setMaxRefFollow(value: Double): Self = StObject.set(x, "maxRefFollow", value.asInstanceOf[js.Any])
      
      inline def setMaxRefFollowUndefined: Self = StObject.set(x, "maxRefFollow", js.undefined)
    }
  }
  
  trait SetRoute
    extends StObject
       with Route
       with RouteDefinition {
    
    def set(jsonGraph: JSONGraph): RouteResult | js.Promise[RouteResult] | Observable[RouteResult]
  }
  object SetRoute {
    
    inline def apply(route: String, set: JSONGraph => RouteResult | js.Promise[RouteResult] | Observable[RouteResult]): SetRoute = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[SetRoute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetRoute] (val x: Self) extends AnyVal {
      
      inline def setSet(value: JSONGraph => RouteResult | js.Promise[RouteResult] | Observable[RouteResult]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
}
