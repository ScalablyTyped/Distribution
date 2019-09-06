package typings.formik

import typings.formik.distFieldArrayMod.FieldArrayConfig
import typings.formik.distTypesMod.FormikConfig
import typings.formik.distTypesMod.FormikContext
import typings.react.reactMod.ComponentType
import typings.react.reactMod.FormHTMLAttributes
import typings.react.reactMod.ProviderProps
import typings.std.HTMLFormElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object formikComponents extends formikProps {
  @scala.inline
  def ErrorMessage: ComponentType[typings.formik.distErrorMessageMod.ErrorMessageProps] = js.constructorOf[typings.formik.formikMod.ErrorMessage].asInstanceOf[typings.react.reactMod.ComponentType[typings.formik.distErrorMessageMod.ErrorMessageProps]]
  @scala.inline
  def FastField: ComponentType[js.Any] = js.constructorOf[typings.formik.formikMod.FastField].asInstanceOf[typings.react.reactMod.ComponentType[js.Any]]
  @scala.inline
  def Field: ComponentType[js.Any] = js.constructorOf[typings.formik.formikMod.Field].asInstanceOf[typings.react.reactMod.ComponentType[js.Any]]
  @scala.inline
  def FieldArray: ComponentType[FieldArrayConfig] = js.constructorOf[typings.formik.formikMod.FieldArray].asInstanceOf[typings.react.reactMod.ComponentType[typings.formik.distFieldArrayMod.FieldArrayConfig]]
  @scala.inline
  def Form: ComponentType[
    Pick[
      FormHTMLAttributes[HTMLFormElement], 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 255 */ js.Any
    ]
  ] = js.constructorOf[typings.formik.formikMod.Form].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.std.Pick[
    typings.react.reactMod.FormHTMLAttributes[typings.std.HTMLFormElement], 
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 255 */ js.Any
  ]]]
  @scala.inline
  def Formik[Values]: ComponentType[FormikConfig[Values]] = js.constructorOf[typings.formik.formikMod.Formik[Values]].asInstanceOf[typings.react.reactMod.ComponentType[typings.formik.distTypesMod.FormikConfig[Values]]]
  @scala.inline
  def FormikProvider: ComponentType[ProviderProps[FormikContext[js.Any]]] = typings.formik.formikMod.^.FormikProvider.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.react.reactMod.ProviderProps[typings.formik.distTypesMod.FormikContext[js.Any]]]]
  @scala.inline
  def distConnectModFormikProvider: ComponentType[ProviderProps[FormikContext[js.Any]]] = typings.formik.distConnectMod.FormikProvider.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.react.reactMod.ProviderProps[typings.formik.distTypesMod.FormikContext[js.Any]]]]
}

