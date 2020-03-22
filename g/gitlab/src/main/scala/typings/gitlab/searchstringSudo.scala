package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  search ? :string} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
trait searchstringSudo extends js.Object {
  var search: js.UndefOr[String] = js.undefined
  var sudo: js.UndefOr[String | Double] = js.undefined
}

object searchstringSudo {
  @scala.inline
  def apply(search: String = null, sudo: String | Double = null): searchstringSudo = {
    val __obj = js.Dynamic.literal()
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[searchstringSudo]
  }
}

