package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An activity resource contains information about an action that a particular
  * channel, or user, has taken on YouTube.The actions reported in activity
  * feeds include rating a video, sharing a video, marking a video as a
  * favorite, commenting on a video, uploading a video, and so forth. Each
  * activity resource identifies the type of action, the channel associated
  * with the action, and the resource(s) associated with the action, such as
  * the video that was rated or uploaded.
  */
@js.native
trait Schema$Activity extends js.Object {
  /**
    * The contentDetails object contains information about the content
    * associated with the activity. For example, if the snippet.type value is
    * videoRated, then the contentDetails object&#39;s content identifies the
    * rated video.
    */
  var contentDetails: js.UndefOr[Schema$ActivityContentDetails] = js.native
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the activity.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#activity&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the activity, including
    * the activity&#39;s type and group ID.
    */
  var snippet: js.UndefOr[Schema$ActivitySnippet] = js.native
}

object Schema$Activity {
  @scala.inline
  def apply(
    contentDetails: Schema$ActivityContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: Schema$ActivitySnippet = null
  ): Schema$Activity = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Activity]
  }
}

