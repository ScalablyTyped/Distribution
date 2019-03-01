package typings
package atGoogleDashCloudDatastoreLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryInfo extends js.Object {
  var endCursor: js.UndefOr[java.lang.String] = js.undefined
  val moreResults: MoreResultsAfterCursor | MoreResultsAfterLimit | NoMoreResults
}

object QueryInfo {
  @scala.inline
  def apply(
    moreResults: MoreResultsAfterCursor | MoreResultsAfterLimit | NoMoreResults,
    endCursor: java.lang.String = null
  ): QueryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("moreResults")(moreResults.asInstanceOf[js.Any])
    if (endCursor != null) __obj.updateDynamic("endCursor")(endCursor)
    __obj.asInstanceOf[QueryInfo]
  }
}

