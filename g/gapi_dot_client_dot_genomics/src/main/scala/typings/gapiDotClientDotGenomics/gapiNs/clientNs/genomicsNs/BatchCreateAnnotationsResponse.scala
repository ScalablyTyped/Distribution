package typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchCreateAnnotationsResponse extends js.Object {
  /**
    * The resulting per-annotation entries, ordered consistently with the
    * original request.
    */
  var entries: js.UndefOr[js.Array[Entry]] = js.undefined
}

object BatchCreateAnnotationsResponse {
  @scala.inline
  def apply(entries: js.Array[Entry] = null): BatchCreateAnnotationsResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    __obj.asInstanceOf[BatchCreateAnnotationsResponse]
  }
}

