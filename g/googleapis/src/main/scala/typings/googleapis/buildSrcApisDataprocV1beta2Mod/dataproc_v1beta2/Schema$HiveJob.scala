package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Dataproc job for running Apache Hive (https://hive.apache.org/)
  * queries on YARN.
  */
@js.native
trait Schema$HiveJob extends js.Object {
  /**
    * Optional. Whether to continue executing queries if a query fails. The
    * default value is false. Setting to true can be useful when executing
    * independent parallel queries.
    */
  var continueOnFailure: js.UndefOr[Boolean] = js.native
  /**
    * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Hive
    * server and Hadoop MapReduce (MR) tasks. Can contain Hive SerDes and UDFs.
    */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. A mapping of property names and values, used to configure Hive.
    * Properties that conflict with values set by the Cloud Dataproc API may be
    * overwritten. Can include properties set in /etc/hadoop/conf/ *-site.xml,
    * /etc/hive/conf/hive-site.xml, and classes in user code.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The HCFS URI of the script that contains Hive queries.
    */
  var queryFileUri: js.UndefOr[String] = js.native
  /**
    * A list of queries.
    */
  var queryList: js.UndefOr[Schema$QueryList] = js.native
  /**
    * Optional. Mapping of query variable names to values (equivalent to the
    * Hive command: SET name=&quot;value&quot;;).
    */
  var scriptVariables: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$HiveJob {
  @scala.inline
  def apply(
    continueOnFailure: js.UndefOr[Boolean] = js.undefined,
    jarFileUris: js.Array[String] = null,
    properties: StringDictionary[String] = null,
    queryFileUri: String = null,
    queryList: Schema$QueryList = null,
    scriptVariables: StringDictionary[String] = null
  ): Schema$HiveJob = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(continueOnFailure)) __obj.updateDynamic("continueOnFailure")(continueOnFailure.asInstanceOf[js.Any])
    if (jarFileUris != null) __obj.updateDynamic("jarFileUris")(jarFileUris.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (queryFileUri != null) __obj.updateDynamic("queryFileUri")(queryFileUri.asInstanceOf[js.Any])
    if (queryList != null) __obj.updateDynamic("queryList")(queryList.asInstanceOf[js.Any])
    if (scriptVariables != null) __obj.updateDynamic("scriptVariables")(scriptVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HiveJob]
  }
}

