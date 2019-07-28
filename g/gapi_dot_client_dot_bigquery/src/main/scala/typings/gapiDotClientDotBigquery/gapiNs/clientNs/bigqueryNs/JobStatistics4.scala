package typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatistics4 extends js.Object {
  /**
    * [Output-only] Number of files per destination URI or URI pattern specified in the extract configuration. These values will be in the same order as the
    * URIs specified in the 'destinationUris' field.
    */
  var destinationUriFileCounts: js.UndefOr[js.Array[String]] = js.undefined
}

object JobStatistics4 {
  @scala.inline
  def apply(destinationUriFileCounts: js.Array[String] = null): JobStatistics4 = {
    val __obj = js.Dynamic.literal()
    if (destinationUriFileCounts != null) __obj.updateDynamic("destinationUriFileCounts")(destinationUriFileCounts)
    __obj.asInstanceOf[JobStatistics4]
  }
}

