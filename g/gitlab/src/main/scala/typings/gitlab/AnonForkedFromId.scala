package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForkedFromId extends js.Object {
  var forkedFromId: js.UndefOr[Double] = js.undefined
}

object AnonForkedFromId {
  @scala.inline
  def apply(forkedFromId: Int | Double = null): AnonForkedFromId = {
    val __obj = js.Dynamic.literal()
    if (forkedFromId != null) __obj.updateDynamic("forkedFromId")(forkedFromId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForkedFromId]
  }
}

