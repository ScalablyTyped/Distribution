package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaxData extends js.Object {
  /** An identifier uniquely identifying a tax in a response. */
  var id: js.UndefOr[String] = js.native
  /** Identifies this as a tax data object, representing some tax. Value: the fixed string qpxexpress#taxData. */
  var kind: js.UndefOr[String] = js.native
  /** The name of a tax. */
  var name: js.UndefOr[String] = js.native
}

object TaxData {
  @scala.inline
  def apply(): TaxData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaxData]
  }
  @scala.inline
  implicit class TaxDataOps[Self <: TaxData] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

