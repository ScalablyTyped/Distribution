package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormatsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoFormatsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Video format collection. */
  var videoFormats: js.UndefOr[js.Array[VideoFormat]] = js.undefined
}

object VideoFormatsListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, videoFormats: js.Array[VideoFormat] = null): VideoFormatsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (videoFormats != null) __obj.updateDynamic("videoFormats")(videoFormats)
    __obj.asInstanceOf[VideoFormatsListResponse]
  }
}

