package typings.dva

import typings.dva.routerMod.routerRedux.ConnectedRouter
import typings.react.mod.ComponentType
import typings.reactRouter.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dvaComponents extends dvaProps {
  @scala.inline
  def BrowserRouter: ComponentType[BrowserRouterProps] = js.constructorOf[typings.dva.routerMod.BrowserRouter].asInstanceOf[ComponentType[BrowserRouterProps]]
  @scala.inline
  def HashRouter: ComponentType[HashRouterProps] = js.constructorOf[typings.dva.routerMod.HashRouter].asInstanceOf[ComponentType[HashRouterProps]]
  @scala.inline
  def MemoryRouter: ComponentType[MemoryRouterProps] = js.constructorOf[typings.dva.routerMod.MemoryRouter].asInstanceOf[ComponentType[MemoryRouterProps]]
  @scala.inline
  def Prompt: ComponentType[PromptProps] = js.constructorOf[typings.dva.routerMod.Prompt].asInstanceOf[ComponentType[PromptProps]]
  @scala.inline
  def Redirect: ComponentType[RedirectProps] = js.constructorOf[typings.dva.routerMod.Redirect].asInstanceOf[ComponentType[RedirectProps]]
  @scala.inline
  def Route[T /* <: RouteProps */]: ComponentType[T] = js.constructorOf[typings.dva.routerMod.Route[T]].asInstanceOf[ComponentType[T]]
  @scala.inline
  def Router: ComponentType[RouterProps] = js.constructorOf[typings.dva.routerMod.Router].asInstanceOf[ComponentType[RouterProps]]
  @scala.inline
  def RouterReduxConnectedRouter[State]: ComponentType[RouterReduxConnectedRouterProps[State]] = js.constructorOf[ConnectedRouter[State]].asInstanceOf[ComponentType[RouterReduxConnectedRouterProps[State]]]
  @scala.inline
  def StaticRouter: ComponentType[StaticRouterProps] = js.constructorOf[typings.dva.routerMod.StaticRouter].asInstanceOf[ComponentType[StaticRouterProps]]
  @scala.inline
  def Switch: ComponentType[SwitchProps] = js.constructorOf[typings.dva.routerMod.Switch].asInstanceOf[ComponentType[SwitchProps]]
}

