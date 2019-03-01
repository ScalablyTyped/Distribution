package typings
package dplayerLib.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerSubTitle extends js.Object {
  var bottom: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[SubTitleType] = js.undefined
  var url: java.lang.String
}

object DPlayerSubTitle {
  @scala.inline
  def apply(
    url: java.lang.String,
    bottom: java.lang.String = null,
    color: java.lang.String = null,
    fontSize: java.lang.String = null,
    `type`: SubTitleType = null
  ): DPlayerSubTitle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DPlayerSubTitle]
  }
}

