package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormat extends js.Object {
  /** File type of the video format. */
  var fileType: js.UndefOr[String] = js.undefined
  /** ID of the video format. */
  var id: js.UndefOr[Double] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoFormat". */
  var kind: js.UndefOr[String] = js.undefined
  /** The resolution of this video format. */
  var resolution: js.UndefOr[Size] = js.undefined
  /** The target bit rate of this video format. */
  var targetBitRate: js.UndefOr[Double] = js.undefined
}

object VideoFormat {
  @scala.inline
  def apply(
    fileType: String = null,
    id: Int | Double = null,
    kind: String = null,
    resolution: Size = null,
    targetBitRate: Int | Double = null
  ): VideoFormat = {
    val __obj = js.Dynamic.literal()
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (targetBitRate != null) __obj.updateDynamic("targetBitRate")(targetBitRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFormat]
  }
}

