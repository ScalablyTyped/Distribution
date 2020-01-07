package typings.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Dataproc job for running Apache Pig (https://pig.apache.org/)
  * queries on YARN.
  */
@js.native
trait Schema$PigJob extends js.Object {
  /**
    * Optional. Whether to continue executing queries if a query fails. The
    * default value is false. Setting to true can be useful when executing
    * independent parallel queries.
    */
  var continueOnFailure: js.UndefOr[Boolean] = js.native
  /**
    * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig
    * Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
    */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The runtime log config for job execution.
    */
  var loggingConfig: js.UndefOr[Schema$LoggingConfig] = js.native
  /**
    * Optional. A mapping of property names to values, used to configure Pig.
    * Properties that conflict with values set by the Cloud Dataproc API may be
    * overwritten. Can include properties set in /etc/hadoop/conf/ *-site.xml,
    * /etc/pig/conf/pig.properties, and classes in user code.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The HCFS URI of the script that contains the Pig queries.
    */
  var queryFileUri: js.UndefOr[String] = js.native
  /**
    * A list of queries.
    */
  var queryList: js.UndefOr[Schema$QueryList] = js.native
  /**
    * Optional. Mapping of query variable names to values (equivalent to the
    * Pig command: name=[value]).
    */
  var scriptVariables: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$PigJob {
  @scala.inline
  def apply(
    continueOnFailure: js.UndefOr[Boolean] = js.undefined,
    jarFileUris: js.Array[String] = null,
    loggingConfig: Schema$LoggingConfig = null,
    properties: StringDictionary[String] = null,
    queryFileUri: String = null,
    queryList: Schema$QueryList = null,
    scriptVariables: StringDictionary[String] = null
  ): Schema$PigJob = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(continueOnFailure)) __obj.updateDynamic("continueOnFailure")(continueOnFailure.asInstanceOf[js.Any])
    if (jarFileUris != null) __obj.updateDynamic("jarFileUris")(jarFileUris.asInstanceOf[js.Any])
    if (loggingConfig != null) __obj.updateDynamic("loggingConfig")(loggingConfig.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (queryFileUri != null) __obj.updateDynamic("queryFileUri")(queryFileUri.asInstanceOf[js.Any])
    if (queryList != null) __obj.updateDynamic("queryList")(queryList.asInstanceOf[js.Any])
    if (scriptVariables != null) __obj.updateDynamic("scriptVariables")(scriptVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PigJob]
  }
}

