package typings.atEmberObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdUntil extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var until: js.UndefOr[String] = js.undefined
}

object Anon_IdUntil {
  @scala.inline
  def apply(id: String = null, until: String = null): Anon_IdUntil = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdUntil]
  }
}

