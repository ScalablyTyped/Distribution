package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CutPasteRequest extends js.Object {
  /** The top-left coordinate where the data should be pasted. */
  var destination: js.UndefOr[GridCoordinate] = js.native
  /**
    * What kind of data to paste.  All the source data will be cut, regardless
    * of what is pasted.
    */
  var pasteType: js.UndefOr[String] = js.native
  /** The source data to cut. */
  var source: js.UndefOr[GridRange] = js.native
}

object CutPasteRequest {
  @scala.inline
  def apply(): CutPasteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CutPasteRequest]
  }
  @scala.inline
  implicit class CutPasteRequestOps[Self <: CutPasteRequest] (val x: Self) extends AnyVal {
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
    def setDestination(value: GridCoordinate): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setPasteType(value: String): Self = this.set("pasteType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasteType: Self = this.set("pasteType", js.undefined)
    @scala.inline
    def setSource(value: GridRange): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

