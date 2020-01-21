package typings.formik

import typings.formik.typesMod.FormikContext
import typings.react.mod.ComponentType
import typings.react.mod.FormHTMLAttributes
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object formikComponents extends formikProps {
  @scala.inline
  def ErrorMessage: ComponentType[ErrorMessageProps] = js.constructorOf[typings.formik.mod.ErrorMessage].asInstanceOf[typings.react.mod.ComponentType[ErrorMessageProps]]
  @scala.inline
  def FastField: ComponentType[js.Any] = js.constructorOf[typings.formik.mod.FastField].asInstanceOf[typings.react.mod.ComponentType[js.Any]]
  @scala.inline
  def Field: ComponentType[js.Any] = js.constructorOf[typings.formik.mod.Field].asInstanceOf[typings.react.mod.ComponentType[js.Any]]
  @scala.inline
  def FieldArray: ComponentType[FieldArrayProps] = js.constructorOf[typings.formik.mod.FieldArray].asInstanceOf[typings.react.mod.ComponentType[FieldArrayProps]]
  @scala.inline
  def Form: ComponentType[
    FormProps[
      FormHTMLAttributes[HTMLFormElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
    ]
  ] = js.constructorOf[typings.formik.mod.Form].asInstanceOf[typings.react.mod.ComponentType[
  FormProps[
    typings.react.mod.FormHTMLAttributes[typings.std.HTMLFormElement], 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
  ]]]
  @scala.inline
  def Formik[Values]: ComponentType[FormikProps[Values]] = js.constructorOf[typings.formik.mod.Formik[Values]].asInstanceOf[typings.react.mod.ComponentType[FormikProps[Values]]]
  @scala.inline
  def FormikProvider: ComponentType[FormikProviderProps[FormikContext[js.Any]]] = typings.formik.mod.FormikProvider.asInstanceOf[typings.react.mod.ComponentType[FormikProviderProps[typings.formik.typesMod.FormikContext[js.Any]]]]
}

