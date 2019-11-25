package typings.gapiDotClientDotClouderrorreporting.gapi.client.clouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackingIssue extends js.Object {
  /**
    * A URL pointing to a related entry in an issue tracking system.
    * Example: https://github.com/user/project/issues/4
    */
  var url: js.UndefOr[String] = js.undefined
}

object TrackingIssue {
  @scala.inline
  def apply(url: String = null): TrackingIssue = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackingIssue]
  }
}

