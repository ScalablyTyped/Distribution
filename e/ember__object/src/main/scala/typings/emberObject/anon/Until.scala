package typings.emberObject.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Until extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var until: js.UndefOr[String] = js.undefined
}

object Until {
  @scala.inline
  def apply(id: String = null, until: String = null): Until = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[Until]
  }
}

