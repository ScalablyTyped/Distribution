package typings
package formikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distWithFormikMod {
  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[
    /* component */ CompositeComponent[TMergedProps], 
    reactLib.reactMod.ReactNs.ComponentType[TOwnProps]
  ]
  type CompositeComponent[P] = (reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[P]
  type FormikBag[P, V] = formikLib.Anon_Props[P] with formikLib.distTypesMod.FormikActions[V]
  type InferableComponentDecorator[TOwnProps] = js.Function1[/* component */ CompositeComponent[TOwnProps], CompositeComponent[TOwnProps]]
  type InjectedFormikProps[Props, Values] = Props with formikLib.distTypesMod.FormikProps[Values]
}
