package typings.gapiDotClientDotDataproc.gapi.client.dataproc

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HiveJob extends js.Object {
  /**
    * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent
    * parallel queries.
    */
  var continueOnFailure: js.UndefOr[Boolean] = js.undefined
  /** Optional. HCFS URIs of jar files to add to the CLASSPATH of the Hive server and Hadoop MapReduce (MR) tasks. Can contain Hive SerDes and UDFs. */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional. A mapping of property names and values, used to configure Hive. Properties that conflict with values set by the Cloud Dataproc API may be
    * overwritten. Can include properties set in /etc/hadoop/conf/&#42;-site.xml, /etc/hive/conf/hive-site.xml, and classes in user code.
    */
  var properties: js.UndefOr[Record[String, String]] = js.undefined
  /** The HCFS URI of the script that contains Hive queries. */
  var queryFileUri: js.UndefOr[String] = js.undefined
  /** A list of queries. */
  var queryList: js.UndefOr[QueryList] = js.undefined
  /** Optional. Mapping of query variable names to values (equivalent to the Hive command: SET name="value";). */
  var scriptVariables: js.UndefOr[Record[String, String]] = js.undefined
}

object HiveJob {
  @scala.inline
  def apply(
    continueOnFailure: js.UndefOr[Boolean] = js.undefined,
    jarFileUris: js.Array[String] = null,
    properties: Record[String, String] = null,
    queryFileUri: String = null,
    queryList: QueryList = null,
    scriptVariables: Record[String, String] = null
  ): HiveJob = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(continueOnFailure)) __obj.updateDynamic("continueOnFailure")(continueOnFailure)
    if (jarFileUris != null) __obj.updateDynamic("jarFileUris")(jarFileUris)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (queryFileUri != null) __obj.updateDynamic("queryFileUri")(queryFileUri)
    if (queryList != null) __obj.updateDynamic("queryList")(queryList)
    if (scriptVariables != null) __obj.updateDynamic("scriptVariables")(scriptVariables)
    __obj.asInstanceOf[HiveJob]
  }
}

