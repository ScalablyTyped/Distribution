package typings.formik

import typings.formik.distFieldArrayMod.FieldArrayConfig
import typings.formik.distTypesMod.FormikConfig
import typings.react.reactMod.ProviderProps
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait formikProps {
  @scala.inline
  def ErrorMessageProps: typings.formik.distErrorMessageMod.ErrorMessageProps.type = typings.formik.distErrorMessageMod.ErrorMessageProps
  type ErrorMessageProps = typings.formik.distErrorMessageMod.ErrorMessageProps
  type FieldArrayProps = FieldArrayConfig
  type FormProps[T, K /* <: String */] = Pick[T, K]
  @scala.inline
  def FormikProps: FormikConfig.type = typings.formik.distTypesMod.FormikConfig
  type FormikProps[Values] = FormikConfig[Values]
  @scala.inline
  def FormikProviderProps: ProviderProps.type = typings.react.reactMod.ProviderProps
  type FormikProviderProps[T] = ProviderProps[T]
  @scala.inline
  def distConnectModFormikProviderProps: ProviderProps.type = typings.react.reactMod.ProviderProps
  type distConnectModFormikProviderProps[T] = ProviderProps[T]
}

