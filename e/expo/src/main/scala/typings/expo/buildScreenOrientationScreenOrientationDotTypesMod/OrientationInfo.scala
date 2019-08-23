package typings.expo.buildScreenOrientationScreenOrientationDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrientationInfo extends js.Object {
  var horizontalSizeClass: js.UndefOr[SizeClassIOS] = js.undefined
  var orientation: Orientation
  var verticalSizeClass: js.UndefOr[SizeClassIOS] = js.undefined
}

object OrientationInfo {
  @scala.inline
  def apply(
    orientation: Orientation,
    horizontalSizeClass: SizeClassIOS = null,
    verticalSizeClass: SizeClassIOS = null
  ): OrientationInfo = {
    val __obj = js.Dynamic.literal(orientation = orientation)
    if (horizontalSizeClass != null) __obj.updateDynamic("horizontalSizeClass")(horizontalSizeClass)
    if (verticalSizeClass != null) __obj.updateDynamic("verticalSizeClass")(verticalSizeClass)
    __obj.asInstanceOf[OrientationInfo]
  }
}

