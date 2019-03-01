package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparkSqlJob extends js.Object {
  /** Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH. */
  var jarFileUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Optional. The runtime log config for job execution. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.undefined
  /**
    * Optional. A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Cloud
    * Dataproc API may be overwritten.
    */
  var properties: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The HCFS URI of the script that contains SQL queries. */
  var queryFileUri: js.UndefOr[java.lang.String] = js.undefined
  /** A list of queries. */
  var queryList: js.UndefOr[QueryList] = js.undefined
  /** Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name="value";). */
  var scriptVariables: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

object SparkSqlJob {
  @scala.inline
  def apply(
    jarFileUris: js.Array[java.lang.String] = null,
    loggingConfig: LoggingConfig = null,
    properties: stdLib.Record[java.lang.String, java.lang.String] = null,
    queryFileUri: java.lang.String = null,
    queryList: QueryList = null,
    scriptVariables: stdLib.Record[java.lang.String, java.lang.String] = null
  ): SparkSqlJob = {
    val __obj = js.Dynamic.literal()
    if (jarFileUris != null) __obj.updateDynamic("jarFileUris")(jarFileUris)
    if (loggingConfig != null) __obj.updateDynamic("loggingConfig")(loggingConfig)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (queryFileUri != null) __obj.updateDynamic("queryFileUri")(queryFileUri)
    if (queryList != null) __obj.updateDynamic("queryList")(queryList)
    if (scriptVariables != null) __obj.updateDynamic("scriptVariables")(scriptVariables)
    __obj.asInstanceOf[SparkSqlJob]
  }
}

