package typings.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerSubTitle extends js.Object {
  var bottom: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[SubTitleType] = js.undefined
  var url: String
}

object DPlayerSubTitle {
  @scala.inline
  def apply(
    url: String,
    bottom: String = null,
    color: String = null,
    fontSize: String = null,
    `type`: SubTitleType = null
  ): DPlayerSubTitle = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerSubTitle]
  }
}

