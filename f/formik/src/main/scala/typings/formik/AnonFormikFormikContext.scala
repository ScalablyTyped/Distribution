package typings.formik

import typings.formik.typesMod.FormikContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormikFormikContext[Values] extends js.Object {
  var formik: FormikContext[Values]
}

object AnonFormikFormikContext {
  @scala.inline
  def apply[Values](formik: FormikContext[Values]): AnonFormikFormikContext[Values] = {
    val __obj = js.Dynamic.literal(formik = formik.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFormikFormikContext[Values]]
  }
}

