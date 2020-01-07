package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiveStreamConfigurationIssue extends js.Object {
  /**
    * The long-form description of the issue and how to resolve it.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The short-form reason for this issue.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * How severe this issue is to the stream.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * The kind of error happening.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$LiveStreamConfigurationIssue {
  @scala.inline
  def apply(description: String = null, reason: String = null, severity: String = null, `type`: String = null): Schema$LiveStreamConfigurationIssue = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveStreamConfigurationIssue]
  }
}

