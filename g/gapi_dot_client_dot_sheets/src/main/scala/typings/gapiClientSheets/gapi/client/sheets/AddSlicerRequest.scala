package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddSlicerRequest extends js.Object {
  /**
    * The slicer that should be added to the spreadsheet, including
    * the position where it should be placed. The slicerId field is optional; if one is not set, an id
    * will be randomly generated. (It is an error to specify the ID
    * of a slicer that already exists.)
    */
  var slicer: js.UndefOr[Slicer] = js.native
}

object AddSlicerRequest {
  @scala.inline
  def apply(): AddSlicerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSlicerRequest]
  }
  @scala.inline
  implicit class AddSlicerRequestOps[Self <: AddSlicerRequest] (val x: Self) extends AnyVal {
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
    def setSlicer(value: Slicer): Self = this.set("slicer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlicer: Self = this.set("slicer", js.undefined)
  }
  
}

