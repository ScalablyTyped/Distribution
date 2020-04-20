package typings.dva

import typings.reactRouterRedux.mod.ConnectedRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dvaProps {
  type BrowserRouterProps = typings.reactRouterDom.mod.BrowserRouterProps
  type HashRouterProps = typings.reactRouterDom.mod.HashRouterProps
  type MemoryRouterProps = typings.reactRouter.mod.MemoryRouterProps
  type PromptProps = typings.reactRouter.mod.PromptProps
  type RedirectProps = typings.reactRouter.mod.RedirectProps
  type RouterProps = typings.reactRouter.mod.RouterProps
  type RouterReduxConnectedRouterProps[State] = ConnectedRouterProps[State]
  type StaticRouterProps = typings.reactRouter.mod.StaticRouterProps
  type SwitchProps = typings.reactRouter.mod.SwitchProps
}

