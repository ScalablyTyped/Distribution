package typings
package fastifyDashMultipartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Limits extends js.Object {
  var limits: js.UndefOr[Anon_FieldNameSize] = js.undefined
}

object Anon_Limits {
  @scala.inline
  def apply(limits: Anon_FieldNameSize = null): Anon_Limits = {
    val __obj = js.Dynamic.literal()
    if (limits != null) __obj.updateDynamic("limits")(limits)
    __obj.asInstanceOf[Anon_Limits]
  }
}

