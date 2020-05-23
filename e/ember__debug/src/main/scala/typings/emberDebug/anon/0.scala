package typings.emberDebug.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var id: js.UndefOr[String] = js.undefined
}

object `0` {
  @scala.inline
  def apply(id: String = null): `0` = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

