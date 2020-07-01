package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdString extends js.Object {
  var id: js.UndefOr[String] = js.native
}

object IdString {
  @scala.inline
  def apply(id: String = null): IdString = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdString]
  }
}

