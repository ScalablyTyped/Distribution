package typings.googleDashAppsDashScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgeRangeType extends js.Object {
  var ageRange: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
}

object AgeRangeType {
  @scala.inline
  def apply(ageRange: String = null, metadata: FieldMetadata = null): AgeRangeType = {
    val __obj = js.Dynamic.literal()
    if (ageRange != null) __obj.updateDynamic("ageRange")(ageRange)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[AgeRangeType]
  }
}

