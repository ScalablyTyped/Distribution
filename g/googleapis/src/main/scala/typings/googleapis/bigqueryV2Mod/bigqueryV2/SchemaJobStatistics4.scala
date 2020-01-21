package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaJobStatistics4 extends js.Object {
  /**
    * [Output-only] Number of files per destination URI or URI pattern
    * specified in the extract configuration. These values will be in the same
    * order as the URIs specified in the &#39;destinationUris&#39; field.
    */
  var destinationUriFileCounts: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output-only] Number of user bytes extracted into the result. This is the
    * byte count as computed by BigQuery for billing purposes.
    */
  var inputBytes: js.UndefOr[String] = js.native
}

object SchemaJobStatistics4 {
  @scala.inline
  def apply(destinationUriFileCounts: js.Array[String] = null, inputBytes: String = null): SchemaJobStatistics4 = {
    val __obj = js.Dynamic.literal()
    if (destinationUriFileCounts != null) __obj.updateDynamic("destinationUriFileCounts")(destinationUriFileCounts.asInstanceOf[js.Any])
    if (inputBytes != null) __obj.updateDynamic("inputBytes")(inputBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJobStatistics4]
  }
}

