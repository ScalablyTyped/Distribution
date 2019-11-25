package typings.gapiDotClientDotPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  /** The height, in pixels, of the linked resource. */
  var height: js.UndefOr[Double] = js.undefined
  /** Media type of the link. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Image url. */
  var url: js.UndefOr[String] = js.undefined
  /** The width, in pixels, of the linked resource. */
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(height: Int | Double = null, `type`: String = null, url: String = null, width: Int | Double = null): Anon_Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Height]
  }
}

