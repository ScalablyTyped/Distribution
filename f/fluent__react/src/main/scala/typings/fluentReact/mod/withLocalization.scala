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
      /* keyof @fluent/react.@fluent/react.Shared<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<react.react.ComponentClass<@fluent/react.@fluent/react.Matching<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<any>>, react.react.ComponentState>>> */ String
    ]
  ]) with (NonReactStatics[
    ComponentClass[Matching[LocalizationProps, GetProps[_]], ComponentState], 
    js.Object
  ]) = js.native
  def apply(component: FunctionComponent[Matching[LocalizationProps, GetProps[_]]]): (ComponentType[
    Omit[
      GetProps[FunctionComponent[Matching[LocalizationProps, GetProps[_]]]], 
      /* keyof @fluent/react.@fluent/react.Shared<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<react.react.FunctionComponent<@fluent/react.@fluent/react.Matching<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<any>>>>> */ String
    ]
  ]) with (NonReactStatics[FunctionComponent[Matching[LocalizationProps, GetProps[_]]], js.Object]) = js.native
}

