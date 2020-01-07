package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Dataproc job for running Presto (https://prestosql.io/) queries
  */
@js.native
trait Schema$PrestoJob extends js.Object {
  /**
    * Optional. Presto client tags to attach to this query
    */
  var clientTags: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. Whether to continue executing queries if a query fails. The
    * default value is false. Setting to true can be useful when executing
    * independent parallel queries.
    */
  var continueOnFailure: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The runtime log config for job execution.
    */
  var loggingConfig: js.UndefOr[Schema$LoggingConfig] = js.native
  /**
    * Optional. The format in which query output will be displayed. See the
    * Presto documentation for supported output formats
    */
  var outputFormat: js.UndefOr[String] = js.native
  /**
    * Optional. A mapping of property names to values. Used to set Presto
    * session properties
    * (https://prestodb.io/docs/current/sql/set-session.html) Equivalent to
    * using the --session flag in the Presto CLI
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The HCFS URI of the script that contains SQL queries.
    */
  var queryFileUri: js.UndefOr[String] = js.native
  /**
    * A list of queries.
    */
  var queryList: js.UndefOr[Schema$QueryList] = js.native
}

object Schema$PrestoJob {
  @scala.inline
  def apply(
    clientTags: js.Array[String] = null,
    continueOnFailure: js.UndefOr[Boolean] = js.undefined,
    loggingConfig: Schema$LoggingConfig = null,
    outputFormat: String = null,
    properties: StringDictionary[String] = null,
    queryFileUri: String = null,
    queryList: Schema$QueryList = null
  ): Schema$PrestoJob = {
    val __obj = js.Dynamic.literal()
    if (clientTags != null) __obj.updateDynamic("clientTags")(clientTags.asInstanceOf[js.Any])
    if (!js.isUndefined(continueOnFailure)) __obj.updateDynamic("continueOnFailure")(continueOnFailure.asInstanceOf[js.Any])
    if (loggingConfig != null) __obj.updateDynamic("loggingConfig")(loggingConfig.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (queryFileUri != null) __obj.updateDynamic("queryFileUri")(queryFileUri.asInstanceOf[js.Any])
    if (queryList != null) __obj.updateDynamic("queryList")(queryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PrestoJob]
  }
}

