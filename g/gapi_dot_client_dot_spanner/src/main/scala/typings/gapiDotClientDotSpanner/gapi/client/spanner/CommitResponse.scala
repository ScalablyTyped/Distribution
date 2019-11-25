package typings.gapiDotClientDotSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitResponse extends js.Object {
  /** The Cloud Spanner timestamp at which the transaction committed. */
  var commitTimestamp: js.UndefOr[String] = js.undefined
}

object CommitResponse {
  @scala.inline
  def apply(commitTimestamp: String = null): CommitResponse = {
    val __obj = js.Dynamic.literal()
    if (commitTimestamp != null) __obj.updateDynamic("commitTimestamp")(commitTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitResponse]
  }
}

