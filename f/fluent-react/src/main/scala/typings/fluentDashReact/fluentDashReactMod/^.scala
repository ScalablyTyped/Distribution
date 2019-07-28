package typings.fluentDashReact.fluentDashReactMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluent-react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def withLocalization(component: ComponentClass[Matching[InjectedProps, GetProps[_]], ComponentState]): ComponentType[
    Omit[
      GetProps[ComponentClass[Matching[InjectedProps, GetProps[_]], ComponentState]], 
      String
    ]
  ] = js.native
  def withLocalization(component: FunctionComponent[Matching[InjectedProps, GetProps[_]]]): ComponentType[Omit[GetProps[FunctionComponent[Matching[InjectedProps, GetProps[_]]]], String]] = js.native
}

