package typings.gatsbyjsReachRouter

import org.scalablytyped.runtime.TopLevel
import typings.gatsbyjsReachRouter.anon.ReadonlyLocationProps
import typings.gatsbyjsReachRouter.anon.ReadonlyLocationProviderP
import typings.gatsbyjsReachRouter.anon.ReadonlyRouterPropsHTMLPr
import typings.gatsbyjsReachRouter.anon.ReadonlyServerLocationPro
import typings.reachRouter.anon.Dictparam
import typings.reachRouter.mod.History
import typings.reachRouter.mod.HistorySource
import typings.reachRouter.mod.LinkProps
import typings.reachRouter.mod.LocationProps
import typings.reachRouter.mod.LocationProviderProps
import typings.reachRouter.mod.MatchProps
import typings.reachRouter.mod.NavigateFn
import typings.reachRouter.mod.RedirectProps
import typings.reachRouter.mod.RouteComponentProps
import typings.reachRouter.mod.RouterProps
import typings.reachRouter.mod.ServerLocationProps
import typings.reachRouter.mod.WindowLocation
import typings.react.mod.HTMLProps
import typings.react.mod.PropsWithoutRef
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
    extends typings.reachRouter.mod.Location {
    def this(props: ReadonlyLocationProps) = this()
    def this(props: LocationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LocationProps, context: Any) = this()
  }
  
  @JSImport("@gatsbyjs/reach-router", "LocationProvider")
  @js.native
  open class LocationProvider protected ()
    extends typings.reachRouter.mod.LocationProvider {
    def this(props: ReadonlyLocationProviderP) = this()
    def this(props: LocationProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
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
      * @see https://reactjs.org/docs/legacy-context.html
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
      * @see https://reactjs.org/docs/legacy-context.html
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
      * @see https://reactjs.org/docs/legacy-context.html
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
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ServerLocationProps, context: Any) = this()
  }
  
  inline def createHistory(source: HistorySource): History = ^.asInstanceOf[js.Dynamic].applyDynamic("createHistory")(source.asInstanceOf[js.Any]).asInstanceOf[History]
  
  inline def createMemorySource(initialPath: String): HistorySource = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemorySource")(initialPath.asInstanceOf[js.Any]).asInstanceOf[HistorySource]
  
  @JSImport("@gatsbyjs/reach-router", "globalHistory")
  @js.native
  val globalHistory: History = js.native
  
  inline def isRedirect(error: Any): /* is @reach/router.@reach/router.RedirectRequest */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRedirect")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @reach/router.@reach/router.RedirectRequest */ Boolean]
  
  @JSImport("@gatsbyjs/reach-router", "navigate")
  @js.native
  val navigate: NavigateFn = js.native
  
  inline def redirectTo(uri: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectTo")(uri.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useLocation(): WindowLocation[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[WindowLocation[Any]]
  
  inline def useMatch(pathname: String): Null | Dictparam = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatch")(pathname.asInstanceOf[js.Any]).asInstanceOf[Null | Dictparam]
  
  inline def useNavigate(): NavigateFn = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigate")().asInstanceOf[NavigateFn]
  
  inline def useParams[TParams /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Param in keyof TParams ]:? string}
    */ typings.gatsbyjsReachRouter.gatsbyjsReachRouterStrings.useParams & TopLevel[Any] */](): TParams = ^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[TParams]
}
