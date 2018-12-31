package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobConfigurationQuery extends js.Object {
  /**
    * [Optional] If true and query uses legacy SQL dialect, allows the query to produce arbitrarily large result tables at a slight cost in performance.
    * Requires destinationTable to be set. For standard SQL queries, this flag is ignored and large results are always allowed. However, you must still set
    * destinationTable when result size exceeds the allowed maximum response size.
    */
  var allowLargeResults: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not
    * exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The
    * default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
    */
  var createDisposition: js.UndefOr[java.lang.String] = js.undefined
  /** [Optional] Specifies the default dataset to use for unqualified table names in the query. */
  var defaultDataset: js.UndefOr[DatasetReference] = js.undefined
  /** [Experimental] Custom encryption configuration (e.g., Cloud KMS keys). */
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  /**
    * [Optional] Describes the table where the query results should be stored. If not present, a new table will be created to store the results. This
    * property must be set for large results that exceed the maximum response size.
    */
  var destinationTable: js.UndefOr[TableReference] = js.undefined
  /**
    * [Optional] If true and query uses legacy SQL dialect, flattens all nested and repeated fields in the query results. allowLargeResults must be true if
    * this is set to false. For standard SQL queries, this flag is ignored and results are never flattened.
    */
  var flattenResults: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * [Optional] Limits the billing tier for this job. Queries that have resource usage beyond this tier will fail (without incurring a charge). If
    * unspecified, this will be set to your project default.
    */
  var maximumBillingTier: js.UndefOr[scala.Double] = js.undefined
  /**
    * [Optional] Limits the bytes billed for this job. Queries that will have bytes billed beyond this limit will fail (without incurring a charge). If
    * unspecified, this will be set to your project default.
    */
  var maximumBytesBilled: js.UndefOr[java.lang.String] = js.undefined
  /** Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query. */
  var parameterMode: js.UndefOr[java.lang.String] = js.undefined
  /** [Deprecated] This property is deprecated. */
  var preserveNulls: js.UndefOr[scala.Boolean] = js.undefined
  /** [Optional] Specifies a priority for the query. Possible values include INTERACTIVE and BATCH. The default value is INTERACTIVE. */
  var priority: js.UndefOr[java.lang.String] = js.undefined
  /** [Required] SQL query text to execute. The useLegacySql field can be used to indicate whether the query uses legacy SQL or standard SQL. */
  var query: js.UndefOr[java.lang.String] = js.undefined
  /** Query parameters for standard SQL queries. */
  var queryParameters: js.UndefOr[js.Array[QueryParameter]] = js.undefined
  /**
    * [Experimental] Allows the schema of the destination table to be updated as a side effect of the query job. Schema update options are supported in two
    * cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by
    * partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified:
    * ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to
    * nullable.
    */
  var schemaUpdateOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * [Optional] If querying an external data source outside of BigQuery, describes the data format, location and other properties of the data source. By
    * defining these properties, the data source can then be queried as if it were a standard BigQuery table.
    */
  var tableDefinitions: js.UndefOr[stdLib.Record[java.lang.String, ExternalDataConfiguration]] = js.undefined
  /** [Experimental] If specified, configures time-based partitioning for the destination table. */
  var timePartitioning: js.UndefOr[TimePartitioning] = js.undefined
  /**
    * Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is true. If set to false, the query will use BigQuery's
    * standard SQL: https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set to false, the value of flattenResults is ignored; query will be
    * run as if flattenResults is false.
    */
  var useLegacySql: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * [Optional] Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever tables in the query
    * are modified. Moreover, the query cache is only available when a query does not have a destination table specified. The default value is true.
    */
  var useQueryCache: js.UndefOr[scala.Boolean] = js.undefined
  /** Describes user-defined function resources used in the query. */
  var userDefinedFunctionResources: js.UndefOr[js.Array[UserDefinedFunctionResource]] = js.undefined
  /**
    * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table
    * already exists, BigQuery overwrites the table data and uses the schema from the query result. WRITE_APPEND: If the table already exists, BigQuery
    * appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The
    * default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and
    * append actions occur as one atomic update upon job completion.
    */
  var writeDisposition: js.UndefOr[java.lang.String] = js.undefined
}

