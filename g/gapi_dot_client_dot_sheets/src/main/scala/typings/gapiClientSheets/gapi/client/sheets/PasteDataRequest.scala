package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasteDataRequest extends js.Object {
  /** The coordinate at which the data should start being inserted. */
  var coordinate: js.UndefOr[GridCoordinate] = js.native
  /** The data to insert. */
  var data: js.UndefOr[String] = js.native
  /** The delimiter in the data. */
  var delimiter: js.UndefOr[String] = js.native
  /** True if the data is HTML. */
  var html: js.UndefOr[Boolean] = js.native
  /** How the data should be pasted. */
  var `type`: js.UndefOr[String] = js.native
}

object PasteDataRequest {
  @scala.inline
  def apply(): PasteDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasteDataRequest]
  }
  @scala.inline
  implicit class PasteDataRequestOps[Self <: PasteDataRequest] (val x: Self) extends AnyVal {
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
    def setCoordinate(value: GridCoordinate): Self = this.set("coordinate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoordinate: Self = this.set("coordinate", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

