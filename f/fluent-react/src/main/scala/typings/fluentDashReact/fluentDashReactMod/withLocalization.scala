package typings.fluentDashReact.fluentDashReactMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluent-react", "withLocalization")
@js.native
object withLocalization extends js.Object {
  def apply(component: ComponentClass[Matching[InjectedProps, GetProps[_]], ComponentState]): ComponentType[
    Omit[
      GetProps[ComponentClass[Matching[InjectedProps, GetProps[_]], ComponentState]], 
      String
    ]
  ] = js.native
  def apply(component: FunctionComponent[Matching[InjectedProps, GetProps[_]]]): ComponentType[Omit[GetProps[FunctionComponent[Matching[InjectedProps, GetProps[_]]]], String]] = js.native
}

