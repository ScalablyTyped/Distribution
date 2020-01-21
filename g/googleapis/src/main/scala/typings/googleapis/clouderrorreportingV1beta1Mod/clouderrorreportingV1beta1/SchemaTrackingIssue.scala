package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information related to tracking the progress on resolving the error.
  */
@js.native
trait SchemaTrackingIssue extends js.Object {
  /**
    * A URL pointing to a related entry in an issue tracking system. Example:
    * https://github.com/user/project/issues/4
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaTrackingIssue {
  @scala.inline
  def apply(url: String = null): SchemaTrackingIssue = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTrackingIssue]
  }
}

