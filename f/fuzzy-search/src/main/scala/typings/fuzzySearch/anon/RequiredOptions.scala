package typings.fuzzySearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<fuzzy-search.fuzzy-search.Options> */
trait RequiredOptions extends js.Object {
  var caseSensitive: Boolean
  var sort: Boolean
}

object RequiredOptions {
  @scala.inline
  def apply(caseSensitive: Boolean, sort: Boolean): RequiredOptions = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredOptions]
  }
}

