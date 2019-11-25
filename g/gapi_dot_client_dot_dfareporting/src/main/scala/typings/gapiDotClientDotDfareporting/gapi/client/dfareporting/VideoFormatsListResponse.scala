package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormatsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoFormatsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Video format collection. */
  var videoFormats: js.UndefOr[js.Array[VideoFormat]] = js.undefined
}

object VideoFormatsListResponse {
  @scala.inline
  def apply(kind: String = null, videoFormats: js.Array[VideoFormat] = null): VideoFormatsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (videoFormats != null) __obj.updateDynamic("videoFormats")(videoFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFormatsListResponse]
  }
}

