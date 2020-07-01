package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Available extends js.Object {
  var available: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
}

object Available {
  @scala.inline
  def apply(available: js.UndefOr[Boolean] = js.undefined, name: String = null): Available = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
}

