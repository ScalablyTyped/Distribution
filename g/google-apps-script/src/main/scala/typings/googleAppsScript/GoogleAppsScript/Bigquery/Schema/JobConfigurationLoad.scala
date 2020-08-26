package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobConfigurationLoad extends js.Object {
  var allowJaggedRows: js.UndefOr[Boolean] = js.native
  var allowQuotedNewlines: js.UndefOr[Boolean] = js.native
  var autodetect: js.UndefOr[Boolean] = js.native
  var clustering: js.UndefOr[Clustering] = js.native
  var createDisposition: js.UndefOr[String] = js.native
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  var destinationTable: js.UndefOr[TableReference] = js.native
  var destinationTableProperties: js.UndefOr[DestinationTableProperties] = js.native
  var encoding: js.UndefOr[String] = js.native
  var fieldDelimiter: js.UndefOr[String] = js.native
  var hivePartitioningMode: js.UndefOr[String] = js.native
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.native
  var maxBadRecords: js.UndefOr[Double] = js.native
  var nullMarker: js.UndefOr[String] = js.native
  var projectionFields: js.UndefOr[js.Array[String]] = js.native
  var quote: js.UndefOr[String] = js.native
  var rangePartitioning: js.UndefOr[RangePartitioning] = js.native
  var schema: js.UndefOr[TableSchema] = js.native
  var schemaInline: js.UndefOr[String] = js.native
  var schemaInlineFormat: js.UndefOr[String] = js.native
  var schemaUpdateOptions: js.UndefOr[js.Array[String]] = js.native
  var skipLeadingRows: js.UndefOr[Double] = js.native
  var sourceFormat: js.UndefOr[String] = js.native
  var sourceUris: js.UndefOr[js.Array[String]] = js.native
  var timePartitioning: js.UndefOr[TimePartitioning] = js.native
  var useAvroLogicalTypes: js.UndefOr[Boolean] = js.native
  var writeDisposition: js.UndefOr[String] = js.native
}

object JobConfigurationLoad {
  @scala.inline
  def apply(): JobConfigurationLoad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationLoad]
  }
  @scala.inline
  implicit class JobConfigurationLoadOps[Self <: JobConfigurationLoad] (val x: Self) extends AnyVal {
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
    def setAllowJaggedRows(value: Boolean): Self = this.set("allowJaggedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowJaggedRows: Self = this.set("allowJaggedRows", js.undefined)
    @scala.inline
    def setAllowQuotedNewlines(value: Boolean): Self = this.set("allowQuotedNewlines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowQuotedNewlines: Self = this.set("allowQuotedNewlines", js.undefined)
    @scala.inline
    def setAutodetect(value: Boolean): Self = this.set("autodetect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutodetect: Self = this.set("autodetect", js.undefined)
    @scala.inline
    def setClustering(value: Clustering): Self = this.set("clustering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClustering: Self = this.set("clustering", js.undefined)
    @scala.inline
    def setCreateDisposition(value: String): Self = this.set("createDisposition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDisposition: Self = this.set("createDisposition", js.undefined)
    @scala.inline
    def setDestinationEncryptionConfiguration(value: EncryptionConfiguration): Self = this.set("destinationEncryptionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationEncryptionConfiguration: Self = this.set("destinationEncryptionConfiguration", js.undefined)
    @scala.inline
    def setDestinationTable(value: TableReference): Self = this.set("destinationTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationTable: Self = this.set("destinationTable", js.undefined)
    @scala.inline
    def setDestinationTableProperties(value: DestinationTableProperties): Self = this.set("destinationTableProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationTableProperties: Self = this.set("destinationTableProperties", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setFieldDelimiter(value: String): Self = this.set("fieldDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldDelimiter: Self = this.set("fieldDelimiter", js.undefined)
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
    def setNullMarker(value: String): Self = this.set("nullMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullMarker: Self = this.set("nullMarker", js.undefined)
    @scala.inline
    def setProjectionFieldsVarargs(value: String*): Self = this.set("projectionFields", js.Array(value :_*))
    @scala.inline
    def setProjectionFields(value: js.Array[String]): Self = this.set("projectionFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectionFields: Self = this.set("projectionFields", js.undefined)
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    @scala.inline
    def setRangePartitioning(value: RangePartitioning): Self = this.set("rangePartitioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangePartitioning: Self = this.set("rangePartitioning", js.undefined)
    @scala.inline
    def setSchema(value: TableSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setSchemaInline(value: String): Self = this.set("schemaInline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaInline: Self = this.set("schemaInline", js.undefined)
    @scala.inline
    def setSchemaInlineFormat(value: String): Self = this.set("schemaInlineFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaInlineFormat: Self = this.set("schemaInlineFormat", js.undefined)
    @scala.inline
    def setSchemaUpdateOptionsVarargs(value: String*): Self = this.set("schemaUpdateOptions", js.Array(value :_*))
    @scala.inline
    def setSchemaUpdateOptions(value: js.Array[String]): Self = this.set("schemaUpdateOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaUpdateOptions: Self = this.set("schemaUpdateOptions", js.undefined)
    @scala.inline
    def setSkipLeadingRows(value: Double): Self = this.set("skipLeadingRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipLeadingRows: Self = this.set("skipLeadingRows", js.undefined)
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
    @scala.inline
    def setTimePartitioning(value: TimePartitioning): Self = this.set("timePartitioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePartitioning: Self = this.set("timePartitioning", js.undefined)
    @scala.inline
    def setUseAvroLogicalTypes(value: Boolean): Self = this.set("useAvroLogicalTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseAvroLogicalTypes: Self = this.set("useAvroLogicalTypes", js.undefined)
    @scala.inline
    def setWriteDisposition(value: String): Self = this.set("writeDisposition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteDisposition: Self = this.set("writeDisposition", js.undefined)
  }
  
}

