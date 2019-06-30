package typings
package formikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait formikLibProps {
  @scala.inline
  def ErrorMessageProps: formikLib.distErrorMessageMod.ErrorMessageProps.type = formikLib.distErrorMessageMod.ErrorMessageProps
  type ErrorMessageProps = formikLib.distErrorMessageMod.ErrorMessageProps
  type FieldArrayProps = formikLib.distFieldArrayMod.FieldArrayConfig
  type FormProps[T, K /* <: java.lang.String */] = stdLib.Pick[T, K]
  @scala.inline
  def FormikProps: formikLib.distTypesMod.FormikConfig.type = formikLib.distTypesMod.FormikConfig
  type FormikProps[Values] = formikLib.distTypesMod.FormikConfig[Values]
  @scala.inline
  def FormikProviderProps: reactLib.reactMod.ProviderProps.type = reactLib.reactMod.ProviderProps
  type FormikProviderProps[T] = reactLib.reactMod.ProviderProps[T]
}

