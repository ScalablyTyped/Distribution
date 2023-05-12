package typings.gatsbyjsReachRouter

import typings.gatsbyjsReachRouter.anon.ReadonlyRouterPropsHTMLPr
import typings.gatsbyjsReachRouter.anon.ReadonlyServerLocationPro
import typings.reachRouter.anon.Dictparam
import typings.reachRouter.mod.History
import typings.reachRouter.mod.HistorySource
import typings.reachRouter.mod.LinkProps
import typings.reachRouter.mod.MatchProps
import typings.reachRouter.mod.RedirectProps
import typings.reachRouter.mod.RouteComponentProps
import typings.reachRouter.mod.RouterProps
import typings.reachRouter.mod.ServerLocationProps
import typings.reachRouter.mod.WindowLocation
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLAnchorElement
import typings.std.HTMLDivElement
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@gatsbyjs/reach-router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Link[TState](
    // TODO: Define this as ...params: Parameters<Link<TState>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[LinkProps[TState]] & RefAttributes[HTMLAnchorElement]
  ): ReturnType[typings.reachRouter.mod.Link[TState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Link")(props.asInstanceOf[js.Any]).asInstanceOf[ReturnType[typings.reachRouter.mod.Link[TState]]]
  
  @JSImport("@gatsbyjs/reach-router", "Location")
  @js.native
  open class Location protected ()
    extends Component[LocationProps, js.Object, Any] {
    def this(props: LocationProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: LocationProps, context: Any) = this()
  }
  
  @JSImport("@gatsbyjs/reach-router", "LocationProvider")
  @js.native
  open class LocationProvider protected ()
    extends Component[LocationProviderProps, js.Object, Any] {
    def this(props: LocationProviderProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: LocationProviderProps, context: Any) = this()
  }
  
  @JSImport("@gatsbyjs/reach-router", "Match")
  @js.native
  open class Match[TParams] protected ()
    extends typings.reachRouter.mod.Match[TParams] {
    def this(props: MatchProps[TParams]) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: MatchProps[TParams], context: Any) = this()
  }
  
  @JSImport("@gatsbyjs/reach-router", "Redirect")
  @js.native
  open class Redirect[TState] protected ()
    extends typings.reachRouter.mod.Redirect[TState] {
    def this(props: RouteComponentProps[RedirectProps[TState]]) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: RouteComponentProps[RedirectProps[TState]], context: Any) = this()
  }
  
  @JSImport("@gatsbyjs/reach-router", "Router")
  @js.native
  open class Router protected ()
    extends typings.reachRouter.mod.Router {
    def this(props: RouterProps & HTMLProps[HTMLDivElement]) = this()
    def this(props: ReadonlyRouterPropsHTMLPr) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: RouterProps & HTMLProps[HTMLDivElement], context: Any) = this()
  }
  
  @JSImport("@gatsbyjs/reach-router", "ServerLocation")
  @js.native
  open class ServerLocation protected ()
    extends typings.reachRouter.mod.ServerLocation {
    def this(props: ReadonlyServerLocationPro) = this()
    def this(props: ServerLocationProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ServerLocationProps, context: Any) = this()
  }
  
  inline def createHistory(source: HistorySource): History = ^.asInstanceOf[js.Dynamic].applyDynamic("createHistory")(source.asInstanceOf[js.Any]).asInstanceOf[History]
  
  inline def createMemorySource(initialPath: String): HistorySource = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemorySource")(initialPath.asInstanceOf[js.Any]).asInstanceOf[HistorySource]
  
  @JSImport("@gatsbyjs/reach-router", "globalHistory")
  @js.native
  val globalHistory: History = js.native
  
  inline def isRedirect(error: Any): /* is @reach/router.@reach/router.RedirectRequest */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRedirect")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @reach/router.@reach/router.RedirectRequest */ Boolean]
  
  inline def redirectTo(uri: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectTo")(uri.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useLocation(): WindowLocation[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[WindowLocation[Any]]
  
  inline def useMatch(pathname: String): Null | Dictparam = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatch")(pathname.asInstanceOf[js.Any]).asInstanceOf[Null | Dictparam]
  
  inline def useParams[TParams /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ Param in keyof TParams ]:? string} */ js.Any */](): TParams = ^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[TParams]
  
  trait LocationContext extends StObject {
    
    var location: WindowLocation[Any]
  }
  object LocationContext {
    
    inline def apply(location: WindowLocation[Any]): LocationContext = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocationContext] (val x: Self) extends AnyVal {
      
      inline def setLocation(value: WindowLocation[Any]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocationProps extends StObject {
    
    var children: LocationProviderRenderFn
  }
  object LocationProps {
    
    inline def apply(children: /* context */ LocationContext => ReactNode): LocationProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[LocationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocationProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: /* context */ LocationContext => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait LocationProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode | LocationProviderRenderFn] = js.undefined
    
    var history: js.UndefOr[History] = js.undefined
  }
  object LocationProviderProps {
    
    inline def apply(): LocationProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocationProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode | LocationProviderRenderFn): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* context */ LocationContext => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    }
  }
  
  type LocationProviderRenderFn = js.Function1[/* context */ LocationContext, ReactNode]
}
