package typings.foundation.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopbarOptions extends js.Object {
  var back_text: js.UndefOr[String] = js.undefined
  var custom_back_text: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var is_hover: js.UndefOr[Boolean] = js.undefined
  var mobile_show_parent_link: js.UndefOr[Boolean] = js.undefined
  var scrolltop: js.UndefOr[Boolean] = js.undefined
  var sticky_class: js.UndefOr[String] = js.undefined
  var sticky_on: js.UndefOr[String] = js.undefined
}

object TopbarOptions {
  @scala.inline
  def apply(
    back_text: String = null,
    custom_back_text: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    is_hover: js.UndefOr[Boolean] = js.undefined,
    mobile_show_parent_link: js.UndefOr[Boolean] = js.undefined,
    scrolltop: js.UndefOr[Boolean] = js.undefined,
    sticky_class: String = null,
    sticky_on: String = null
  ): TopbarOptions = {
    val __obj = js.Dynamic.literal()
    if (back_text != null) __obj.updateDynamic("back_text")(back_text)
    if (!js.isUndefined(custom_back_text)) __obj.updateDynamic("custom_back_text")(custom_back_text)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(is_hover)) __obj.updateDynamic("is_hover")(is_hover)
    if (!js.isUndefined(mobile_show_parent_link)) __obj.updateDynamic("mobile_show_parent_link")(mobile_show_parent_link)
    if (!js.isUndefined(scrolltop)) __obj.updateDynamic("scrolltop")(scrolltop)
    if (sticky_class != null) __obj.updateDynamic("sticky_class")(sticky_class)
    if (sticky_on != null) __obj.updateDynamic("sticky_on")(sticky_on)
    __obj.asInstanceOf[TopbarOptions]
  }
}

