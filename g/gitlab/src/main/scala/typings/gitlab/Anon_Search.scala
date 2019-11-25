package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Search extends js.Object {
  var search: js.UndefOr[String] = js.undefined
}

object Anon_Search {
  @scala.inline
  def apply(search: String = null): Anon_Search = {
    val __obj = js.Dynamic.literal()
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Search]
  }
}

