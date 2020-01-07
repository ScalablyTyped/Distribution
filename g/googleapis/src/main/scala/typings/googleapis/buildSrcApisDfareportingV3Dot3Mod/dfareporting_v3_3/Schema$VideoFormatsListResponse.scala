package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video Format List Response
  */
@js.native
trait Schema$VideoFormatsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#videoFormatsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Video format collection.
    */
  var videoFormats: js.UndefOr[js.Array[Schema$VideoFormat]] = js.native
}

object Schema$VideoFormatsListResponse {
  @scala.inline
  def apply(kind: String = null, videoFormats: js.Array[Schema$VideoFormat] = null): Schema$VideoFormatsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (videoFormats != null) __obj.updateDynamic("videoFormats")(videoFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoFormatsListResponse]
  }
}

