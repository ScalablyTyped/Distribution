package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.omnibox.DescriptionStyleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Length extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  var offset: Double
  /** The style type */
  var `type`: DescriptionStyleType
}

object Length {
  @scala.inline
  def apply(offset: Double, `type`: DescriptionStyleType, length: js.UndefOr[Double] = js.undefined): Length = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
}

