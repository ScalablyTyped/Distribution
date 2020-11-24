package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalDataConfiguration extends js.Object {
  
  var autodetect: js.UndefOr[Boolean] = js.native
  
  var bigtableOptions: js.UndefOr[BigtableOptions] = js.native
  
  var compression: js.UndefOr[String] = js.native
  
  var csvOptions: js.UndefOr[CsvOptions] = js.native
  
  var googleSheetsOptions: js.UndefOr[GoogleSheetsOptions] = js.native
  
  var hivePartitioningMode: js.UndefOr[String] = js.native
  
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.native
  
  var maxBadRecords: js.UndefOr[Double] = js.native
  
  var schema: js.UndefOr[TableSchema] = js.native
  
  var sourceFormat: js.UndefOr[String] = js.native
  
  var sourceUris: js.UndefOr[js.Array[String]] = js.native
}
object ExternalDataConfiguration {
  
  @scala.inline
  def apply(): ExternalDataConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalDataConfiguration]
  }
  
  @scala.inline
  implicit class ExternalDataConfigurationOps[Self <: ExternalDataConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAutodetect(value: Boolean): Self = this.set("autodetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutodetect: Self = this.set("autodetect", js.undefined)
    
    @scala.inline
    def setBigtableOptions(value: BigtableOptions): Self = this.set("bigtableOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigtableOptions: Self = this.set("bigtableOptions", js.undefined)
    
    @scala.inline
    def setCompression(value: String): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setCsvOptions(value: CsvOptions): Self = this.set("csvOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvOptions: Self = this.set("csvOptions", js.undefined)
    
    @scala.inline
    def setGoogleSheetsOptions(value: GoogleSheetsOptions): Self = this.set("googleSheetsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleSheetsOptions: Self = this.set("googleSheetsOptions", js.undefined)
    
    @scala.inline
    def setHivePartitioningMode(value: String): Self = this.set("hivePartitioningMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHivePartitioningMode: Self = this.set("hivePartitioningMode", js.undefined)
    
    @scala.inline
    def setIgnoreUnknownValues(value: Boolean): Self = this.set("ignoreUnknownValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUnknownValues: Self = this.set("ignoreUnknownValues", js.undefined)
    
    @scala.inline
    def setMaxBadRecords(value: Double): Self = this.set("maxBadRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBadRecords: Self = this.set("maxBadRecords", js.undefined)
    
    @scala.inline
    def setSchema(value: TableSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setSourceFormat(value: String): Self = this.set("sourceFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceFormat: Self = this.set("sourceFormat", js.undefined)
    
    @scala.inline
    def setSourceUrisVarargs(value: String*): Self = this.set("sourceUris", js.Array(value :_*))
    
    @scala.inline
    def setSourceUris(value: js.Array[String]): Self = this.set("sourceUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceUris: Self = this.set("sourceUris", js.undefined)
  }
}
