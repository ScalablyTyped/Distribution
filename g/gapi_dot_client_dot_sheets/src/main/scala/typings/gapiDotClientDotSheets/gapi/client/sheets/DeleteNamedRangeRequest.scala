package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNamedRangeRequest extends js.Object {
  /** The ID of the named range to delete. */
  var namedRangeId: js.UndefOr[String] = js.undefined
}

object DeleteNamedRangeRequest {
  @scala.inline
  def apply(namedRangeId: String = null): DeleteNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNamedRangeRequest]
  }
}

