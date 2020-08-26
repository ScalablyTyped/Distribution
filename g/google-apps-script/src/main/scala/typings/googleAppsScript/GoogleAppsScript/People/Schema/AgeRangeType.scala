package typings.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgeRangeType extends js.Object {
  var ageRange: js.UndefOr[String] = js.native
  var metadata: js.UndefOr[FieldMetadata] = js.native
}

object AgeRangeType {
  @scala.inline
  def apply(): AgeRangeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgeRangeType]
  }
  @scala.inline
  implicit class AgeRangeTypeOps[Self <: AgeRangeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgeRange(value: String): Self = this.set("ageRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgeRange: Self = this.set("ageRange", js.undefined)
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

