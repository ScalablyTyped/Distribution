package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStream extends js.Object {
  /**
    * The cdn object defines the live stream's content delivery network (CDN) settings. These settings provide details about the manner in which you stream
    * your content to YouTube.
    */
  var cdn: js.UndefOr[CdnSettings] = js.undefined
  /** The content_details object contains information about the stream, including the closed captions ingestion URL. */
  var contentDetails: js.UndefOr[LiveStreamContentDetails] = js.undefined
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID that YouTube assigns to uniquely identify the stream. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#liveStream". */
  var kind: js.UndefOr[String] = js.undefined
  /** The snippet object contains basic details about the stream, including its channel, title, and description. */
  var snippet: js.UndefOr[LiveStreamSnippet] = js.undefined
  /** The status object contains information about live stream's status. */
  var status: js.UndefOr[LiveStreamStatus] = js.undefined
}

object LiveStream {
  @scala.inline
  def apply(
    cdn: CdnSettings = null,
    contentDetails: LiveStreamContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: LiveStreamSnippet = null,
    status: LiveStreamStatus = null
  ): LiveStream = {
    val __obj = js.Dynamic.literal()
    if (cdn != null) __obj.updateDynamic("cdn")(cdn.asInstanceOf[js.Any])
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveStream]
  }
}

