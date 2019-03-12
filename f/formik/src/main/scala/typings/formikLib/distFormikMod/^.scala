package typings
package formikLib.distFormikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/Formik", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def validateYupSchema[T /* <: formikLib.distTypesMod.FormikValues */](values: T, schema: js.Any): js.Promise[stdLib.Partial[T]] = js.native
  def validateYupSchema[T /* <: formikLib.distTypesMod.FormikValues */](values: T, schema: js.Any, sync: scala.Boolean): js.Promise[stdLib.Partial[T]] = js.native
  def validateYupSchema[T /* <: formikLib.distTypesMod.FormikValues */](values: T, schema: js.Any, sync: scala.Boolean, context: js.Any): js.Promise[stdLib.Partial[T]] = js.native
  def yupToFormErrors[Values](yupError: js.Any): formikLib.distTypesMod.FormikErrors[Values] = js.native
}

