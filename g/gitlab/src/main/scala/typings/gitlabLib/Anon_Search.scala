package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Search extends js.Object {
  var search: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Search {
  @scala.inline
  def apply(search: java.lang.String = null): Anon_Search = {
    val __obj = js.Dynamic.literal()
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[Anon_Search]
  }
}

