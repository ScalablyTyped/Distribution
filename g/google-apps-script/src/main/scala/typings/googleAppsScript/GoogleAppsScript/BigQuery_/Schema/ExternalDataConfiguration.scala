package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalDataConfiguration extends StObject {
  
  var autodetect: js.UndefOr[Boolean] = js.undefined
  
  var bigtableOptions: js.UndefOr[BigtableOptions] = js.undefined
  
  var compression: js.UndefOr[String] = js.undefined
  
  var csvOptions: js.UndefOr[CsvOptions] = js.undefined
  
  var googleSheetsOptions: js.UndefOr[GoogleSheetsOptions] = js.undefined
  
  var hivePartitioningMode: js.UndefOr[String] = js.undefined
  
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined
  
  var maxBadRecords: js.UndefOr[Double] = js.undefined
  
  var schema: js.UndefOr[TableSchema] = js.undefined
  
  var sourceFormat: js.UndefOr[String] = js.undefined
  
  var sourceUris: js.UndefOr[js.Array[String]] = js.undefined
}
object ExternalDataConfiguration {
  
  inline def apply(): ExternalDataConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalDataConfiguration]
  }
  
  extension [Self <: ExternalDataConfiguration](x: Self) {
    
    inline def setAutodetect(value: Boolean): Self = StObject.set(x, "autodetect", value.asInstanceOf[js.Any])
    
    inline def setAutodetectUndefined: Self = StObject.set(x, "autodetect", js.undefined)
    
    inline def setBigtableOptions(value: BigtableOptions): Self = StObject.set(x, "bigtableOptions", value.asInstanceOf[js.Any])
    
    inline def setBigtableOptionsUndefined: Self = StObject.set(x, "bigtableOptions", js.undefined)
    
    inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setCsvOptions(value: CsvOptions): Self = StObject.set(x, "csvOptions", value.asInstanceOf[js.Any])
    
    inline def setCsvOptionsUndefined: Self = StObject.set(x, "csvOptions", js.undefined)
    
    inline def setGoogleSheetsOptions(value: GoogleSheetsOptions): Self = StObject.set(x, "googleSheetsOptions", value.asInstanceOf[js.Any])
    
    inline def setGoogleSheetsOptionsUndefined: Self = StObject.set(x, "googleSheetsOptions", js.undefined)
    
    inline def setHivePartitioningMode(value: String): Self = StObject.set(x, "hivePartitioningMode", value.asInstanceOf[js.Any])
    
    inline def setHivePartitioningModeUndefined: Self = StObject.set(x, "hivePartitioningMode", js.undefined)
    
    inline def setIgnoreUnknownValues(value: Boolean): Self = StObject.set(x, "ignoreUnknownValues", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnknownValuesUndefined: Self = StObject.set(x, "ignoreUnknownValues", js.undefined)
    
    inline def setMaxBadRecords(value: Double): Self = StObject.set(x, "maxBadRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxBadRecordsUndefined: Self = StObject.set(x, "maxBadRecords", js.undefined)
    
    inline def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSourceFormat(value: String): Self = StObject.set(x, "sourceFormat", value.asInstanceOf[js.Any])
    
    inline def setSourceFormatUndefined: Self = StObject.set(x, "sourceFormat", js.undefined)
    
    inline def setSourceUris(value: js.Array[String]): Self = StObject.set(x, "sourceUris", value.asInstanceOf[js.Any])
    
    inline def setSourceUrisUndefined: Self = StObject.set(x, "sourceUris", js.undefined)
    
    inline def setSourceUrisVarargs(value: String*): Self = StObject.set(x, "sourceUris", js.Array(value :_*))
  }
}
