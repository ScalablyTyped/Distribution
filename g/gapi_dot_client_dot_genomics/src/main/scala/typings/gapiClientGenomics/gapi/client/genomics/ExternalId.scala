package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalId extends js.Object {
  /** The id used by the source of this data. */
  var id: js.UndefOr[String] = js.native
  /** The name of the source of this data. */
  var sourceName: js.UndefOr[String] = js.native
}

object ExternalId {
  @scala.inline
  def apply(): ExternalId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalId]
  }
  @scala.inline
  implicit class ExternalIdOps[Self <: ExternalId] (val x: Self) extends AnyVal {
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
    def setSourceName(value: String): Self = this.set("sourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceName: Self = this.set("sourceName", js.undefined)
  }
  
}

