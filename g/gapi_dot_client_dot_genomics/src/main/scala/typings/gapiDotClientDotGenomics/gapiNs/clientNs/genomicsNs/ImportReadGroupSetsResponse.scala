package typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportReadGroupSetsResponse extends js.Object {
  /** IDs of the read group sets that were created. */
  var readGroupSetIds: js.UndefOr[js.Array[String]] = js.undefined
}

object ImportReadGroupSetsResponse {
  @scala.inline
  def apply(readGroupSetIds: js.Array[String] = null): ImportReadGroupSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (readGroupSetIds != null) __obj.updateDynamic("readGroupSetIds")(readGroupSetIds)
    __obj.asInstanceOf[ImportReadGroupSetsResponse]
  }
}

