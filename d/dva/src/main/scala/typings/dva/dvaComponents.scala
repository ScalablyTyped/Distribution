package typings.dva

import typings.react.reactMod.ComponentType
import typings.reactDashRouter.reactDashRouterMod.RouteProps
import typings.reactDashRouterDashRedux.reactDashRouterDashReduxMod.ConnectedRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dvaComponents extends dvaProps {
  @scala.inline
  def BrowserRouter: ComponentType[typings.reactDashRouterDashDom.reactDashRouterDashDomMod.BrowserRouterProps] = js.constructorOf[typings.dva.routerMod.BrowserRouter].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRouterDashDom.reactDashRouterDashDomMod.BrowserRouterProps]]
  @scala.inline
  def HashRouter: ComponentType[typings.reactDashRouterDashDom.reactDashRouterDashDomMod.HashRouterProps] = js.constructorOf[typings.dva.routerMod.HashRouter].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRouterDashDom.reactDashRouterDashDomMod.HashRouterProps]]
  @scala.inline
  def Link[S]: ComponentType[typings.reactDashRouterDashDom.reactDashRouterDashDomMod.LinkProps[S]] = js.constructorOf[typings.dva.routerMod.Link[S]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRouterDashDom.reactDashRouterDashDomMod.LinkProps[S]]]
  @scala.inline
  def MemoryRouter: ComponentType[typings.reactDashRouter.reactDashRouterMod.MemoryRouterProps] = js.constructorOf[typings.dva.routerMod.MemoryRouter].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRouter.reactDashRouterMod.MemoryRouterProps]]
  @scala.inline
  def NavLink[S]: ComponentType[typings.reactDashRouterDashDom.reactDashRouterDashDomMod.NavLinkProps[S]] = js.constructorOf[typings.dva.routerMod.NavLink[S]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRouterDashDom.reactDashRouterDashDomMod.NavLinkProps[S]]]
  @scala.inline
  def Prompt: ComponentType[typings.reactDashRouter.reactDashRouterMod.PromptProps] = js.constructorOf[typings.dva.routerMod.Prompt].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRouter.reactDashRouterMod.PromptProps]]
  @scala.inline
  def Redirect: ComponentType[typings.reactDashRouter.reactDashRouterMod.RedirectProps] = js.constructorOf[typings.dva.routerMod.Redirect].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRouter.reactDashRouterMod.RedirectProps]]
  @scala.inline
  def Route[T /* <: RouteProps */]: ComponentType[T] = js.constructorOf[typings.dva.routerMod.Route[T]].asInstanceOf[typings.react.reactMod.ComponentType[T]]
  @scala.inline
  def Router: ComponentType[typings.reactDashRouter.reactDashRouterMod.RouterProps] = js.constructorOf[typings.dva.routerMod.Router].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRouter.reactDashRouterMod.RouterProps]]
  @scala.inline
  def RouterReduxConnectedRouter[State]: ComponentType[ConnectedRouterProps[State]] = js.constructorOf[typings.dva.routerMod.routerRedux.ConnectedRouter[State]].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashRouterDashRedux.reactDashRouterDashReduxMod.ConnectedRouterProps[State]]]
  @scala.inline
  def StaticRouter: ComponentType[typings.reactDashRouter.reactDashRouterMod.StaticRouterProps] = js.constructorOf[typings.dva.routerMod.StaticRouter].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRouter.reactDashRouterMod.StaticRouterProps]]
  @scala.inline
  def Switch: ComponentType[typings.reactDashRouter.reactDashRouterMod.SwitchProps] = js.constructorOf[typings.dva.routerMod.Switch].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRouter.reactDashRouterMod.SwitchProps]]
}

