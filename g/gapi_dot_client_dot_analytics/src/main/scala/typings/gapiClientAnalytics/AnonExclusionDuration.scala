package typings.gapiClientAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExclusionDuration extends js.Object {
  /** Whether to make the exclusion TEMPORARY or PERMANENT. */
  var exclusionDuration: js.UndefOr[String] = js.undefined
  /** The segment condition that will cause a user to be removed from an audience. */
  var segment: js.UndefOr[String] = js.undefined
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

