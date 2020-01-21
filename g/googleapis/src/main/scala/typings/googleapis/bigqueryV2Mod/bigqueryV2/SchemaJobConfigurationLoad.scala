package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaJobConfigurationLoad extends js.Object {
  /**
    * [Optional] Accept rows that are missing trailing optional columns. The
    * missing values are treated as nulls. If false, records with missing
    * trailing columns are treated as bad records, and if there are too many
    * bad records, an invalid error is returned in the job result. The default
    * value is false. Only applicable to CSV, ignored for other formats.
    */
  var allowJaggedRows: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if BigQuery should allow quoted data sections that contain
    * newline characters in a CSV file. The default value is false.
    */
  var allowQuotedNewlines: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] Indicates if we should automatically infer the options and
    * schema for CSV and JSON sources.
    */
  var autodetect: js.UndefOr[Boolean] = js.native
  /**
    * [Beta] Clustering specification for the destination table. Must be
    * specified with time-based partitioning, data in the table will be first
    * partitioned and subsequently clustered.
    */
  var clustering: js.UndefOr[SchemaClustering] = js.native
  /**
    * [Optional] Specifies whether the job is allowed to create new tables. The
    * following values are supported: CREATE_IF_NEEDED: If the table does not
    * exist, BigQuery creates the table. CREATE_NEVER: The table must already
    * exist. If it does not, a &#39;notFound&#39; error is returned in the job
    * result. The default value is CREATE_IF_NEEDED. Creation, truncation and
    * append actions occur as one atomic update upon job completion.
    */
  var createDisposition: js.UndefOr[String] = js.native
  /**
    * Custom encryption configuration (e.g., Cloud KMS keys).
    */
  var destinationEncryptionConfiguration: js.UndefOr[SchemaEncryptionConfiguration] = js.native
  /**
    * [Required] The destination table to load the data into.
    */
  var destinationTable: js.UndefOr[SchemaTableReference] = js.native
  /**
    * [Beta] [Optional] Properties with which to create the destination table
    * if it is new.
    */
  var destinationTableProperties: js.UndefOr[SchemaDestinationTableProperties] = js.native
  /**
    * [Optional] The character encoding of the data. The supported values are
    * UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the
    * data after the raw, binary data has been split using the values of the
    * quote and fieldDelimiter properties.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * [Optional] The separator for fields in a CSV file. The separator can be
    * any ISO-8859-1 single-byte character. To use a character in the range
    * 128-255, you must encode the character as UTF8. BigQuery converts the
    * string to ISO-8859-1 encoding, and then uses the first byte of the
    * encoded string to split the data in its raw, binary state. BigQuery also
    * supports the escape sequence &quot;\t&quot; to specify a tab separator.
    * The default value is a comma (&#39;,&#39;).
    */
  var fieldDelimiter: js.UndefOr[String] = js.native
  /**
    * [Optional, Experimental] If hive partitioning is enabled, which mode to
    * use. Two modes are supported: - AUTO: automatically infer partition key
    * name(s) and type(s). - STRINGS: automatic infer partition key name(s).
    * All types are strings. Not all storage formats support hive partitioning
    * -- requesting hive partitioning on an unsupported format will lead to an
    * error.
    */
  var hivePartitioningMode: js.UndefOr[String] = js.native
  /**
    * [Optional] Indicates if BigQuery should allow extra values that are not
    * represented in the table schema. If true, the extra values are ignored.
    * If false, records with extra columns are treated as bad records, and if
    * there are too many bad records, an invalid error is returned in the job
    * result. The default value is false. The sourceFormat property determines
    * what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named
    * values that don&#39;t match any column names
    */
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] The maximum number of bad records that BigQuery can ignore
    * when running the job. If the number of bad records exceeds this value, an
    * invalid error is returned in the job result. This is only valid for CSV
    * and JSON. The default value is 0, which requires that all records are
    * valid.
    */
  var maxBadRecords: js.UndefOr[Double] = js.native
  /**
    * [Optional] Specifies a string that represents a null value in a CSV file.
    * For example, if you specify &quot;x/&quot;, BigQuery interprets
    * &quot;x/&quot; as a null value when loading a CSV file. The default value
    * is the empty string. If you set this property to a custom value, BigQuery
    * throws an error if an empty string is present for all data types except
    * for STRING and BYTE. For STRING and BYTE columns, BigQuery interprets the
    * empty string as an empty value.
    */
  var nullMarker: js.UndefOr[String] = js.native
  /**
    * If sourceFormat is set to &quot;DATASTORE_BACKUP&quot;, indicates which
    * entity properties to load into BigQuery from a Cloud Datastore backup.
    * Property names are case sensitive and must be top-level properties. If no
    * properties are specified, BigQuery loads all properties. If any named
    * property isn&#39;t found in the Cloud Datastore backup, an invalid error
    * is returned in the job result.
    */
  var projectionFields: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Optional] The value that is used to quote data sections in a CSV file.
    * BigQuery converts the string to ISO-8859-1 encoding, and then uses the
    * first byte of the encoded string to split the data in its raw, binary
    * state. The default value is a double-quote (&#39;&quot;&#39;). If your
    * data does not contain quoted sections, set the property value to an empty
    * string. If your data contains quoted newline characters, you must also
    * set the allowQuotedNewlines property to true.
    */
  var quote: js.UndefOr[String] = js.native
  /**
    * [TrustedTester] Range partitioning specification for this table. Only one
    * of timePartitioning and rangePartitioning should be specified.
    */
  var rangePartitioning: js.UndefOr[SchemaRangePartitioning] = js.native
  /**
    * [Optional] The schema for the destination table. The schema can be
    * omitted if the destination table already exists, or if you&#39;re loading
    * data from Google Cloud Datastore.
    */
  var schema: js.UndefOr[SchemaTableSchema] = js.native
  /**
    * [Deprecated] The inline schema. For CSV schemas, specify as
    * &quot;Field1:Type1[,Field2:Type2]*&quot;. For example, &quot;foo:STRING,
    * bar:INTEGER, baz:FLOAT&quot;.
    */
  var schemaInline: js.UndefOr[String] = js.native
  /**
    * [Deprecated] The format of the schemaInline property.
    */
  var schemaInlineFormat: js.UndefOr[String] = js.native
  /**
    * Allows the schema of the destination table to be updated as a side effect
    * of the load job if a schema is autodetected or supplied in the job
    * configuration. Schema update options are supported in two cases: when
    * writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE
    * and the destination table is a partition of a table, specified by
    * partition decorators. For normal tables, WRITE_TRUNCATE will always
    * overwrite the schema. One or more of the following values are specified:
    * ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema.
    * ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original
    * schema to nullable.
    */
  var schemaUpdateOptions: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Optional] The number of rows at the top of a CSV file that BigQuery will
    * skip when loading the data. The default value is 0. This property is
    * useful if you have header rows in the file that should be skipped.
    */
  var skipLeadingRows: js.UndefOr[Double] = js.native
  /**
    * [Optional] The format of the data files. For CSV files, specify
    * &quot;CSV&quot;. For datastore backups, specify
    * &quot;DATASTORE_BACKUP&quot;. For newline-delimited JSON, specify
    * &quot;NEWLINE_DELIMITED_JSON&quot;. For Avro, specify &quot;AVRO&quot;.
    * For parquet, specify &quot;PARQUET&quot;. For orc, specify
    * &quot;ORC&quot;. The default value is CSV.
    */
  var sourceFormat: js.UndefOr[String] = js.native
  /**
    * [Required] The fully-qualified URIs that point to your data in Google
    * Cloud. For Google Cloud Storage URIs: Each URI can contain one
    * &#39;*&#39; wildcard character and it must come after the
    * &#39;bucket&#39; name. Size limits related to load jobs apply to external
    * data sources. For Google Cloud Bigtable URIs: Exactly one URI can be
    * specified and it has be a fully specified and valid HTTPS URL for a
    * Google Cloud Bigtable table. For Google Cloud Datastore backups: Exactly
    * one URI can be specified. Also, the &#39;*&#39; wildcard character is not
    * allowed.
    */
  var sourceUris: js.UndefOr[js.Array[String]] = js.native
  /**
    * Time-based partitioning specification for the destination table. Only one
    * of timePartitioning and rangePartitioning should be specified.
    */
  var timePartitioning: js.UndefOr[SchemaTimePartitioning] = js.native
  /**
    * [Optional] If sourceFormat is set to &quot;AVRO&quot;, indicates whether
    * to enable interpreting logical types into their corresponding types (ie.
    * TIMESTAMP), instead of only using their raw types (ie. INTEGER).
    */
  var useAvroLogicalTypes: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] Specifies the action that occurs if the destination table
    * already exists. The following values are supported: WRITE_TRUNCATE: If
    * the table already exists, BigQuery overwrites the table data.
    * WRITE_APPEND: If the table already exists, BigQuery appends the data to
    * the table. WRITE_EMPTY: If the table already exists and contains data, a
    * &#39;duplicate&#39; error is returned in the job result. The default
    * value is WRITE_APPEND. Each action is atomic and only occurs if BigQuery
    * is able to complete the job successfully. Creation, truncation and append
    * actions occur as one atomic update upon job completion.
    */
  var writeDisposition: js.UndefOr[String] = js.native
}

object SchemaJobConfigurationLoad {
  @scala.inline
  def apply(
    allowJaggedRows: js.UndefOr[Boolean] = js.undefined,
    allowQuotedNewlines: js.UndefOr[Boolean] = js.undefined,
    autodetect: js.UndefOr[Boolean] = js.undefined,
    clustering: SchemaClustering = null,
    createDisposition: String = null,
    destinationEncryptionConfiguration: SchemaEncryptionConfiguration = null,
    destinationTable: SchemaTableReference = null,
    destinationTableProperties: SchemaDestinationTableProperties = null,
    encoding: String = null,
    fieldDelimiter: String = null,
    hivePartitioningMode: String = null,
    ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined,
    maxBadRecords: Int | Double = null,
    nullMarker: String = null,
    projectionFields: js.Array[String] = null,
    quote: String = null,
    rangePartitioning: SchemaRangePartitioning = null,
    schema: SchemaTableSchema = null,
    schemaInline: String = null,
    schemaInlineFormat: String = null,
    schemaUpdateOptions: js.Array[String] = null,
    skipLeadingRows: Int | Double = null,
    sourceFormat: String = null,
    sourceUris: js.Array[String] = null,
    timePartitioning: SchemaTimePartitioning = null,
    useAvroLogicalTypes: js.UndefOr[Boolean] = js.undefined,
    writeDisposition: String = null
  ): SchemaJobConfigurationLoad = {
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
    __obj.asInstanceOf[SchemaJobConfigurationLoad]
  }
}

