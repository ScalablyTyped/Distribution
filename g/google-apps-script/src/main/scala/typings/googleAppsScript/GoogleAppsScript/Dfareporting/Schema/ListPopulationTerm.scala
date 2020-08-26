package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPopulationTerm extends js.Object {
  var contains: js.UndefOr[Boolean] = js.native
  var negation: js.UndefOr[Boolean] = js.native
  var operator: js.UndefOr[String] = js.native
  var remarketingListId: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
  var variableFriendlyName: js.UndefOr[String] = js.native
  var variableName: js.UndefOr[String] = js.native
}

object ListPopulationTerm {
  @scala.inline
  def apply(): ListPopulationTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPopulationTerm]
  }
  @scala.inline
  implicit class ListPopulationTermOps[Self <: ListPopulationTerm] (val x: Self) extends AnyVal {
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
    def setContains(value: Boolean): Self = this.set("contains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setNegation(value: Boolean): Self = this.set("negation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegation: Self = this.set("negation", js.undefined)
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setRemarketingListId(value: String): Self = this.set("remarketingListId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemarketingListId: Self = this.set("remarketingListId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVariableFriendlyName(value: String): Self = this.set("variableFriendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableFriendlyName: Self = this.set("variableFriendlyName", js.undefined)
    @scala.inline
    def setVariableName(value: String): Self = this.set("variableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableName: Self = this.set("variableName", js.undefined)
  }
  
}

