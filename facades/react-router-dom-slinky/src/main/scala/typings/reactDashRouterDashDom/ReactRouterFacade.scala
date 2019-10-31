package typings.reactDashRouterDashDom

import slinky.core.facade.ReactElement
import slinky.core.{BuildingComponent, ReactComponentClass}
import typings.history.historyMod.{Location, LocationState}
import typings.reactDashRouterDashDom.{reactDashRouterDashDomProps, reactDashRouterDashDomComponents => RRD}
import typings.reactDashRouter.reactDashRouterMod.{
  RouteChildrenProps,
  RouteComponentProps,
  RouteProps,
  StaticContext
}
import typings.react.ScalableSlinky.{importSTComponent, ExternalComponentP}

import scala.scalajs.js
import scala.scalajs.js.|

object ReactRouterFacade extends reactDashRouterDashDomProps {

  @inline def BrowserRouter: ExternalComponentP[BrowserRouterProps]  = importSTComponent(RRD.BrowserRouter)
  @inline def HashRouter   : ExternalComponentP[HashRouterProps]     = importSTComponent(RRD.HashRouter)
  @inline def Link[S]      : ExternalComponentP[LinkProps[S]]        = importSTComponent(RRD.Link[S])
  @inline def MemoryRouter : ExternalComponentP[MemoryRouterProps]   = importSTComponent(RRD.MemoryRouter)
  @inline def NavLink[S]   : ExternalComponentP[NavLinkProps[S]]     = importSTComponent(RRD.NavLink[S])
  @inline def Prompt       : ExternalComponentP[PromptProps]         = importSTComponent(RRD.Prompt)
  @inline def Redirect     : ExternalComponentP[RedirectProps]       = importSTComponent(RRD.Redirect)
  @inline def Router       : ExternalComponentP[RouterProps]         = importSTComponent(RRD.Router)
  @inline def StaticRouter : ExternalComponentP[StaticRouterProps]   = importSTComponent(RRD.StaticRouter)
  @inline def Switch       : ExternalComponentP[SwitchProps]         = importSTComponent(RRD.Switch)

  /** The description of the `Route` component is somewhat rough, so this is a somewhat better slinky wrapper.
    *
    * The main problematic issue is the type parameter `T` which ends up in `match`, which is awkward in
    * typescript jsx, in slinky, and in ScalablyTyped for three different reasons.
    *
    * Note that the `component` param has been renamed to `componentAlt` to avoid conflicts with Slinky's
    * definitions
    *
    * Note that this could be developed much further, probably the only way to make a somewhat sane API
    *  would be to use a builder.
    */
  def Route[T](
      alwaysRender: js.Function1[ /* props */ RouteChildrenProps[T, LocationState], ReactElement]    = null,
      componentAlt: ReactComponentClass[RouteComponentProps[T, StaticContext, LocationState]]        = null,
      exact:        js.UndefOr[scala.Boolean]                                                        = js.undefined,
      location:     Location[LocationState]                                                          = null,
      path:         String | js.Array[String]                                                        = null,
      render:       /* props */ RouteComponentProps[T, StaticContext, LocationState] => ReactElement = null,
      sensitive:    js.UndefOr[Boolean]                                                              = js.undefined,
      strict:       js.UndefOr[Boolean]                                                              = js.undefined
  ): BuildingComponent[Nothing, js.Object] = {

    val props = js.Dynamic.literal()
    if (alwaysRender != null) props.updateDynamic("children")(alwaysRender.asInstanceOf[js.Any])
    if (componentAlt != null) props.updateDynamic("component")(componentAlt.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) props.updateDynamic("exact")(exact)
    if (location != null) props.updateDynamic("location")(location)
    if (path != null) props.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) props.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(sensitive)) props.updateDynamic("sensitive")(sensitive)
    if (!js.isUndefined(strict)) props.updateDynamic("strict")(strict)

    importSTComponent(RRD.Route[RouteProps])(props.asInstanceOf[RouteProps])
  }
}
