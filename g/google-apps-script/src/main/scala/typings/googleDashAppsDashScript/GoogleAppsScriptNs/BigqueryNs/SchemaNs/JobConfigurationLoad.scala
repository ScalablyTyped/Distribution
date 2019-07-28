package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobConfigurationLoad extends js.Object {
  var allowJaggedRows: js.UndefOr[Boolean] = js.undefined
  var allowQuotedNewlines: js.UndefOr[Boolean] = js.undefined
  var autodetect: js.UndefOr[Boolean] = js.undefined
  var clustering: js.UndefOr[Clustering] = js.undefined
  var createDisposition: js.UndefOr[String] = js.undefined
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  var destinationTable: js.UndefOr[TableReference] = js.undefined
  var destinationTableProperties: js.UndefOr[DestinationTableProperties] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var fieldDelimiter: js.UndefOr[String] = js.undefined
  var hivePartitioningMode: js.UndefOr[String] = js.undefined
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined
  var maxBadRecords: js.UndefOr[Double] = js.undefined
  var nullMarker: js.UndefOr[String] = js.undefined
  var projectionFields: js.UndefOr[js.Array[String]] = js.undefined
  var quote: js.UndefOr[String] = js.undefined
  var rangePartitioning: js.UndefOr[RangePartitioning] = js.undefined
  var schema: js.UndefOr[TableSchema] = js.undefined
  var schemaInline: js.UndefOr[String] = js.undefined
  var schemaInlineFormat: js.UndefOr[String] = js.undefined
  var schemaUpdateOptions: js.UndefOr[js.Array[String]] = js.undefined
  var skipLeadingRows: js.UndefOr[Double] = js.undefined
  var sourceFormat: js.UndefOr[String] = js.undefined
  var sourceUris: js.UndefOr[js.Array[String]] = js.undefined
  var timePartitioning: js.UndefOr[TimePartitioning] = js.undefined
  var useAvroLogicalTypes: js.UndefOr[Boolean] = js.undefined
  var writeDisposition: js.UndefOr[String] = js.undefined
}

object JobConfigurationLoad {
  @scala.inline
  def apply(
    allowJaggedRows: js.UndefOr[Boolean] = js.undefined,
    allowQuotedNewlines: js.UndefOr[Boolean] = js.undefined,
    autodetect: js.UndefOr[Boolean] = js.undefined,
    clustering: Clustering = null,
    createDisposition: String = null,
    destinationEncryptionConfiguration: EncryptionConfiguration = null,
    destinationTable: TableReference = null,
    destinationTableProperties: DestinationTableProperties = null,
    encoding: String = null,
    fieldDelimiter: String = null,
    hivePartitioningMode: String = null,
    ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined,
    maxBadRecords: Int | Double = null,
    nullMarker: String = null,
    projectionFields: js.Array[String] = null,
    quote: String = null,
    rangePartitioning: RangePartitioning = null,
    schema: TableSchema = null,
    schemaInline: String = null,
    schemaInlineFormat: String = null,
    schemaUpdateOptions: js.Array[String] = null,
    skipLeadingRows: Int | Double = null,
    sourceFormat: String = null,
    sourceUris: js.Array[String] = null,
    timePartitioning: TimePartitioning = null,
    useAvroLogicalTypes: js.UndefOr[Boolean] = js.undefined,
    writeDisposition: String = null
  ): JobConfigurationLoad = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowJaggedRows)) __obj.updateDynamic("allowJaggedRows")(allowJaggedRows)
    if (!js.isUndefined(allowQuotedNewlines)) __obj.updateDynamic("allowQuotedNewlines")(allowQuotedNewlines)
    if (!js.isUndefined(autodetect)) __obj.updateDynamic("autodetect")(autodetect)
    if (clustering != null) __obj.updateDynamic("clustering")(clustering)
    if (createDisposition != null) __obj.updateDynamic("createDisposition")(createDisposition)
    if (destinationEncryptionConfiguration != null) __obj.updateDynamic("destinationEncryptionConfiguration")(destinationEncryptionConfiguration)
    if (destinationTable != null) __obj.updateDynamic("destinationTable")(destinationTable)
    if (destinationTableProperties != null) __obj.updateDynamic("destinationTableProperties")(destinationTableProperties)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fieldDelimiter != null) __obj.updateDynamic("fieldDelimiter")(fieldDelimiter)
    if (hivePartitioningMode != null) __obj.updateDynamic("hivePartitioningMode")(hivePartitioningMode)
    if (!js.isUndefined(ignoreUnknownValues)) __obj.updateDynamic("ignoreUnknownValues")(ignoreUnknownValues)
    if (maxBadRecords != null) __obj.updateDynamic("maxBadRecords")(maxBadRecords.asInstanceOf[js.Any])
    if (nullMarker != null) __obj.updateDynamic("nullMarker")(nullMarker)
    if (projectionFields != null) __obj.updateDynamic("projectionFields")(projectionFields)
    if (quote != null) __obj.updateDynamic("quote")(quote)
    if (rangePartitioning != null) __obj.updateDynamic("rangePartitioning")(rangePartitioning)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (schemaInline != null) __obj.updateDynamic("schemaInline")(schemaInline)
    if (schemaInlineFormat != null) __obj.updateDynamic("schemaInlineFormat")(schemaInlineFormat)
    if (schemaUpdateOptions != null) __obj.updateDynamic("schemaUpdateOptions")(schemaUpdateOptions)
    if (skipLeadingRows != null) __obj.updateDynamic("skipLeadingRows")(skipLeadingRows.asInstanceOf[js.Any])
    if (sourceFormat != null) __obj.updateDynamic("sourceFormat")(sourceFormat)
    if (sourceUris != null) __obj.updateDynamic("sourceUris")(sourceUris)
    if (timePartitioning != null) __obj.updateDynamic("timePartitioning")(timePartitioning)
    if (!js.isUndefined(useAvroLogicalTypes)) __obj.updateDynamic("useAvroLogicalTypes")(useAvroLogicalTypes)
    if (writeDisposition != null) __obj.updateDynamic("writeDisposition")(writeDisposition)
    __obj.asInstanceOf[JobConfigurationLoad]
  }
}

