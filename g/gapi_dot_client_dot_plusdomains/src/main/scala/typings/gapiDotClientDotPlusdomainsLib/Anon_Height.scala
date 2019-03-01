package typings
package gapiDotClientDotPlusdomainsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  /** The height, in pixels, of the linked resource. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Media type of the link. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Image url. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** The width, in pixels, of the linked resource. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Anon_Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Height]
  }
}

