package typings
package formikLib.formikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik", "Formik")
@js.native
class Formik[Values] protected ()
  extends formikLib.distFormikMod.Formik[Values] {
  def this(props: formikLib.distTypesMod.FormikConfig[Values]) = this()
}

/* static members */
@JSImport("formik", "Formik")
@js.native
object Formik extends js.Object {
  var defaultProps: formikLib.Anon_EnableReinitialize = js.native
}

