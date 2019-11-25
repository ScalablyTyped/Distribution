package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  /**
    * The contentDetails object contains information about the content associated with the activity. For example, if the snippet.type value is videoRated,
    * then the contentDetails object's content identifies the rated video.
    */
  var contentDetails: js.UndefOr[ActivityContentDetails] = js.undefined
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the activity. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#activity". */
  var kind: js.UndefOr[String] = js.undefined
  /** The snippet object contains basic details about the activity, including the activity's type and group ID. */
  var snippet: js.UndefOr[ActivitySnippet] = js.undefined
}

object Activity {
  @scala.inline
  def apply(
    contentDetails: ActivityContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: ActivitySnippet = null
  ): Activity = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
}

