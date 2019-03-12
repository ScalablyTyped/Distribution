package typings
package formikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FormikFormikContext[Values] extends js.Object {
  var formik: formikLib.distTypesMod.FormikContext[Values]
}

object Anon_FormikFormikContext {
  @scala.inline
  def apply[Values](formik: formikLib.distTypesMod.FormikContext[Values]): Anon_FormikFormikContext[Values] = {
    val __obj = js.Dynamic.literal(formik = formik)
  
    __obj.asInstanceOf[Anon_FormikFormikContext[Values]]
  }
}

