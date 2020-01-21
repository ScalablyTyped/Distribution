package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportVariantsResponse extends js.Object {
  /** IDs of the call sets created during the import. */
  var callSetIds: js.UndefOr[js.Array[String]] = js.undefined
}

object ImportVariantsResponse {
  @scala.inline
  def apply(callSetIds: js.Array[String] = null): ImportVariantsResponse = {
    val __obj = js.Dynamic.literal()
    if (callSetIds != null) __obj.updateDynamic("callSetIds")(callSetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportVariantsResponse]
  }
}

