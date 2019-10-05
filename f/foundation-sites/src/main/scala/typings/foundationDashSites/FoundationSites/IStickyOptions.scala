package typings.foundationDashSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStickyOptions extends js.Object {
  var anchor: js.UndefOr[String] = js.undefined
  var btmAnchor: js.UndefOr[String] = js.undefined
  var checkEvery: js.UndefOr[Double] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var containerClass: js.UndefOr[String] = js.undefined
  var marginBottom: js.UndefOr[Double] = js.undefined
  var marginTop: js.UndefOr[Double] = js.undefined
  var stickTo: js.UndefOr[String] = js.undefined
  var stickyClass: js.UndefOr[String] = js.undefined
  var stickyOn: js.UndefOr[String] = js.undefined
  var topAnchor: js.UndefOr[String] = js.undefined
}

object IStickyOptions {
  @scala.inline
  def apply(
    anchor: String = null,
    btmAnchor: String = null,
    checkEvery: Int | Double = null,
    container: String = null,
    containerClass: String = null,
    marginBottom: Int | Double = null,
    marginTop: Int | Double = null,
    stickTo: String = null,
    stickyClass: String = null,
    stickyOn: String = null,
    topAnchor: String = null
  ): IStickyOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (btmAnchor != null) __obj.updateDynamic("btmAnchor")(btmAnchor)
    if (checkEvery != null) __obj.updateDynamic("checkEvery")(checkEvery.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container)
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass)
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (stickTo != null) __obj.updateDynamic("stickTo")(stickTo)
    if (stickyClass != null) __obj.updateDynamic("stickyClass")(stickyClass)
    if (stickyOn != null) __obj.updateDynamic("stickyOn")(stickyOn)
    if (topAnchor != null) __obj.updateDynamic("topAnchor")(topAnchor)
    __obj.asInstanceOf[IStickyOptions]
  }
}

