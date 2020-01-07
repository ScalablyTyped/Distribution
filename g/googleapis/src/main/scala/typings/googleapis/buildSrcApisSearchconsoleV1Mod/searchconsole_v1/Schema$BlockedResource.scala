package typings.googleapis.buildSrcApisSearchconsoleV1Mod.searchconsole_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Blocked resource.
  */
@js.native
trait Schema$BlockedResource extends js.Object {
  /**
    * URL of the blocked resource.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$BlockedResource {
  @scala.inline
  def apply(url: String = null): Schema$BlockedResource = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BlockedResource]
  }
}

