package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSize extends js.Object {
  var fileSize: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object FileSize {
  @scala.inline
  def apply(
    fileSize: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    pixelRatio: js.UndefOr[Double] = js.undefined,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): FileSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fileSize)) __obj.updateDynamic("fileSize")(fileSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelRatio)) __obj.updateDynamic("pixelRatio")(pixelRatio.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSize]
  }
}

