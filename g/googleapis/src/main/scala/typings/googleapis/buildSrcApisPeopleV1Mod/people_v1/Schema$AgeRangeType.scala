package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s age range.
  */
@js.native
trait Schema$AgeRangeType extends js.Object {
  /**
    * The age range.
    */
  var ageRange: js.UndefOr[String] = js.native
  /**
    * Metadata about the age range.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
}

object Schema$AgeRangeType {
  @scala.inline
  def apply(ageRange: String = null, metadata: Schema$FieldMetadata = null): Schema$AgeRangeType = {
    val __obj = js.Dynamic.literal()
    if (ageRange != null) __obj.updateDynamic("ageRange")(ageRange.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AgeRangeType]
  }
}

