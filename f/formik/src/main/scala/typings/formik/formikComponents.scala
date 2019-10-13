package typings.formik

import typings.formik.distTypesMod.FormikContext
import typings.react.reactMod.ComponentType
import typings.react.reactMod.FormHTMLAttributes
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object formikComponents extends formikProps {
  @scala.inline
  def ErrorMessage: ComponentType[ErrorMessageProps] = js.constructorOf[typings.formik.formikMod.ErrorMessage].asInstanceOf[typings.react.reactMod.ComponentType[ErrorMessageProps]]
  @scala.inline
  def FastField: ComponentType[js.Any] = js.constructorOf[typings.formik.formikMod.FastField].asInstanceOf[typings.react.reactMod.ComponentType[js.Any]]
  @scala.inline
  def Field: ComponentType[js.Any] = js.constructorOf[typings.formik.formikMod.Field].asInstanceOf[typings.react.reactMod.ComponentType[js.Any]]
  @scala.inline
  def FieldArray: ComponentType[FieldArrayProps] = js.constructorOf[typings.formik.formikMod.FieldArray].asInstanceOf[typings.react.reactMod.ComponentType[FieldArrayProps]]
  @scala.inline
  def Form: ComponentType[
    FormProps[
      FormHTMLAttributes[HTMLFormElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
    ]
  ] = js.constructorOf[typings.formik.formikMod.Form].asInstanceOf[typings.react.reactMod.ComponentType[
  FormProps[
    typings.react.reactMod.FormHTMLAttributes[typings.std.HTMLFormElement], 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
  ]]]
  @scala.inline
  def Formik[Values]: ComponentType[FormikProps[Values]] = js.constructorOf[typings.formik.formikMod.Formik[Values]].asInstanceOf[typings.react.reactMod.ComponentType[FormikProps[Values]]]
  @scala.inline
  def FormikProvider: ComponentType[FormikProviderProps[FormikContext[js.Any]]] = typings.formik.formikMod.FormikProvider.asInstanceOf[typings.react.reactMod.ComponentType[FormikProviderProps[typings.formik.distTypesMod.FormikContext[js.Any]]]]
}

