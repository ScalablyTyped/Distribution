package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A live stream describes a live ingestion point.
  */
@js.native
trait Schema$LiveStream extends js.Object {
  /**
    * The cdn object defines the live stream&#39;s content delivery network
    * (CDN) settings. These settings provide details about the manner in which
    * you stream your content to YouTube.
    */
  var cdn: js.UndefOr[Schema$CdnSettings] = js.native
  /**
    * The content_details object contains information about the stream,
    * including the closed captions ingestion URL.
    */
  var contentDetails: js.UndefOr[Schema$LiveStreamContentDetails] = js.native
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube assigns to uniquely identify the stream.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#liveStream&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the stream, including its
    * channel, title, and description.
    */
  var snippet: js.UndefOr[Schema$LiveStreamSnippet] = js.native
  /**
    * The status object contains information about live stream&#39;s status.
    */
  var status: js.UndefOr[Schema$LiveStreamStatus] = js.native
}

object Schema$LiveStream {
  @scala.inline
  def apply(
    cdn: Schema$CdnSettings = null,
    contentDetails: Schema$LiveStreamContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: Schema$LiveStreamSnippet = null,
    status: Schema$LiveStreamStatus = null
  ): Schema$LiveStream = {
    val __obj = js.Dynamic.literal()
    if (cdn != null) __obj.updateDynamic("cdn")(cdn.asInstanceOf[js.Any])
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveStream]
  }
}

