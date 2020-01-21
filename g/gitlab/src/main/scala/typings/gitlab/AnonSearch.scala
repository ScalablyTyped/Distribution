package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSearch extends js.Object {
  var search: js.UndefOr[String] = js.undefined
}

object AnonSearch {
  @scala.inline
  def apply(search: String = null): AnonSearch = {
    val __obj = js.Dynamic.literal()
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSearch]
  }
}

