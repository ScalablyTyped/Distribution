package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Caption extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the caption track. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#caption". */
  var kind: js.UndefOr[String] = js.undefined
  /** The snippet object contains basic details about the caption. */
  var snippet: js.UndefOr[CaptionSnippet] = js.undefined
}

object Caption {
  @scala.inline
  def apply(etag: String = null, id: String = null, kind: String = null, snippet: CaptionSnippet = null): Caption = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    __obj.asInstanceOf[Caption]
  }
}

