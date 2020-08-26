package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.Issue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVolumeseriesinfo extends js.Object {
  /**
    * The display number string. This should be used only for display purposes
    * and the actual sequence should be inferred from the below orderNumber.
    */
  var bookDisplayNumber: js.UndefOr[String] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Short book title in the context of the series.
    */
  var shortSeriesBookTitle: js.UndefOr[String] = js.native
  var volumeSeries: js.UndefOr[js.Array[Issue]] = js.native
}

object SchemaVolumeseriesinfo {
  @scala.inline
  def apply(): SchemaVolumeseriesinfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolumeseriesinfo]
  }
  @scala.inline
  implicit class SchemaVolumeseriesinfoOps[Self <: SchemaVolumeseriesinfo] (val x: Self) extends AnyVal {
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
    def setBookDisplayNumber(value: String): Self = this.set("bookDisplayNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBookDisplayNumber: Self = this.set("bookDisplayNumber", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setShortSeriesBookTitle(value: String): Self = this.set("shortSeriesBookTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortSeriesBookTitle: Self = this.set("shortSeriesBookTitle", js.undefined)
    @scala.inline
    def setVolumeSeriesVarargs(value: Issue*): Self = this.set("volumeSeries", js.Array(value :_*))
    @scala.inline
    def setVolumeSeries(value: js.Array[Issue]): Self = this.set("volumeSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeSeries: Self = this.set("volumeSeries", js.undefined)
  }
  
}

