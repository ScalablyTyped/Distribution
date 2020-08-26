package typings.gapiClientDataproc.gapi.client.dataproc

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  /**
    * Output-only. If present, the location of miscellaneous control files which may be used as part of job setup and handling. If not present, control files
    * may be placed in the same location as driver_output_uri.
    */
  var driverControlFilesUri: js.UndefOr[String] = js.native
  /** Output-only. A URI pointing to the location of the stdout of the job's driver program. */
  var driverOutputResourceUri: js.UndefOr[String] = js.native
  /** Job is a Hadoop job. */
  var hadoopJob: js.UndefOr[HadoopJob] = js.native
  /** Job is a Hive job. */
  var hiveJob: js.UndefOr[HiveJob] = js.native
  /**
    * Optional. The labels to associate with this job. Label keys must contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a job.
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /** Job is a Pig job. */
  var pigJob: js.UndefOr[PigJob] = js.native
  /** Required. Job information, including how, when, and where to run the job. */
  var placement: js.UndefOr[JobPlacement] = js.native
  /** Job is a Pyspark job. */
  var pysparkJob: js.UndefOr[PySparkJob] = js.native
  /**
    * Optional. The fully qualified reference to the job, which can be used to obtain the equivalent REST path of the job resource. If this property is not
    * specified when a job is created, the server generates a <code>job_id</code>.
    */
  var reference: js.UndefOr[JobReference] = js.native
  /** Optional. Job scheduling configuration. */
  var scheduling: js.UndefOr[JobScheduling] = js.native
  /** Job is a Spark job. */
  var sparkJob: js.UndefOr[SparkJob] = js.native
  /** Job is a SparkSql job. */
  var sparkSqlJob: js.UndefOr[SparkSqlJob] = js.native
  /**
    * Output-only. The job status. Additional application-specific status information may be contained in the <code>type_job</code> and
    * <code>yarn_applications</code> fields.
    */
  var status: js.UndefOr[JobStatus] = js.native
  /** Output-only. The previous job status. */
  var statusHistory: js.UndefOr[js.Array[JobStatus]] = js.native
  /**
    * Output-only. The collection of YARN applications spun up by this job.Beta Feature: This report is available for testing purposes only. It may be
    * changed before final release.
    */
  var yarnApplications: js.UndefOr[js.Array[YarnApplication]] = js.native
}

object Job {
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
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
    def setDriverControlFilesUri(value: String): Self = this.set("driverControlFilesUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriverControlFilesUri: Self = this.set("driverControlFilesUri", js.undefined)
    @scala.inline
    def setDriverOutputResourceUri(value: String): Self = this.set("driverOutputResourceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriverOutputResourceUri: Self = this.set("driverOutputResourceUri", js.undefined)
    @scala.inline
    def setHadoopJob(value: HadoopJob): Self = this.set("hadoopJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHadoopJob: Self = this.set("hadoopJob", js.undefined)
    @scala.inline
    def setHiveJob(value: HiveJob): Self = this.set("hiveJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiveJob: Self = this.set("hiveJob", js.undefined)
    @scala.inline
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setPigJob(value: PigJob): Self = this.set("pigJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePigJob: Self = this.set("pigJob", js.undefined)
    @scala.inline
    def setPlacement(value: JobPlacement): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPysparkJob(value: PySparkJob): Self = this.set("pysparkJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePysparkJob: Self = this.set("pysparkJob", js.undefined)
    @scala.inline
    def setReference(value: JobReference): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
    @scala.inline
    def setScheduling(value: JobScheduling): Self = this.set("scheduling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduling: Self = this.set("scheduling", js.undefined)
    @scala.inline
    def setSparkJob(value: SparkJob): Self = this.set("sparkJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSparkJob: Self = this.set("sparkJob", js.undefined)
    @scala.inline
    def setSparkSqlJob(value: SparkSqlJob): Self = this.set("sparkSqlJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSparkSqlJob: Self = this.set("sparkSqlJob", js.undefined)
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusHistoryVarargs(value: JobStatus*): Self = this.set("statusHistory", js.Array(value :_*))
    @scala.inline
    def setStatusHistory(value: js.Array[JobStatus]): Self = this.set("statusHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusHistory: Self = this.set("statusHistory", js.undefined)
    @scala.inline
    def setYarnApplicationsVarargs(value: YarnApplication*): Self = this.set("yarnApplications", js.Array(value :_*))
    @scala.inline
    def setYarnApplications(value: js.Array[YarnApplication]): Self = this.set("yarnApplications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYarnApplications: Self = this.set("yarnApplications", js.undefined)
  }
  
}

