package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteSqlRequest extends js.Object {
  /**
    * It is not always possible for Cloud Spanner to infer the right SQL type
    * from a JSON value.  For example, values of type `BYTES` and values
    * of type `STRING` both appear in params as JSON strings.
    *
    * In these cases, `param_types` can be used to specify the exact
    * SQL type for some or all of the SQL query parameters. See the
    * definition of Type for more information
    * about SQL types.
    */
  var paramTypes: js.UndefOr[stdLib.Record[java.lang.String, Type]] = js.undefined
  /**
    * The SQL query string can contain parameter placeholders. A parameter
    * placeholder consists of `'@'` followed by the parameter
    * name. Parameter names consist of any combination of letters,
    * numbers, and underscores.
    *
    * Parameters can appear anywhere that a literal value is expected.  The same
    * parameter name can be used more than once, for example:
    * `"WHERE id > @msg_id AND id < @msg_id + 100"`
    *
    * It is an error to execute an SQL query with unbound parameters.
    *
    * Parameter values are specified using `params`, which is a JSON
    * object whose keys are parameter names, and whose values are the
    * corresponding parameter values.
    */
  var params: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
    * Used to control the amount of debugging information returned in
    * ResultSetStats.
    */
  var queryMode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If this request is resuming a previously interrupted SQL query
    * execution, `resume_token` should be copied from the last
    * PartialResultSet yielded before the interruption. Doing this
    * enables the new SQL query execution to resume where the last one left
    * off. The rest of the request parameters must exactly match the
    * request that yielded this token.
    */
  var resumeToken: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The SQL query string. */
  var sql: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The transaction to use. If none is provided, the default is a
    * temporary read-only transaction with strong concurrency.
    */
  var transaction: js.UndefOr[TransactionSelector] = js.undefined
}

object ExecuteSqlRequest {
  @scala.inline
  def apply(
    paramTypes: stdLib.Record[java.lang.String, Type] = null,
    params: stdLib.Record[java.lang.String, _] = null,
    queryMode: java.lang.String = null,
    resumeToken: java.lang.String = null,
    sql: java.lang.String = null,
    transaction: TransactionSelector = null
  ): ExecuteSqlRequest = {
    val __obj = js.Dynamic.literal()
    if (paramTypes != null) __obj.updateDynamic("paramTypes")(paramTypes)
    if (params != null) __obj.updateDynamic("params")(params)
    if (queryMode != null) __obj.updateDynamic("queryMode")(queryMode)
    if (resumeToken != null) __obj.updateDynamic("resumeToken")(resumeToken)
    if (sql != null) __obj.updateDynamic("sql")(sql)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    __obj.asInstanceOf[ExecuteSqlRequest]
  }
}

