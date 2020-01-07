package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$JobConfigurationQuery extends js.Object {
  /**
    * [Optional] If true and query uses legacy SQL dialect, allows the query to
    * produce arbitrarily large result tables at a slight cost in performance.
    * Requires destinationTable to be set. For standard SQL queries, this flag
    * is ignored and large results are always allowed. However, you must still
    * set destinationTable when result size exceeds the allowed maximum
    * response size.
    */
  var allowLargeResults: js.UndefOr[Boolean] = js.native
  /**
    * [Beta] Clustering specification for the destination table. Must be
    * specified with time-based partitioning, data in the table will be first
    * partitioned and subsequently clustered.
    */
  var clustering: js.UndefOr[Schema$Clustering] = js.native
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
    * [Optional] Specifies the default dataset to use for unqualified table
    * names in the query. Note that this does not alter behavior of unqualified
    * dataset names.
    */
  var defaultDataset: js.UndefOr[Schema$DatasetReference] = js.native
  /**
    * Custom encryption configuration (e.g., Cloud KMS keys).
    */
  var destinationEncryptionConfiguration: js.UndefOr[Schema$EncryptionConfiguration] = js.native
  /**
    * [Optional] Describes the table where the query results should be stored.
    * If not present, a new table will be created to store the results. This
    * property must be set for large results that exceed the maximum response
    * size.
    */
  var destinationTable: js.UndefOr[Schema$TableReference] = js.native
  /**
    * [Optional] If true and query uses legacy SQL dialect, flattens all nested
    * and repeated fields in the query results. allowLargeResults must be true
    * if this is set to false. For standard SQL queries, this flag is ignored
    * and results are never flattened.
    */
  var flattenResults: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] Limits the billing tier for this job. Queries that have
    * resource usage beyond this tier will fail (without incurring a charge).
    * If unspecified, this will be set to your project default.
    */
  var maximumBillingTier: js.UndefOr[Double] = js.native
  /**
    * [Optional] Limits the bytes billed for this job. Queries that will have
    * bytes billed beyond this limit will fail (without incurring a charge). If
    * unspecified, this will be set to your project default.
    */
  var maximumBytesBilled: js.UndefOr[String] = js.native
  /**
    * Standard SQL only. Set to POSITIONAL to use positional (?) query
    * parameters or to NAMED to use named (@myparam) query parameters in this
    * query.
    */
  var parameterMode: js.UndefOr[String] = js.native
  /**
    * [Deprecated] This property is deprecated.
    */
  var preserveNulls: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] Specifies a priority for the query. Possible values include
    * INTERACTIVE and BATCH. The default value is INTERACTIVE.
    */
  var priority: js.UndefOr[String] = js.native
  /**
    * [Required] SQL query text to execute. The useLegacySql field can be used
    * to indicate whether the query uses legacy SQL or standard SQL.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Query parameters for standard SQL queries.
    */
  var queryParameters: js.UndefOr[js.Array[Schema$QueryParameter]] = js.native
  /**
    * [TrustedTester] Range partitioning specification for this table. Only one
    * of timePartitioning and rangePartitioning should be specified.
    */
  var rangePartitioning: js.UndefOr[Schema$RangePartitioning] = js.native
  /**
    * Allows the schema of the destination table to be updated as a side effect
    * of the query job. Schema update options are supported in two cases: when
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
    * [Optional] If querying an external data source outside of BigQuery,
    * describes the data format, location and other properties of the data
    * source. By defining these properties, the data source can then be queried
    * as if it were a standard BigQuery table.
    */
  var tableDefinitions: js.UndefOr[StringDictionary[Schema$ExternalDataConfiguration]] = js.native
  /**
    * Time-based partitioning specification for the destination table. Only one
    * of timePartitioning and rangePartitioning should be specified.
    */
  var timePartitioning: js.UndefOr[Schema$TimePartitioning] = js.native
  /**
    * Specifies whether to use BigQuery&#39;s legacy SQL dialect for this
    * query. The default value is true. If set to false, the query will use
    * BigQuery&#39;s standard SQL:
    * https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set
    * to false, the value of flattenResults is ignored; query will be run as if
    * flattenResults is false.
    */
  var useLegacySql: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] Whether to look for the result in the query cache. The query
    * cache is a best-effort cache that will be flushed whenever tables in the
    * query are modified. Moreover, the query cache is only available when a
    * query does not have a destination table specified. The default value is
    * true.
    */
  var useQueryCache: js.UndefOr[Boolean] = js.native
  /**
    * Describes user-defined function resources used in the query.
    */
  var userDefinedFunctionResources: js.UndefOr[js.Array[Schema$UserDefinedFunctionResource]] = js.native
  /**
    * [Optional] Specifies the action that occurs if the destination table
    * already exists. The following values are supported: WRITE_TRUNCATE: If
    * the table already exists, BigQuery overwrites the table data and uses the
    * schema from the query result. WRITE_APPEND: If the table already exists,
    * BigQuery appends the data to the table. WRITE_EMPTY: If the table already
    * exists and contains data, a &#39;duplicate&#39; error is returned in the
    * job result. The default value is WRITE_EMPTY. Each action is atomic and
    * only occurs if BigQuery is able to complete the job successfully.
    * Creation, truncation and append actions occur as one atomic update upon
    * job completion.
    */
  var writeDisposition: js.UndefOr[String] = js.native
}

object Schema$JobConfigurationQuery {
  @scala.inline
  def apply(
    allowLargeResults: js.UndefOr[Boolean] = js.undefined,
    clustering: Schema$Clustering = null,
    createDisposition: String = null,
    defaultDataset: Schema$DatasetReference = null,
    destinationEncryptionConfiguration: Schema$EncryptionConfiguration = null,
    destinationTable: Schema$TableReference = null,
    flattenResults: js.UndefOr[Boolean] = js.undefined,
    maximumBillingTier: Int | Double = null,
    maximumBytesBilled: String = null,
    parameterMode: String = null,
    preserveNulls: js.UndefOr[Boolean] = js.undefined,
    priority: String = null,
    query: String = null,
    queryParameters: js.Array[Schema$QueryParameter] = null,
    rangePartitioning: Schema$RangePartitioning = null,
    schemaUpdateOptions: js.Array[String] = null,
    tableDefinitions: StringDictionary[Schema$ExternalDataConfiguration] = null,
    timePartitioning: Schema$TimePartitioning = null,
    useLegacySql: js.UndefOr[Boolean] = js.undefined,
    useQueryCache: js.UndefOr[Boolean] = js.undefined,
    userDefinedFunctionResources: js.Array[Schema$UserDefinedFunctionResource] = null,
    writeDisposition: String = null
  ): Schema$JobConfigurationQuery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowLargeResults)) __obj.updateDynamic("allowLargeResults")(allowLargeResults.asInstanceOf[js.Any])
    if (clustering != null) __obj.updateDynamic("clustering")(clustering.asInstanceOf[js.Any])
    if (createDisposition != null) __obj.updateDynamic("createDisposition")(createDisposition.asInstanceOf[js.Any])
    if (defaultDataset != null) __obj.updateDynamic("defaultDataset")(defaultDataset.asInstanceOf[js.Any])
    if (destinationEncryptionConfiguration != null) __obj.updateDynamic("destinationEncryptionConfiguration")(destinationEncryptionConfiguration.asInstanceOf[js.Any])
    if (destinationTable != null) __obj.updateDynamic("destinationTable")(destinationTable.asInstanceOf[js.Any])
    if (!js.isUndefined(flattenResults)) __obj.updateDynamic("flattenResults")(flattenResults.asInstanceOf[js.Any])
    if (maximumBillingTier != null) __obj.updateDynamic("maximumBillingTier")(maximumBillingTier.asInstanceOf[js.Any])
    if (maximumBytesBilled != null) __obj.updateDynamic("maximumBytesBilled")(maximumBytesBilled.asInstanceOf[js.Any])
    if (parameterMode != null) __obj.updateDynamic("parameterMode")(parameterMode.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveNulls)) __obj.updateDynamic("preserveNulls")(preserveNulls.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters.asInstanceOf[js.Any])
    if (rangePartitioning != null) __obj.updateDynamic("rangePartitioning")(rangePartitioning.asInstanceOf[js.Any])
    if (schemaUpdateOptions != null) __obj.updateDynamic("schemaUpdateOptions")(schemaUpdateOptions.asInstanceOf[js.Any])
    if (tableDefinitions != null) __obj.updateDynamic("tableDefinitions")(tableDefinitions.asInstanceOf[js.Any])
    if (timePartitioning != null) __obj.updateDynamic("timePartitioning")(timePartitioning.asInstanceOf[js.Any])
    if (!js.isUndefined(useLegacySql)) __obj.updateDynamic("useLegacySql")(useLegacySql.asInstanceOf[js.Any])
    if (!js.isUndefined(useQueryCache)) __obj.updateDynamic("useQueryCache")(useQueryCache.asInstanceOf[js.Any])
    if (userDefinedFunctionResources != null) __obj.updateDynamic("userDefinedFunctionResources")(userDefinedFunctionResources.asInstanceOf[js.Any])
    if (writeDisposition != null) __obj.updateDynamic("writeDisposition")(writeDisposition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$JobConfigurationQuery]
  }
}

