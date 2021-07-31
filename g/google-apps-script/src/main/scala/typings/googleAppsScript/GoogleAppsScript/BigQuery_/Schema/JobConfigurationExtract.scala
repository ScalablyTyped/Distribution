package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobConfigurationExtract extends StObject {
  
  var compression: js.UndefOr[String] = js.undefined
  
  var destinationFormat: js.UndefOr[String] = js.undefined
  
  var destinationUri: js.UndefOr[String] = js.undefined
  
  var destinationUris: js.UndefOr[js.Array[String]] = js.undefined
  
  var fieldDelimiter: js.UndefOr[String] = js.undefined
  
  var printHeader: js.UndefOr[Boolean] = js.undefined
  
  var sourceTable: js.UndefOr[TableReference] = js.undefined
}
object JobConfigurationExtract {
  
  @scala.inline
  def apply(): JobConfigurationExtract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationExtract]
  }
  
  @scala.inline
  implicit class JobConfigurationExtractMutableBuilder[Self <: JobConfigurationExtract] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    @scala.inline
    def setDestinationFormat(value: String): Self = StObject.set(x, "destinationFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationFormatUndefined: Self = StObject.set(x, "destinationFormat", js.undefined)
    
    @scala.inline
    def setDestinationUri(value: String): Self = StObject.set(x, "destinationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUriUndefined: Self = StObject.set(x, "destinationUri", js.undefined)
    
    @scala.inline
    def setDestinationUris(value: js.Array[String]): Self = StObject.set(x, "destinationUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUrisUndefined: Self = StObject.set(x, "destinationUris", js.undefined)
    
    @scala.inline
    def setDestinationUrisVarargs(value: String*): Self = StObject.set(x, "destinationUris", js.Array(value :_*))
    
    @scala.inline
    def setFieldDelimiter(value: String): Self = StObject.set(x, "fieldDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDelimiterUndefined: Self = StObject.set(x, "fieldDelimiter", js.undefined)
    
    @scala.inline
    def setPrintHeader(value: Boolean): Self = StObject.set(x, "printHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintHeaderUndefined: Self = StObject.set(x, "printHeader", js.undefined)
    
    @scala.inline
    def setSourceTable(value: TableReference): Self = StObject.set(x, "sourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableUndefined: Self = StObject.set(x, "sourceTable", js.undefined)
  }
}
