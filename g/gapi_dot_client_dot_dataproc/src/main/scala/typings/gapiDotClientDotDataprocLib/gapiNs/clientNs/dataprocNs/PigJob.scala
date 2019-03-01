package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PigJob extends js.Object {
  /**
    * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent
    * parallel queries.
    */
  var continueOnFailure: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs. */
  var jarFileUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Optional. The runtime log config for job execution. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.undefined
  /**
    * Optional. A mapping of property names to values, used to configure Pig. Properties that conflict with values set by the Cloud Dataproc API may be
    * overwritten. Can include properties set in /etc/hadoop/conf/&#42;-site.xml, /etc/pig/conf/pig.properties, and classes in user code.
    */
  var properties: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The HCFS URI of the script that contains the Pig queries. */
  var queryFileUri: js.UndefOr[java.lang.String] = js.undefined
  /** A list of queries. */
  var queryList: js.UndefOr[QueryList] = js.undefined
  /** Optional. Mapping of query variable names to values (equivalent to the Pig command: name=[value]). */
  var scriptVariables: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

object PigJob {
  @scala.inline
  def apply(
    continueOnFailure: js.UndefOr[scala.Boolean] = js.undefined,
    jarFileUris: js.Array[java.lang.String] = null,
    loggingConfig: LoggingConfig = null,
    properties: stdLib.Record[java.lang.String, java.lang.String] = null,
    queryFileUri: java.lang.String = null,
    queryList: QueryList = null,
    scriptVariables: stdLib.Record[java.lang.String, java.lang.String] = null
  ): PigJob = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(continueOnFailure)) __obj.updateDynamic("continueOnFailure")(continueOnFailure)
    if (jarFileUris != null) __obj.updateDynamic("jarFileUris")(jarFileUris)
    if (loggingConfig != null) __obj.updateDynamic("loggingConfig")(loggingConfig)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (queryFileUri != null) __obj.updateDynamic("queryFileUri")(queryFileUri)
    if (queryList != null) __obj.updateDynamic("queryList")(queryList)
    if (scriptVariables != null) __obj.updateDynamic("scriptVariables")(scriptVariables)
    __obj.asInstanceOf[PigJob]
  }
}

