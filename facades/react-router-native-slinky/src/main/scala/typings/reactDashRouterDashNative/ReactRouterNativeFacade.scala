package typings.reactDashRouterDashNative

import slinky.core.facade.ReactElement
import slinky.core.{BuildingComponent, ReactComponentClass}
import typings.history.historyMod.{Location, LocationState}
import typings.react.ScalableSlinky.{ExternalComponentP, importSTComponent}
import typings.reactDashRouter.reactDashRouterMod.{RouteChildrenProps, RouteComponentProps, StaticContext}
import typings.reactDashRouterDashNative.{reactDashRouterDashNativeComponents => RRN}

import scala.scalajs.js
import scala.scalajs.js.|

object ReactRouterNativeFacade extends reactDashRouterDashNativeProps {

  @inline def NativeRouter     : ExternalComponentP[NativeRouterProps]      = importSTComponent(RRN.NativeRouter)
  @inline def Link             : ExternalComponentP[LinkProps]              = importSTComponent(RRN.Link)
  @inline def DeepLinking      : ExternalComponentP[js.Object]              = importSTComponent(RRN.DeepLinking)
  @inline def MemoryRouter     : ExternalComponentP[MemoryRouterProps]      = importSTComponent(RRN.MemoryRouter)
  @inline def BackButton       : ExternalComponentP[BackButtonProps]        = importSTComponent(RRN.BackButton)
  @inline def AndroidBackButton: ExternalComponentP[AndroidBackButtonProps] = importSTComponent(RRN.AndroidBackButton)
  @inline def Prompt           : ExternalComponentP[PromptProps]            = importSTComponent(RRN.Prompt)
  @inline def Redirect         : ExternalComponentP[RedirectProps]          = importSTComponent(RRN.Redirect)
  @inline def Router           : ExternalComponentP[RouterProps]            = importSTComponent(RRN.Router)
  @inline def StaticRouter     : ExternalComponentP[StaticRouterProps]      = importSTComponent(RRN.StaticRouter)
  @inline def Switch           : ExternalComponentP[SwitchProps]            = importSTComponent(RRN.Switch)

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

    importSTComponent(RRN.Route)(props.asInstanceOf[RouteProps])
  }
}
