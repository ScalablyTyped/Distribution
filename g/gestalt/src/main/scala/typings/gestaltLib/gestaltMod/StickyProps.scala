package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyProps extends js.Object {
  var bottom: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var dangerouslySetZIndex: js.UndefOr[gestaltLib.Anon_ZIndex] = js.undefined
  var left: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var right: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var top: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object StickyProps {
  @scala.inline
  def apply(
    bottom: scala.Double | java.lang.String = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    dangerouslySetZIndex: gestaltLib.Anon_ZIndex = null,
    left: scala.Double | java.lang.String = null,
    right: scala.Double | java.lang.String = null,
    top: scala.Double | java.lang.String = null
  ): StickyProps = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dangerouslySetZIndex != null) __obj.updateDynamic("dangerouslySetZIndex")(dangerouslySetZIndex)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyProps]
  }
}

