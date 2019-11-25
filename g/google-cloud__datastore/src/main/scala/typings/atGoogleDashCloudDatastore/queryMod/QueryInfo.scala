package typings.atGoogleDashCloudDatastore.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryInfo extends js.Object {
  var endCursor: js.UndefOr[String] = js.undefined
  val moreResults: MoreResultsAfterCursor | MoreResultsAfterLimit | NoMoreResults
}

object QueryInfo {
  @scala.inline
  def apply(
    moreResults: MoreResultsAfterCursor | MoreResultsAfterLimit | NoMoreResults,
    endCursor: String = null
  ): QueryInfo = {
    val __obj = js.Dynamic.literal(moreResults = moreResults.asInstanceOf[js.Any])
    if (endCursor != null) __obj.updateDynamic("endCursor")(endCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInfo]
  }
}

