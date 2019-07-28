package typings.formik.formikMod

import typings.formik.Anon_EnableReinitialize
import typings.formik.distTypesMod.FormikConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik", "Formik")
@js.native
class Formik[Values] protected ()
  extends typings.formik.distFormikMod.Formik[Values] {
  def this(props: FormikConfig[Values]) = this()
}

/* static members */
@JSImport("formik", "Formik")
@js.native
object Formik extends js.Object {
  var defaultProps: Anon_EnableReinitialize = js.native
}

