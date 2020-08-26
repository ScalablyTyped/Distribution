package typings.gapiClientDataproc.gapi.client.dataproc

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HiveJob extends js.Object {
  /**
    * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent
    * parallel queries.
    */
  var continueOnFailure: js.UndefOr[Boolean] = js.native
  /** Optional. HCFS URIs of jar files to add to the CLASSPATH of the Hive server and Hadoop MapReduce (MR) tasks. Can contain Hive SerDes and UDFs. */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. A mapping of property names and values, used to configure Hive. Properties that conflict with values set by the Cloud Dataproc API may be
    * overwritten. Can include properties set in /etc/hadoop/conf/&#42;-site.xml, /etc/hive/conf/hive-site.xml, and classes in user code.
    */
  var properties: js.UndefOr[Record[String, String]] = js.native
  /** The HCFS URI of the script that contains Hive queries. */
  var queryFileUri: js.UndefOr[String] = js.native
  /** A list of queries. */
  var queryList: js.UndefOr[QueryList] = js.native
  /** Optional. Mapping of query variable names to values (equivalent to the Hive command: SET name="value";). */
  var scriptVariables: js.UndefOr[Record[String, String]] = js.native
}

object HiveJob {
  @scala.inline
  def apply(): HiveJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HiveJob]
  }
  @scala.inline
  implicit class HiveJobOps[Self <: HiveJob] (val x: Self) extends AnyVal {
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
    def setContinueOnFailure(value: Boolean): Self = this.set("continueOnFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinueOnFailure: Self = this.set("continueOnFailure", js.undefined)
    @scala.inline
    def setJarFileUrisVarargs(value: String*): Self = this.set("jarFileUris", js.Array(value :_*))
    @scala.inline
    def setJarFileUris(value: js.Array[String]): Self = this.set("jarFileUris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJarFileUris: Self = this.set("jarFileUris", js.undefined)
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

