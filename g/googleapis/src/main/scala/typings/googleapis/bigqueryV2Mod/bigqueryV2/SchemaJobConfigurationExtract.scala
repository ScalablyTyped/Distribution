package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaJobConfigurationExtract extends StObject {
  
  /**
    * [Optional] The compression type to use for exported files. Possible
    * values include GZIP, DEFLATE, SNAPPY, and NONE. The default value is
    * NONE. DEFLATE and SNAPPY are only supported for Avro.
    */
  var compression: js.UndefOr[String] = js.native
  
  /**
    * [Optional] The exported file format. Possible values include CSV,
    * NEWLINE_DELIMITED_JSON and AVRO. The default value is CSV. Tables with
    * nested or repeated fields cannot be exported as CSV.
    */
  var destinationFormat: js.UndefOr[String] = js.native
  
  /**
    * [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI
    * as necessary. The fully-qualified Google Cloud Storage URI where the
    * extracted table should be written.
    */
  var destinationUri: js.UndefOr[String] = js.native
  
  /**
    * [Pick one] A list of fully-qualified Google Cloud Storage URIs where the
    * extracted table should be written.
    */
  var destinationUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * [Optional] Delimiter to use between fields in the exported data. Default
    * is &#39;,&#39;
    */
  var fieldDelimiter: js.UndefOr[String] = js.native
  
  /**
    * [Optional] Whether to print out a header row in the results. Default is
    * true.
    */
  var printHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * [Required] A reference to the table being exported.
    */
  var sourceTable: js.UndefOr[SchemaTableReference] = js.native
}
object SchemaJobConfigurationExtract {
  
  @scala.inline
  def apply(): SchemaJobConfigurationExtract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobConfigurationExtract]
  }
  
  @scala.inline
  implicit class SchemaJobConfigurationExtractMutableBuilder[Self <: SchemaJobConfigurationExtract] (val x: Self) extends AnyVal {
    
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
    def setSourceTable(value: SchemaTableReference): Self = StObject.set(x, "sourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableUndefined: Self = StObject.set(x, "sourceTable", js.undefined)
  }
}
