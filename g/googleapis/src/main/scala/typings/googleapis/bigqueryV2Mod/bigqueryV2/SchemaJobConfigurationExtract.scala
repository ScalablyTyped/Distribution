package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaJobConfigurationExtract extends js.Object {
  
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
  implicit class SchemaJobConfigurationExtractOps[Self <: SchemaJobConfigurationExtract] (val x: Self) extends AnyVal {
    
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
    def setSourceTable(value: SchemaTableReference): Self = this.set("sourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTable: Self = this.set("sourceTable", js.undefined)
  }
}
