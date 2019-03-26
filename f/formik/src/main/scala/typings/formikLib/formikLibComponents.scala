package typings
package formikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object formikLibComponents {
  @scala.inline
  def ErrorMessage: reactLib.reactMod.ReactNs.ComponentType[formikLib.distErrorMessageMod.ErrorMessageProps] = js.constructorOf[formikLib.formikMod.ErrorMessage].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[formikLib.distErrorMessageMod.ErrorMessageProps]]
  @scala.inline
  def FastField: reactLib.reactMod.ReactNs.ComponentType[js.Any] = js.constructorOf[formikLib.formikMod.FastField].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[js.Any]]
  @scala.inline
  def Field: reactLib.reactMod.ReactNs.ComponentType[js.Any] = js.constructorOf[formikLib.formikMod.Field].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[js.Any]]
  @scala.inline
  def FieldArray: reactLib.reactMod.ReactNs.ComponentType[formikLib.distFieldArrayMod.FieldArrayConfig] = js.constructorOf[formikLib.formikMod.FieldArray].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[formikLib.distFieldArrayMod.FieldArrayConfig]]
  @scala.inline
  def Form: reactLib.reactMod.ReactNs.ComponentType[
    stdLib.Pick[
      reactLib.reactMod.ReactNs.FormHTMLAttributes[stdLib.HTMLFormElement], 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 255 */ js.Any
    ]
  ] = js.constructorOf[formikLib.formikMod.Form].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[
  stdLib.Pick[
    reactLib.reactMod.ReactNs.FormHTMLAttributes[stdLib.HTMLFormElement], 
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 255 */ js.Any
  ]]]
  @scala.inline
  def Formik[Values]: reactLib.reactMod.ReactNs.ComponentType[formikLib.distTypesMod.FormikConfig[Values]] = js.constructorOf[formikLib.formikMod.Formik[Values]].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[formikLib.distTypesMod.FormikConfig[Values]]]
  @scala.inline
  def FormikProvider: reactLib.reactMod.ReactNs.ComponentType[
    createDashReactDashContextLib.createDashReactDashContextMod.ProviderProps[formikLib.distTypesMod.FormikContext[js.Any]]
  ] = js.constructorOf[formikLib.formikMod.FormikProvider].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[
  createDashReactDashContextLib.createDashReactDashContextMod.ProviderProps[formikLib.distTypesMod.FormikContext[js.Any]]]]
  @scala.inline
  def ErrorMessageProps: formikLib.distErrorMessageMod.ErrorMessageProps.type = formikLib.distErrorMessageMod.ErrorMessageProps
  type ErrorMessageProps = formikLib.distErrorMessageMod.ErrorMessageProps
  type FieldArrayConfig = formikLib.distFieldArrayMod.FieldArrayConfig
  @scala.inline
  def FormikConfig: formikLib.distTypesMod.FormikConfig.type = formikLib.distTypesMod.FormikConfig
  type FormikConfig[Values] = formikLib.distTypesMod.FormikConfig[Values]
  type Pick[T, K /* <: java.lang.String */] = stdLib.Pick[T, K]
  @scala.inline
  def ProviderProps: createDashReactDashContextLib.createDashReactDashContextMod.ProviderProps.type = createDashReactDashContextLib.createDashReactDashContextMod.ProviderProps
  type ProviderProps[T] = createDashReactDashContextLib.createDashReactDashContextMod.ProviderProps[T]
}

