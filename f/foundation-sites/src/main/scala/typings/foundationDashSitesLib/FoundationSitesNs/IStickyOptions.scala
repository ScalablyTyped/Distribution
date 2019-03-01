package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStickyOptions extends js.Object {
  var anchor: js.UndefOr[java.lang.String] = js.undefined
  var btmAnchor: js.UndefOr[java.lang.String] = js.undefined
  var checkEvery: js.UndefOr[scala.Double] = js.undefined
  var container: js.UndefOr[java.lang.String] = js.undefined
  var containerClass: js.UndefOr[java.lang.String] = js.undefined
  var marginBottom: js.UndefOr[scala.Double] = js.undefined
  var marginTop: js.UndefOr[scala.Double] = js.undefined
  var stickTo: js.UndefOr[java.lang.String] = js.undefined
  var stickyClass: js.UndefOr[java.lang.String] = js.undefined
  var stickyOn: js.UndefOr[java.lang.String] = js.undefined
  var topAnchor: js.UndefOr[java.lang.String] = js.undefined
}

object IStickyOptions {
  @scala.inline
  def apply(
    anchor: java.lang.String = null,
    btmAnchor: java.lang.String = null,
    checkEvery: scala.Int | scala.Double = null,
    container: java.lang.String = null,
    containerClass: java.lang.String = null,
    marginBottom: scala.Int | scala.Double = null,
    marginTop: scala.Int | scala.Double = null,
    stickTo: java.lang.String = null,
    stickyClass: java.lang.String = null,
    stickyOn: java.lang.String = null,
    topAnchor: java.lang.String = null
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

