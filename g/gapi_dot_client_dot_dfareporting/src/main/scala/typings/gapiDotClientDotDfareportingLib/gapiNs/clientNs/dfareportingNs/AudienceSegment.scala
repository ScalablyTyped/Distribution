package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudienceSegment extends js.Object {
  /**
    * Weight allocated to this segment. The weight assigned will be understood in proportion to the weights assigned to other segments in the same segment
    * group. Acceptable values are 1 to 1000, inclusive.
    */
  var allocation: js.UndefOr[scala.Double] = js.undefined
  /** ID of this audience segment. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this audience segment. This is a required field and must be less than 65 characters long. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object AudienceSegment {
  @scala.inline
  def apply(
    allocation: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    name: java.lang.String = null
  ): AudienceSegment = {
    val __obj = js.Dynamic.literal()
    if (allocation != null) __obj.updateDynamic("allocation")(allocation.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AudienceSegment]
  }
}

