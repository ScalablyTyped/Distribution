package typings.atFluentReact.atFluentReactMod

import typings.hoistDashNonDashReactDashStatics.hoistDashNonDashReactDashStaticsMod.NonReactStatics
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fluent/react", "withLocalization")
@js.native
object withLocalization extends js.Object {
  def apply(component: ComponentClass[Matching[LocalizationProps, GetProps[_]], ComponentState]): (ComponentType[
    Omit[
      GetProps[ComponentClass[Matching[LocalizationProps, GetProps[_]], ComponentState]], 
      String
    ]
  ]) with (NonReactStatics[
    ComponentClass[Matching[LocalizationProps, GetProps[_]], ComponentState], 
    js.Object
  ]) = js.native
  def apply(component: FunctionComponent[Matching[LocalizationProps, GetProps[_]]]): (ComponentType[
    Omit[GetProps[FunctionComponent[Matching[LocalizationProps, GetProps[_]]]], String]
  ]) with (NonReactStatics[FunctionComponent[Matching[LocalizationProps, GetProps[_]]], js.Object]) = js.native
}

