package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Available extends js.Object {
  var available: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
}

object Anon_Available {
  @scala.inline
  def apply(available: js.UndefOr[Boolean] = js.undefined, name: String = null): Anon_Available = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Available]
  }
}

