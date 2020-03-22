package typings.formik

import typings.formik.fieldArrayMod.FieldArrayConfig
import typings.react.mod.ConsumerProps
import typings.react.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait formikProps {
  @scala.inline
  def ErrorMessageProps: typings.formik.errorMessageMod.ErrorMessageProps.type = typings.formik.errorMessageMod.ErrorMessageProps
  type ErrorMessageProps = typings.formik.errorMessageMod.ErrorMessageProps
  @scala.inline
  def FieldArrayProps: FieldArrayConfig.type = typings.formik.fieldArrayMod.FieldArrayConfig
  type FieldArrayProps = FieldArrayConfig
  @scala.inline
  def FormProps: PickDetailedHTMLPropsForm.type = typings.formik.PickDetailedHTMLPropsForm
  type FormProps = PickDetailedHTMLPropsForm
  type FormikConsumerProps[T] = ConsumerProps[T]
  type FormikProviderProps[T] = ProviderProps[T]
}

