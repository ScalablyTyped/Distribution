package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

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
    if (!js.isUndefined(allowJaggedRows)) __obj.updateDynamic("allowJaggedRows")(allowJaggedRows.asInstanceOf[js.Any])
    if (!js.isUndefined(allowQuotedNewlines)) __obj.updateDynamic("allowQuotedNewlines")(allowQuotedNewlines.asInstanceOf[js.Any])
    if (!js.isUndefined(autodetect)) __obj.updateDynamic("autodetect")(autodetect.asInstanceOf[js.Any])
    if (clustering != null) __obj.updateDynamic("clustering")(clustering.asInstanceOf[js.Any])
    if (createDisposition != null) __obj.updateDynamic("createDisposition")(createDisposition.asInstanceOf[js.Any])
    if (destinationEncryptionConfiguration != null) __obj.updateDynamic("destinationEncryptionConfiguration")(destinationEncryptionConfiguration.asInstanceOf[js.Any])
    if (destinationTable != null) __obj.updateDynamic("destinationTable")(destinationTable.asInstanceOf[js.Any])
    if (destinationTableProperties != null) __obj.updateDynamic("destinationTableProperties")(destinationTableProperties.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fieldDelimiter != null) __obj.updateDynamic("fieldDelimiter")(fieldDelimiter.asInstanceOf[js.Any])
    if (hivePartitioningMode != null) __obj.updateDynamic("hivePartitioningMode")(hivePartitioningMode.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnknownValues)) __obj.updateDynamic("ignoreUnknownValues")(ignoreUnknownValues.asInstanceOf[js.Any])
    if (maxBadRecords != null) __obj.updateDynamic("maxBadRecords")(maxBadRecords.asInstanceOf[js.Any])
    if (nullMarker != null) __obj.updateDynamic("nullMarker")(nullMarker.asInstanceOf[js.Any])
    if (projectionFields != null) __obj.updateDynamic("projectionFields")(projectionFields.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (rangePartitioning != null) __obj.updateDynamic("rangePartitioning")(rangePartitioning.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (schemaInline != null) __obj.updateDynamic("schemaInline")(schemaInline.asInstanceOf[js.Any])
    if (schemaInlineFormat != null) __obj.updateDynamic("schemaInlineFormat")(schemaInlineFormat.asInstanceOf[js.Any])
    if (schemaUpdateOptions != null) __obj.updateDynamic("schemaUpdateOptions")(schemaUpdateOptions.asInstanceOf[js.Any])
    if (skipLeadingRows != null) __obj.updateDynamic("skipLeadingRows")(skipLeadingRows.asInstanceOf[js.Any])
    if (sourceFormat != null) __obj.updateDynamic("sourceFormat")(sourceFormat.asInstanceOf[js.Any])
    if (sourceUris != null) __obj.updateDynamic("sourceUris")(sourceUris.asInstanceOf[js.Any])
    if (timePartitioning != null) __obj.updateDynamic("timePartitioning")(timePartitioning.asInstanceOf[js.Any])
    if (!js.isUndefined(useAvroLogicalTypes)) __obj.updateDynamic("useAvroLogicalTypes")(useAvroLogicalTypes.asInstanceOf[js.Any])
    if (writeDisposition != null) __obj.updateDynamic("writeDisposition")(writeDisposition.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobConfigurationLoad]
  }
}

