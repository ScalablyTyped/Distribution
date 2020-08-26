package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDimensionGroupRequest extends js.Object {
  /**
    * The group whose state should be updated. The range and depth of the group
    * should specify a valid group on the sheet, and all other fields updated.
    */
  var dimensionGroup: js.UndefOr[DimensionGroup] = js.native
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `dimensionGroup` is implied and should not be specified.
    * A single `"&#42;"` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
}

object UpdateDimensionGroupRequest {
  @scala.inline
  def apply(): UpdateDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDimensionGroupRequest]
  }
  @scala.inline
  implicit class UpdateDimensionGroupRequestOps[Self <: UpdateDimensionGroupRequest] (val x: Self) extends AnyVal {
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
    def setDimensionGroup(value: DimensionGroup): Self = this.set("dimensionGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionGroup: Self = this.set("dimensionGroup", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

