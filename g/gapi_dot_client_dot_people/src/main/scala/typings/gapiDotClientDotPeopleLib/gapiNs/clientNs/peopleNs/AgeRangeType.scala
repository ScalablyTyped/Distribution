package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgeRangeType extends js.Object {
  /** The age range. */
  var ageRange: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata about the age range. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
}

object AgeRangeType {
  @scala.inline
  def apply(ageRange: java.lang.String = null, metadata: FieldMetadata = null): AgeRangeType = {
    val __obj = js.Dynamic.literal()
    if (ageRange != null) __obj.updateDynamic("ageRange")(ageRange)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[AgeRangeType]
  }
}

