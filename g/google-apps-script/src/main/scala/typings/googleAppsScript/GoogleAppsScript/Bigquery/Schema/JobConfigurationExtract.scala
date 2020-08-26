package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobConfigurationExtract extends js.Object {
  var compression: js.UndefOr[String] = js.native
  var destinationFormat: js.UndefOr[String] = js.native
  var destinationUri: js.UndefOr[String] = js.native
  var destinationUris: js.UndefOr[js.Array[String]] = js.native
  var fieldDelimiter: js.UndefOr[String] = js.native
  var printHeader: js.UndefOr[Boolean] = js.native
  var sourceTable: js.UndefOr[TableReference] = js.native
}

object JobConfigurationExtract {
  @scala.inline
  def apply(): JobConfigurationExtract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationExtract]
  }
  @scala.inline
  implicit class JobConfigurationExtractOps[Self <: JobConfigurationExtract] (val x: Self) extends AnyVal {
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
    def setCompression(value: String): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def setDestinationFormat(value: String): Self = this.set("destinationFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationFormat: Self = this.set("destinationFormat", js.undefined)
    @scala.inline
    def setDestinationUri(value: String): Self = this.set("destinationUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationUri: Self = this.set("destinationUri", js.undefined)
    @scala.inline
    def setDestinationUrisVarargs(value: String*): Self = this.set("destinationUris", js.Array(value :_*))
    @scala.inline
    def setDestinationUris(value: js.Array[String]): Self = this.set("destinationUris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationUris: Self = this.set("destinationUris", js.undefined)
    @scala.inline
    def setFieldDelimiter(value: String): Self = this.set("fieldDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldDelimiter: Self = this.set("fieldDelimiter", js.undefined)
    @scala.inline
    def setPrintHeader(value: Boolean): Self = this.set("printHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintHeader: Self = this.set("printHeader", js.undefined)
    @scala.inline
    def setSourceTable(value: TableReference): Self = this.set("sourceTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceTable: Self = this.set("sourceTable", js.undefined)
  }
  
}

