package typings.formik

import typings.formik.fieldArrayMod.FieldArrayConfig
import typings.formik.typesMod.FormikConfig
import typings.react.mod.ProviderProps
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait formikProps {
  @scala.inline
  def ErrorMessageProps: typings.formik.errorMessageMod.ErrorMessageProps.type = typings.formik.errorMessageMod.ErrorMessageProps
  type ErrorMessageProps = typings.formik.errorMessageMod.ErrorMessageProps
  type FieldArrayProps = FieldArrayConfig
  type FormProps[T, K /* <: String */] = Pick[T, K]
  @scala.inline
  def FormikProps: FormikConfig.type = typings.formik.typesMod.FormikConfig
  type FormikProps[Values] = FormikConfig[Values]
  @scala.inline
  def FormikProviderProps: ProviderProps.type = typings.react.mod.ProviderProps
  type FormikProviderProps[T] = ProviderProps[T]
}

