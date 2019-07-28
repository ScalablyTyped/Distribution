package typings.foundation.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/interchange.html#custom-named-queries
trait InterchangeOptions extends js.Object {
  var directives: js.UndefOr[js.Object] = js.undefined
  var load_attr: js.UndefOr[String] = js.undefined
  var named_queries: js.UndefOr[js.Object] = js.undefined
}

object InterchangeOptions {
  @scala.inline
  def apply(directives: js.Object = null, load_attr: String = null, named_queries: js.Object = null): InterchangeOptions = {
    val __obj = js.Dynamic.literal()
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (load_attr != null) __obj.updateDynamic("load_attr")(load_attr)
    if (named_queries != null) __obj.updateDynamic("named_queries")(named_queries)
    __obj.asInstanceOf[InterchangeOptions]
  }
}

