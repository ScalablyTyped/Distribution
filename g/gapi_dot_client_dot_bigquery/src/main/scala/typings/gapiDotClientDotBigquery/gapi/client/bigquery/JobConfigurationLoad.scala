package typings.gapiDotClientDotBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobConfigurationLoad extends js.Object {
  /**
    * [Optional] Accept rows that are missing trailing optional columns. The missing values are treated as nulls. If false, records with missing trailing
    * columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false.
    * Only applicable to CSV, ignored for other formats.
    */
  var allowJaggedRows: js.UndefOr[Boolean] = js.undefined
  /** Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false. */
  var allowQuotedNewlines: js.UndefOr[Boolean] = js.undefined
  /** Indicates if we should automatically infer the options and schema for CSV and JSON sources. */
  var autodetect: js.UndefOr[Boolean] = js.undefined
  /**
    * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not
    * exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The
    * default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
    */
  var createDisposition: js.UndefOr[String] = js.undefined
  /** [Experimental] Custom encryption configuration (e.g., Cloud KMS keys). */
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  /** [Required] The destination table to load the data into. */
  var destinationTable: js.UndefOr[TableReference] = js.undefined
  /**
    * [Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data
    * after the raw, binary data has been split using the values of the quote and fieldDelimiter properties.
    */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    * [Optional] The separator for fields in a CSV file. The separator can be any ISO-8859-1 single-byte character. To use a character in the range 128-255,
    * you must encode the character as UTF8. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split
    * the data in its raw, binary state. BigQuery also supports the escape sequence "\t" to specify a tab separator. The default value is a comma (',').
    */
  var fieldDelimiter: js.UndefOr[String] = js.undefined
  /**
    * [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If
    * false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result.
    * The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that
    * don't match any column names
    */
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined
  /**
    * [Optional] The maximum number of bad records that BigQuery can ignore when running the job. If the number of bad records exceeds this value, an invalid
    * error is returned in the job result. The default value is 0, which requires that all records are valid.
    */
  var maxBadRecords: js.UndefOr[Double] = js.undefined
  /**
    * [Optional] Specifies a string that represents a null value in a CSV file. For example, if you specify "\N", BigQuery interprets "\N" as a null value
    * when loading a CSV file. The default value is the empty string. If you set this property to a custom value, BigQuery throws an error if an empty string
    * is present for all data types except for STRING and BYTE. For STRING and BYTE columns, BigQuery interprets the empty string as an empty value.
    */
  var nullMarker: js.UndefOr[String] = js.undefined
  /**
    * If sourceFormat is set to "DATASTORE_BACKUP", indicates which entity properties to load into BigQuery from a Cloud Datastore backup. Property names are
    * case sensitive and must be top-level properties. If no properties are specified, BigQuery loads all properties. If any named property isn't found in
    * the Cloud Datastore backup, an invalid error is returned in the job result.
    */
  var projectionFields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * [Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first
    * byte of the encoded string to split the data in its raw, binary state. The default value is a double-quote ('"'). If your data does not contain quoted
    * sections, set the property value to an empty string. If your data contains quoted newline characters, you must also set the allowQuotedNewlines
    * property to true.
    */
  var quote: js.UndefOr[String] = js.undefined
  /**
    * [Optional] The schema for the destination table. The schema can be omitted if the destination table already exists, or if you're loading data from
    * Google Cloud Datastore.
    */
  var schema: js.UndefOr[TableSchema] = js.undefined
  /** [Deprecated] The inline schema. For CSV schemas, specify as "Field1:Type1[,Field2:Type2]&#42;". For example, "foo:STRING, bar:INTEGER, baz:FLOAT". */
  var schemaInline: js.UndefOr[String] = js.undefined
  /** [Deprecated] The format of the schemaInline property. */
  var schemaInlineFormat: js.UndefOr[String] = js.undefined
  /**
    * [Experimental] Allows the schema of the desitination table to be updated as a side effect of the load job if a schema is autodetected or supplied in
    * the job configuration. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE
    * and the destination table is a partition of a table, specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the
    * schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION:
    * allow relaxing a required field in the original schema to nullable.
    */
  var schemaUpdateOptions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * [Optional] The number of rows at the top of a CSV file that BigQuery will skip when loading the data. The default value is 0. This property is useful
    * if you have header rows in the file that should be skipped.
    */
  var skipLeadingRows: js.UndefOr[Double] = js.undefined
  /**
    * [Optional] The format of the data files. For CSV files, specify "CSV". For datastore backups, specify "DATASTORE_BACKUP". For newline-delimited JSON,
    * specify "NEWLINE_DELIMITED_JSON". For Avro, specify "AVRO". The default value is CSV.
    */
  var sourceFormat: js.UndefOr[String] = js.undefined
  /**
    * [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '&#42;' wildcard
    * character and it must come after the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs:
    * Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore
    * backups: Exactly one URI can be specified. Also, the '&#42;' wildcard character is not allowed.
    */
  var sourceUris: js.UndefOr[js.Array[String]] = js.undefined
  /** [Experimental] If specified, configures time-based partitioning for the destination table. */
  var timePartitioning: js.UndefOr[TimePartitioning] = js.undefined
  /**
    * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table
    * already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If
    * the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_APPEND. Each action is atomic
    * and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job
    * completion.
    */
  var writeDisposition: js.UndefOr[String] = js.undefined
}

object JobConfigurationLoad {
  @scala.inline
  def apply(
    allowJaggedRows: js.UndefOr[Boolean] = js.undefined,
    allowQuotedNewlines: js.UndefOr[Boolean] = js.undefined,
    autodetect: js.UndefOr[Boolean] = js.undefined,
    createDisposition: String = null,
    destinationEncryptionConfiguration: EncryptionConfiguration = null,
    destinationTable: TableReference = null,
    encoding: String = null,
    fieldDelimiter: String = null,
    ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined,
    maxBadRecords: Int | Double = null,
    nullMarker: String = null,
    projectionFields: js.Array[String] = null,
    quote: String = null,
    schema: TableSchema = null,
    schemaInline: String = null,
    schemaInlineFormat: String = null,
    schemaUpdateOptions: js.Array[String] = null,
    skipLeadingRows: Int | Double = null,
    sourceFormat: String = null,
    sourceUris: js.Array[String] = null,
    timePartitioning: TimePartitioning = null,
    writeDisposition: String = null
  ): JobConfigurationLoad = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowJaggedRows)) __obj.updateDynamic("allowJaggedRows")(allowJaggedRows)
    if (!js.isUndefined(allowQuotedNewlines)) __obj.updateDynamic("allowQuotedNewlines")(allowQuotedNewlines)
    if (!js.isUndefined(autodetect)) __obj.updateDynamic("autodetect")(autodetect)
    if (createDisposition != null) __obj.updateDynamic("createDisposition")(createDisposition)
    if (destinationEncryptionConfiguration != null) __obj.updateDynamic("destinationEncryptionConfiguration")(destinationEncryptionConfiguration)
    if (destinationTable != null) __obj.updateDynamic("destinationTable")(destinationTable)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fieldDelimiter != null) __obj.updateDynamic("fieldDelimiter")(fieldDelimiter)
    if (!js.isUndefined(ignoreUnknownValues)) __obj.updateDynamic("ignoreUnknownValues")(ignoreUnknownValues)
    if (maxBadRecords != null) __obj.updateDynamic("maxBadRecords")(maxBadRecords.asInstanceOf[js.Any])
    if (nullMarker != null) __obj.updateDynamic("nullMarker")(nullMarker)
    if (projectionFields != null) __obj.updateDynamic("projectionFields")(projectionFields)
    if (quote != null) __obj.updateDynamic("quote")(quote)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (schemaInline != null) __obj.updateDynamic("schemaInline")(schemaInline)
    if (schemaInlineFormat != null) __obj.updateDynamic("schemaInlineFormat")(schemaInlineFormat)
    if (schemaUpdateOptions != null) __obj.updateDynamic("schemaUpdateOptions")(schemaUpdateOptions)
    if (skipLeadingRows != null) __obj.updateDynamic("skipLeadingRows")(skipLeadingRows.asInstanceOf[js.Any])
    if (sourceFormat != null) __obj.updateDynamic("sourceFormat")(sourceFormat)
    if (sourceUris != null) __obj.updateDynamic("sourceUris")(sourceUris)
    if (timePartitioning != null) __obj.updateDynamic("timePartitioning")(timePartitioning)
    if (writeDisposition != null) __obj.updateDynamic("writeDisposition")(writeDisposition)
    __obj.asInstanceOf[JobConfigurationLoad]
  }
}

