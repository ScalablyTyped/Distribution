package typings.gitlab.distInfrastructureMod

import typings.std.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultRequestOptions extends Sudo {
  var body: js.UndefOr[js.Object | FormData] = js.undefined
  var query: js.UndefOr[js.Object] = js.undefined
}

object DefaultRequestOptions {
  @scala.inline
  def apply(body: js.Object | FormData = null, query: js.Object = null, sudo: String | Double = null): DefaultRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultRequestOptions]
  }
}

