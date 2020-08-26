package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobConfiguration extends js.Object {
  var copy: js.UndefOr[JobConfigurationTableCopy] = js.native
  var dryRun: js.UndefOr[Boolean] = js.native
  var extract: js.UndefOr[JobConfigurationExtract] = js.native
  var jobTimeoutMs: js.UndefOr[String] = js.native
  var jobType: js.UndefOr[String] = js.native
  var labels: js.UndefOr[js.Object] = js.native
  var load: js.UndefOr[JobConfigurationLoad] = js.native
  var query: js.UndefOr[JobConfigurationQuery] = js.native
}

object JobConfiguration {
  @scala.inline
  def apply(): JobConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfiguration]
  }
  @scala.inline
  implicit class JobConfigurationOps[Self <: JobConfiguration] (val x: Self) extends AnyVal {
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
    def setCopy(value: JobConfigurationTableCopy): Self = this.set("copy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    @scala.inline
    def setExtract(value: JobConfigurationExtract): Self = this.set("extract", value.asInstanceOf[js.Any])
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
    def setLabels(value: js.Object): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLoad(value: JobConfigurationLoad): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setQuery(value: JobConfigurationQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

