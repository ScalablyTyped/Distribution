package typings.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distWithFormikMod {
  import typings.formik.Anon_Props
  import typings.formik.distTypesMod.FormikActions
  import typings.formik.distTypesMod.FormikProps
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.ComponentType
  import typings.react.reactMod.StatelessComponent

  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[/* component */ CompositeComponent[TMergedProps], ComponentType[TOwnProps]]
  type CompositeComponent[P] = (ComponentClass[P, ComponentState]) | StatelessComponent[P]
  type FormikBag[P, V] = Anon_Props[P] with FormikActions[V]
  type InferableComponentDecorator[TOwnProps] = js.Function1[/* component */ CompositeComponent[TOwnProps], CompositeComponent[TOwnProps]]
  type InjectedFormikProps[Props, Values] = Props with FormikProps[Values]
}
