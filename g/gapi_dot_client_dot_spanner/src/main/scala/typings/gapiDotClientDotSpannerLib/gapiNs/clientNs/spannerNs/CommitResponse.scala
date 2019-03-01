package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitResponse extends js.Object {
  /** The Cloud Spanner timestamp at which the transaction committed. */
  var commitTimestamp: js.UndefOr[java.lang.String] = js.undefined
}

object CommitResponse {
  @scala.inline
  def apply(commitTimestamp: java.lang.String = null): CommitResponse = {
    val __obj = js.Dynamic.literal()
    if (commitTimestamp != null) __obj.updateDynamic("commitTimestamp")(commitTimestamp)
    __obj.asInstanceOf[CommitResponse]
  }
}

