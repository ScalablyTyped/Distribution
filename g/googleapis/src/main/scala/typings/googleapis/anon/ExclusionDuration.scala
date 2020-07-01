package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExclusionDuration extends js.Object {
  var exclusionDuration: js.UndefOr[String] = js.native
  var segment: js.UndefOr[String] = js.native
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

