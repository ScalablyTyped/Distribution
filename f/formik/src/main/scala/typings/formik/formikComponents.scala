package typings.formik

import typings.formik.mod
import typings.formik.typesMod.FormikConfig
import typings.formik.typesMod.FormikContextType
import typings.formik.typesMod.FormikValues
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object formikComponents extends formikProps {
  @scala.inline
  def ErrorMessage: ComponentType[ErrorMessageProps] = js.constructorOf[typings.formik.mod.ErrorMessage].asInstanceOf[ComponentType[ErrorMessageProps]]
  @scala.inline
  def FastField: ComponentType[js.Any] = js.constructorOf[typings.formik.mod.FastField].asInstanceOf[ComponentType[js.Any]]
  @scala.inline
  def FieldArray: ComponentType[FieldArrayProps] = js.constructorOf[typings.formik.mod.FieldArray].asInstanceOf[ComponentType[FieldArrayProps]]
  @scala.inline
  def Form: ComponentType[FormProps] = typings.formik.mod.Form.asInstanceOf[ComponentType[FormProps]]
  @scala.inline
  def Formik[Values /* <: FormikValues */, ExtraProps]: ComponentType[FormikConfig[Values] with ExtraProps] = mod.asInstanceOf[js.Dynamic].selectDynamic("Formik").asInstanceOf[ComponentType[FormikConfig[Values] with ExtraProps]]
  @scala.inline
  def FormikConsumer: ComponentType[FormikConsumerProps[FormikContextType[js.Any]]] = typings.formik.mod.FormikConsumer.asInstanceOf[ComponentType[FormikConsumerProps[FormikContextType[js.Any]]]]
  @scala.inline
  def FormikProvider: ComponentType[FormikProviderProps[FormikContextType[js.Any]]] = typings.formik.mod.FormikProvider.asInstanceOf[ComponentType[FormikProviderProps[FormikContextType[js.Any]]]]
}

