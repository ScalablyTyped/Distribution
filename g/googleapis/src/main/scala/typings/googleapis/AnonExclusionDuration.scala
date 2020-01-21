package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExclusionDuration extends js.Object {
  var exclusionDuration: js.UndefOr[String] = js.native
  var segment: js.UndefOr[String] = js.native
}

object AnonExclusionDuration {
  @scala.inline
  def apply(exclusionDuration: String = null, segment: String = null): AnonExclusionDuration = {
    val __obj = js.Dynamic.literal()
    if (exclusionDuration != null) __obj.updateDynamic("exclusionDuration")(exclusionDuration.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExclusionDuration]
  }
}

