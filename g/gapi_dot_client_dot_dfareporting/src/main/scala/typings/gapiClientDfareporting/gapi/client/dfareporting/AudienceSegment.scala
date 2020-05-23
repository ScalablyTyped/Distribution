package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudienceSegment extends js.Object {
  /**
    * Weight allocated to this segment. The weight assigned will be understood in proportion to the weights assigned to other segments in the same segment
    * group. Acceptable values are 1 to 1000, inclusive.
    */
  var allocation: js.UndefOr[Double] = js.undefined
  /** ID of this audience segment. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Name of this audience segment. This is a required field and must be less than 65 characters long. */
  var name: js.UndefOr[String] = js.undefined
}

object AudienceSegment {
  @scala.inline
  def apply(allocation: js.UndefOr[Double] = js.undefined, id: String = null, name: String = null): AudienceSegment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allocation)) __obj.updateDynamic("allocation")(allocation.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudienceSegment]
  }
}

