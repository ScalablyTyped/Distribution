package typings
package gapiDotClientDotCustomsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ByteSize extends js.Object {
  var byteSize: js.UndefOr[scala.Double] = js.undefined
  var contextLink: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var thumbnailHeight: js.UndefOr[scala.Double] = js.undefined
  var thumbnailLink: js.UndefOr[java.lang.String] = js.undefined
  var thumbnailWidth: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ByteSize {
  @scala.inline
  def apply(
    byteSize: scala.Int | scala.Double = null,
    contextLink: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    thumbnailHeight: scala.Int | scala.Double = null,
    thumbnailLink: java.lang.String = null,
    thumbnailWidth: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_ByteSize = {
    val __obj = js.Dynamic.literal()
    if (byteSize != null) __obj.updateDynamic("byteSize")(byteSize.asInstanceOf[js.Any])
    if (contextLink != null) __obj.updateDynamic("contextLink")(contextLink)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (thumbnailHeight != null) __obj.updateDynamic("thumbnailHeight")(thumbnailHeight.asInstanceOf[js.Any])
    if (thumbnailLink != null) __obj.updateDynamic("thumbnailLink")(thumbnailLink)
    if (thumbnailWidth != null) __obj.updateDynamic("thumbnailWidth")(thumbnailWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ByteSize]
  }
}

