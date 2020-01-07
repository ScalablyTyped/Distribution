package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_IdString extends js.Object {
  var id: js.UndefOr[String] = js.native
}

object Anon_IdString {
  @scala.inline
  def apply(id: String = null): Anon_IdString = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdString]
  }
}

