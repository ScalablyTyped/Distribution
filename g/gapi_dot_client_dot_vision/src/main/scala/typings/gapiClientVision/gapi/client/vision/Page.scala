package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  /** List of blocks of text, images etc on this page. */
  var blocks: js.UndefOr[js.Array[Block]] = js.undefined
  /** Page height in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  /** Additional information detected on the page. */
  var property: js.UndefOr[TextProperty] = js.undefined
  /** Page width in pixels. */
  var width: js.UndefOr[Double] = js.undefined
}

object Page {
  @scala.inline
  def apply(
    blocks: js.Array[Block] = null,
    height: Int | Double = null,
    property: TextProperty = null,
    width: Int | Double = null
  ): Page = {
    val __obj = js.Dynamic.literal()
    if (blocks != null) __obj.updateDynamic("blocks")(blocks.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

