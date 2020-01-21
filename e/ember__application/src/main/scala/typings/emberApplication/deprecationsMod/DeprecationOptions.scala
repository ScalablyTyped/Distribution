package typings.emberApplication.deprecationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecationOptions extends js.Object {
  var id: String
  var until: String
  var url: js.UndefOr[String] = js.undefined
}

object DeprecationOptions {
  @scala.inline
  def apply(id: String, until: String, url: String = null): DeprecationOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecationOptions]
  }
}

