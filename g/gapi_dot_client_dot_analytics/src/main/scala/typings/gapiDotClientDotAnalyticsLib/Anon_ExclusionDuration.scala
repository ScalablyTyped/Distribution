package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExclusionDuration extends js.Object {
  /** Whether to make the exclusion TEMPORARY or PERMANENT. */
  var exclusionDuration: js.UndefOr[java.lang.String] = js.undefined
  /** The segment condition that will cause a user to be removed from an audience. */
  var segment: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ExclusionDuration {
  @scala.inline
  def apply(exclusionDuration: java.lang.String = null, segment: java.lang.String = null): Anon_ExclusionDuration = {
    val __obj = js.Dynamic.literal()
    if (exclusionDuration != null) __obj.updateDynamic("exclusionDuration")(exclusionDuration)
    if (segment != null) __obj.updateDynamic("segment")(segment)
    __obj.asInstanceOf[Anon_ExclusionDuration]
  }
}

