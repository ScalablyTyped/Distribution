package typings.fluentReact.mod

import typings.hoistNonReactStatics.mod.NonReactStatics
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
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

