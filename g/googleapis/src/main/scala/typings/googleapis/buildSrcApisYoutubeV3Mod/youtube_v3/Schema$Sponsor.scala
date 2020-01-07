package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A sponsor resource represents a sponsor for a YouTube channel. A sponsor
  * provides recurring monetary support to a creator and receives special
  * benefits.
  */
@js.native
trait Schema$Sponsor extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#sponsor&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the sponsor.
    */
  var snippet: js.UndefOr[Schema$SponsorSnippet] = js.native
}

object Schema$Sponsor {
  @scala.inline
  def apply(etag: String = null, kind: String = null, snippet: Schema$SponsorSnippet = null): Schema$Sponsor = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Sponsor]
  }
}

