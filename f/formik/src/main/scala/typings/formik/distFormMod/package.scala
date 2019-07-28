package typings.formik

import typings.formik.formikStrings.onReset
import typings.formik.formikStrings.onSubmit
import typings.react.reactMod.FormHTMLAttributes
import typings.std.Exclude
import typings.std.HTMLFormElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFormMod {
  type FormikFormProps = Pick[FormHTMLAttributes[HTMLFormElement], Exclude[String, onReset | onSubmit]]
}
