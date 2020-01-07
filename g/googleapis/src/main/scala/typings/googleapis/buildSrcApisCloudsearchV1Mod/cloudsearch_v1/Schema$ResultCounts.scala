package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result count information
  */
@js.native
trait Schema$ResultCounts extends js.Object {
  /**
    * Result count information for each source with results.
    */
  var sourceResultCounts: js.UndefOr[js.Array[Schema$SourceResultCount]] = js.native
}

object Schema$ResultCounts {
  @scala.inline
  def apply(sourceResultCounts: js.Array[Schema$SourceResultCount] = null): Schema$ResultCounts = {
    val __obj = js.Dynamic.literal()
    if (sourceResultCounts != null) __obj.updateDynamic("sourceResultCounts")(sourceResultCounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResultCounts]
  }
}

