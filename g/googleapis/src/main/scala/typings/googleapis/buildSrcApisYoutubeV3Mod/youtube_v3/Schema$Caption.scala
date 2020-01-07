package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A caption resource represents a YouTube caption track. A caption track is
  * associated with exactly one YouTube video.
  */
@js.native
trait Schema$Caption extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the caption track.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#caption&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the caption.
    */
  var snippet: js.UndefOr[Schema$CaptionSnippet] = js.native
}

object Schema$Caption {
  @scala.inline
  def apply(etag: String = null, id: String = null, kind: String = null, snippet: Schema$CaptionSnippet = null): Schema$Caption = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Caption]
  }
}

