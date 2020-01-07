package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Commit.
  */
@js.native
trait Schema$CommitResponse extends js.Object {
  /**
    * The Cloud Spanner timestamp at which the transaction committed.
    */
  var commitTimestamp: js.UndefOr[String] = js.native
}

object Schema$CommitResponse {
  @scala.inline
  def apply(commitTimestamp: String = null): Schema$CommitResponse = {
    val __obj = js.Dynamic.literal()
    if (commitTimestamp != null) __obj.updateDynamic("commitTimestamp")(commitTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CommitResponse]
  }
}

