package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormat extends js.Object {
  var fileType: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var resolution: js.UndefOr[Size] = js.undefined
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

