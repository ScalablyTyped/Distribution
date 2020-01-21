package typings.emberObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdUntil extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var until: js.UndefOr[String] = js.undefined
}

object AnonIdUntil {
  @scala.inline
  def apply(id: String = null, until: String = null): AnonIdUntil = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdUntil]
  }
}

