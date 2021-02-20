package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalDataConfiguration extends StObject {
  
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
  implicit class ExternalDataConfigurationMutableBuilder[Self <: ExternalDataConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutodetect(value: Boolean): Self = StObject.set(x, "autodetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutodetectUndefined: Self = StObject.set(x, "autodetect", js.undefined)
    
    @scala.inline
    def setBigtableOptions(value: BigtableOptions): Self = StObject.set(x, "bigtableOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigtableOptionsUndefined: Self = StObject.set(x, "bigtableOptions", js.undefined)
    
    @scala.inline
    def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    @scala.inline
    def setCsvOptions(value: CsvOptions): Self = StObject.set(x, "csvOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvOptionsUndefined: Self = StObject.set(x, "csvOptions", js.undefined)
    
    @scala.inline
    def setGoogleSheetsOptions(value: GoogleSheetsOptions): Self = StObject.set(x, "googleSheetsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleSheetsOptionsUndefined: Self = StObject.set(x, "googleSheetsOptions", js.undefined)
    
    @scala.inline
    def setHivePartitioningMode(value: String): Self = StObject.set(x, "hivePartitioningMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHivePartitioningModeUndefined: Self = StObject.set(x, "hivePartitioningMode", js.undefined)
    
    @scala.inline
    def setIgnoreUnknownValues(value: Boolean): Self = StObject.set(x, "ignoreUnknownValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUnknownValuesUndefined: Self = StObject.set(x, "ignoreUnknownValues", js.undefined)
    
    @scala.inline
    def setMaxBadRecords(value: Double): Self = StObject.set(x, "maxBadRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBadRecordsUndefined: Self = StObject.set(x, "maxBadRecords", js.undefined)
    
    @scala.inline
    def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSourceFormat(value: String): Self = StObject.set(x, "sourceFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFormatUndefined: Self = StObject.set(x, "sourceFormat", js.undefined)
    
    @scala.inline
    def setSourceUris(value: js.Array[String]): Self = StObject.set(x, "sourceUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUrisUndefined: Self = StObject.set(x, "sourceUris", js.undefined)
    
    @scala.inline
    def setSourceUrisVarargs(value: String*): Self = StObject.set(x, "sourceUris", js.Array(value :_*))
  }
}
