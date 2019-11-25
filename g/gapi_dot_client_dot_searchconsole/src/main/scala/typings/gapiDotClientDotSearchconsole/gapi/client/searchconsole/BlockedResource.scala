package typings.gapiDotClientDotSearchconsole.gapi.client.searchconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockedResource extends js.Object {
  /** URL of the blocked resource. */
  var url: js.UndefOr[String] = js.undefined
}

object BlockedResource {
  @scala.inline
  def apply(url: String = null): BlockedResource = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockedResource]
  }
}

