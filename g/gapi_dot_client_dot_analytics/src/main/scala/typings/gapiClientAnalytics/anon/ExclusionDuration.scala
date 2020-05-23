package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExclusionDuration extends js.Object {
  /** Whether to make the exclusion TEMPORARY or PERMANENT. */
  var exclusionDuration: js.UndefOr[String] = js.undefined
  /** The segment condition that will cause a user to be removed from an audience. */
  var segment: js.UndefOr[String] = js.undefined
}

object ExclusionDuration {
  @scala.inline
  def apply(exclusionDuration: String = null, segment: String = null): ExclusionDuration = {
    val __obj = js.Dynamic.literal()
    if (exclusionDuration != null) __obj.updateDynamic("exclusionDuration")(exclusionDuration.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExclusionDuration]
  }
}

