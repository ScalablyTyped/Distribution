package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForkedFromId extends js.Object {
  var forkedFromId: js.UndefOr[Double] = js.undefined
}

object Anon_ForkedFromId {
  @scala.inline
  def apply(forkedFromId: Int | Double = null): Anon_ForkedFromId = {
    val __obj = js.Dynamic.literal()
    if (forkedFromId != null) __obj.updateDynamic("forkedFromId")(forkedFromId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ForkedFromId]
  }
}

