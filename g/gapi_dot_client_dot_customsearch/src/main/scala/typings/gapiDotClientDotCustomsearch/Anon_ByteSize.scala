package typings.gapiDotClientDotCustomsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ByteSize extends js.Object {
  var byteSize: js.UndefOr[Double] = js.undefined
  var contextLink: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var thumbnailHeight: js.UndefOr[Double] = js.undefined
  var thumbnailLink: js.UndefOr[String] = js.undefined
  var thumbnailWidth: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_ByteSize {
  @scala.inline
  def apply(
    byteSize: Int | Double = null,
    contextLink: String = null,
    height: Int | Double = null,
    thumbnailHeight: Int | Double = null,
    thumbnailLink: String = null,
    thumbnailWidth: Int | Double = null,
    width: Int | Double = null
  ): Anon_ByteSize = {
    val __obj = js.Dynamic.literal()
    if (byteSize != null) __obj.updateDynamic("byteSize")(byteSize.asInstanceOf[js.Any])
    if (contextLink != null) __obj.updateDynamic("contextLink")(contextLink.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (thumbnailHeight != null) __obj.updateDynamic("thumbnailHeight")(thumbnailHeight.asInstanceOf[js.Any])
    if (thumbnailLink != null) __obj.updateDynamic("thumbnailLink")(thumbnailLink.asInstanceOf[js.Any])
    if (thumbnailWidth != null) __obj.updateDynamic("thumbnailWidth")(thumbnailWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ByteSize]
  }
}

