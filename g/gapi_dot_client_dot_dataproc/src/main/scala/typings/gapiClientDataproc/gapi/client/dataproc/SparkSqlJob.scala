package typings.gapiClientDataproc.gapi.client.dataproc

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkSqlJob extends js.Object {
  /** Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH. */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.native
  /** Optional. The runtime log config for job execution. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.native
  /**
    * Optional. A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Cloud
    * Dataproc API may be overwritten.
    */
  var properties: js.UndefOr[Record[String, String]] = js.native
  /** The HCFS URI of the script that contains SQL queries. */
  var queryFileUri: js.UndefOr[String] = js.native
  /** A list of queries. */
  var queryList: js.UndefOr[QueryList] = js.native
  /** Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name="value";). */
  var scriptVariables: js.UndefOr[Record[String, String]] = js.native
}

object SparkSqlJob {
  @scala.inline
  def apply(): SparkSqlJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparkSqlJob]
  }
  @scala.inline
  implicit class SparkSqlJobOps[Self <: SparkSqlJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJarFileUrisVarargs(value: String*): Self = this.set("jarFileUris", js.Array(value :_*))
    @scala.inline
    def setJarFileUris(value: js.Array[String]): Self = this.set("jarFileUris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJarFileUris: Self = this.set("jarFileUris", js.undefined)
    @scala.inline
    def setLoggingConfig(value: LoggingConfig): Self = this.set("loggingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingConfig: Self = this.set("loggingConfig", js.undefined)
    @scala.inline
    def setProperties(value: Record[String, String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setQueryFileUri(value: String): Self = this.set("queryFileUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryFileUri: Self = this.set("queryFileUri", js.undefined)
    @scala.inline
    def setQueryList(value: QueryList): Self = this.set("queryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryList: Self = this.set("queryList", js.undefined)
    @scala.inline
    def setScriptVariables(value: Record[String, String]): Self = this.set("scriptVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptVariables: Self = this.set("scriptVariables", js.undefined)
  }
  
}

