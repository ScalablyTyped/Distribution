package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaJobConfiguration extends js.Object {
  /**
    * [Pick one] Copies a table.
    */
  var copy: js.UndefOr[SchemaJobConfigurationTableCopy] = js.native
  /**
    * [Optional] If set, don&#39;t actually run this job. A valid query will
    * return a mostly empty response with some processing statistics, while an
    * invalid query will return the same error it would if it wasn&#39;t a dry
    * run. Behavior of non-query jobs is undefined.
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  /**
    * [Pick one] Configures an extract job.
    */
  var extract: js.UndefOr[SchemaJobConfigurationExtract] = js.native
  /**
    * [Optional] Job timeout in milliseconds. If this time limit is exceeded,
    * BigQuery may attempt to terminate the job.
    */
  var jobTimeoutMs: js.UndefOr[String] = js.native
  /**
    * [Output-only] The type of the job. Can be QUERY, LOAD, EXTRACT, COPY or
    * UNKNOWN.
    */
  var jobType: js.UndefOr[String] = js.native
  /**
    * The labels associated with this job. You can use these to organize and
    * group your jobs. Label keys and values can be no longer than 63
    * characters, can only contain lowercase letters, numeric characters,
    * underscores and dashes. International characters are allowed. Label
    * values are optional. Label keys must start with a letter and each label
    * in the list must have a different key.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * [Pick one] Configures a load job.
    */
  var load: js.UndefOr[SchemaJobConfigurationLoad] = js.native
  /**
    * [Pick one] Configures a query job.
    */
  var query: js.UndefOr[SchemaJobConfigurationQuery] = js.native
}

object SchemaJobConfiguration {
  @scala.inline
  def apply(): SchemaJobConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobConfiguration]
  }
  @scala.inline
  implicit class SchemaJobConfigurationOps[Self <: SchemaJobConfiguration] (val x: Self) extends AnyVal {
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
    def setCopy(value: SchemaJobConfigurationTableCopy): Self = this.set("copy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    @scala.inline
    def setExtract(value: SchemaJobConfigurationExtract): Self = this.set("extract", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtract: Self = this.set("extract", js.undefined)
    @scala.inline
    def setJobTimeoutMs(value: String): Self = this.set("jobTimeoutMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobTimeoutMs: Self = this.set("jobTimeoutMs", js.undefined)
    @scala.inline
    def setJobType(value: String): Self = this.set("jobType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobType: Self = this.set("jobType", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLoad(value: SchemaJobConfigurationLoad): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setQuery(value: SchemaJobConfigurationQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

