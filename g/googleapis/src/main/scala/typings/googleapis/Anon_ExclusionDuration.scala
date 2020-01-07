package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ExclusionDuration extends js.Object {
  var exclusionDuration: js.UndefOr[String] = js.native
  var segment: js.UndefOr[String] = js.native
}

object Anon_ExclusionDuration {
  @scala.inline
  def apply(exclusionDuration: String = null, segment: String = null): Anon_ExclusionDuration = {
    val __obj = js.Dynamic.literal()
    if (exclusionDuration != null) __obj.updateDynamic("exclusionDuration")(exclusionDuration.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExclusionDuration]
  }
}

