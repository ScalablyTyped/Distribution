package typings.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object withFormikMod {
  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[
    /* component */ typings.formik.withFormikMod.CompositeComponent[TMergedProps], 
    typings.react.mod.ComponentType[TOwnProps]
  ]
  type CompositeComponent[P] = (typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState]) | typings.react.mod.StatelessComponent[P]
  type InferableComponentDecorator[TOwnProps] = js.Function1[
    /* component */ typings.formik.withFormikMod.CompositeComponent[TOwnProps], 
    typings.formik.withFormikMod.CompositeComponent[TOwnProps]
  ]
  type InjectedFormikProps[Props, Values] = Props with typings.formik.typesMod.FormikProps[Values]
}
