package typings
package gapiDotClientDotSurveysLib.gapiNs.clientNs.surveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenPagination extends js.Object {
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var previousPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object TokenPagination {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, previousPageToken: java.lang.String = null): TokenPagination = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (previousPageToken != null) __obj.updateDynamic("previousPageToken")(previousPageToken)
    __obj.asInstanceOf[TokenPagination]
  }
}

