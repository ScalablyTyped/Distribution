package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAspectRatio extends js.Object {
  var aspectRatio: js.UndefOr[String] = js.native
  var minHeight: js.UndefOr[String] = js.native
  var minWidth: js.UndefOr[String] = js.native
}

object AnonAspectRatio {
  @scala.inline
  def apply(aspectRatio: String = null, minHeight: String = null, minWidth: String = null): AnonAspectRatio = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAspectRatio]
  }
}

