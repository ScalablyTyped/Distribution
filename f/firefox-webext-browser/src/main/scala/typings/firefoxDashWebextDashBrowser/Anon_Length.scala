package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.omnibox.DescriptionStyleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Length extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  var offset: Double
  /** The style type */
  var `type`: DescriptionStyleType
}

object Anon_Length {
  @scala.inline
  def apply(offset: Double, `type`: DescriptionStyleType, length: Int | Double = null): Anon_Length = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Length]
  }
}

