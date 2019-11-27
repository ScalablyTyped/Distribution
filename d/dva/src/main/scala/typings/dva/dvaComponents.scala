package typings.dva

import typings.react.reactMod.ComponentType
import typings.reactDashRouter.reactDashRouterMod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dvaComponents extends dvaProps {
  @scala.inline
  def BrowserRouter: ComponentType[BrowserRouterProps] = js.constructorOf[typings.dva.routerMod.BrowserRouter].asInstanceOf[typings.react.reactMod.ComponentType[BrowserRouterProps]]
  @scala.inline
  def HashRouter: ComponentType[HashRouterProps] = js.constructorOf[typings.dva.routerMod.HashRouter].asInstanceOf[typings.react.reactMod.ComponentType[HashRouterProps]]
  @scala.inline
  def Link[S]: ComponentType[LinkProps[S]] = js.constructorOf[typings.dva.routerMod.Link[S]].asInstanceOf[typings.react.reactMod.ComponentType[LinkProps[S]]]
  @scala.inline
  def MemoryRouter: ComponentType[MemoryRouterProps] = js.constructorOf[typings.dva.routerMod.MemoryRouter].asInstanceOf[typings.react.reactMod.ComponentType[MemoryRouterProps]]
  @scala.inline
  def NavLink[S]: ComponentType[NavLinkProps[S]] = js.constructorOf[typings.dva.routerMod.NavLink[S]].asInstanceOf[typings.react.reactMod.ComponentType[NavLinkProps[S]]]
  @scala.inline
  def Prompt: ComponentType[PromptProps] = js.constructorOf[typings.dva.routerMod.Prompt].asInstanceOf[typings.react.reactMod.ComponentType[PromptProps]]
  @scala.inline
  def Redirect: ComponentType[RedirectProps] = js.constructorOf[typings.dva.routerMod.Redirect].asInstanceOf[typings.react.reactMod.ComponentType[RedirectProps]]
  @scala.inline
  def Route[T /* <: RouteProps */]: ComponentType[T] = js.constructorOf[typings.dva.routerMod.Route[T]].asInstanceOf[typings.react.reactMod.ComponentType[T]]
  @scala.inline
  def Router: ComponentType[RouterProps] = js.constructorOf[typings.dva.routerMod.Router].asInstanceOf[typings.react.reactMod.ComponentType[RouterProps]]
  @scala.inline
  def RouterReduxConnectedRouter[State]: ComponentType[RouterReduxConnectedRouterProps[State]] = js.constructorOf[typings.dva.routerMod.routerRedux.ConnectedRouter[State]].asInstanceOf[typings.react.reactMod.ComponentType[RouterReduxConnectedRouterProps[State]]]
  @scala.inline
  def StaticRouter: ComponentType[StaticRouterProps] = js.constructorOf[typings.dva.routerMod.StaticRouter].asInstanceOf[typings.react.reactMod.ComponentType[StaticRouterProps]]
  @scala.inline
  def Switch: ComponentType[SwitchProps] = js.constructorOf[typings.dva.routerMod.Switch].asInstanceOf[typings.react.reactMod.ComponentType[SwitchProps]]
}

