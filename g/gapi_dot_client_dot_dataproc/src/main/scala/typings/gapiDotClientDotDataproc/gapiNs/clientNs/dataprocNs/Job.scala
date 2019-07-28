package typings.gapiDotClientDotDataproc.gapiNs.clientNs.dataprocNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  /**
    * Output-only. If present, the location of miscellaneous control files which may be used as part of job setup and handling. If not present, control files
    * may be placed in the same location as driver_output_uri.
    */
  var driverControlFilesUri: js.UndefOr[String] = js.undefined
  /** Output-only. A URI pointing to the location of the stdout of the job's driver program. */
  var driverOutputResourceUri: js.UndefOr[String] = js.undefined
  /** Job is a Hadoop job. */
  var hadoopJob: js.UndefOr[HadoopJob] = js.undefined
  /** Job is a Hive job. */
  var hiveJob: js.UndefOr[HiveJob] = js.undefined
  /**
    * Optional. The labels to associate with this job. Label keys must contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a job.
    */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /** Job is a Pig job. */
  var pigJob: js.UndefOr[PigJob] = js.undefined
  /** Required. Job information, including how, when, and where to run the job. */
  var placement: js.UndefOr[JobPlacement] = js.undefined
  /** Job is a Pyspark job. */
  var pysparkJob: js.UndefOr[PySparkJob] = js.undefined
  /**
    * Optional. The fully qualified reference to the job, which can be used to obtain the equivalent REST path of the job resource. If this property is not
    * specified when a job is created, the server generates a <code>job_id</code>.
    */
  var reference: js.UndefOr[JobReference] = js.undefined
  /** Optional. Job scheduling configuration. */
  var scheduling: js.UndefOr[JobScheduling] = js.undefined
  /** Job is a Spark job. */
  var sparkJob: js.UndefOr[SparkJob] = js.undefined
  /** Job is a SparkSql job. */
  var sparkSqlJob: js.UndefOr[SparkSqlJob] = js.undefined
  /**
    * Output-only. The job status. Additional application-specific status information may be contained in the <code>type_job</code> and
    * <code>yarn_applications</code> fields.
    */
  var status: js.UndefOr[JobStatus] = js.undefined
  /** Output-only. The previous job status. */
  var statusHistory: js.UndefOr[js.Array[JobStatus]] = js.undefined
  /**
    * Output-only. The collection of YARN applications spun up by this job.Beta Feature: This report is available for testing purposes only. It may be
    * changed before final release.
    */
  var yarnApplications: js.UndefOr[js.Array[YarnApplication]] = js.undefined
}

object Job {
  @scala.inline
  def apply(
    driverControlFilesUri: String = null,
    driverOutputResourceUri: String = null,
    hadoopJob: HadoopJob = null,
    hiveJob: HiveJob = null,
    labels: Record[String, String] = null,
    pigJob: PigJob = null,
    placement: JobPlacement = null,
    pysparkJob: PySparkJob = null,
    reference: JobReference = null,
    scheduling: JobScheduling = null,
    sparkJob: SparkJob = null,
    sparkSqlJob: SparkSqlJob = null,
    status: JobStatus = null,
    statusHistory: js.Array[JobStatus] = null,
    yarnApplications: js.Array[YarnApplication] = null
  ): Job = {
    val __obj = js.Dynamic.literal()
    if (driverControlFilesUri != null) __obj.updateDynamic("driverControlFilesUri")(driverControlFilesUri)
    if (driverOutputResourceUri != null) __obj.updateDynamic("driverOutputResourceUri")(driverOutputResourceUri)
    if (hadoopJob != null) __obj.updateDynamic("hadoopJob")(hadoopJob)
    if (hiveJob != null) __obj.updateDynamic("hiveJob")(hiveJob)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (pigJob != null) __obj.updateDynamic("pigJob")(pigJob)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (pysparkJob != null) __obj.updateDynamic("pysparkJob")(pysparkJob)
    if (reference != null) __obj.updateDynamic("reference")(reference)
    if (scheduling != null) __obj.updateDynamic("scheduling")(scheduling)
    if (sparkJob != null) __obj.updateDynamic("sparkJob")(sparkJob)
    if (sparkSqlJob != null) __obj.updateDynamic("sparkSqlJob")(sparkSqlJob)
    if (status != null) __obj.updateDynamic("status")(status)
    if (statusHistory != null) __obj.updateDynamic("statusHistory")(statusHistory)
    if (yarnApplications != null) __obj.updateDynamic("yarnApplications")(yarnApplications)
    __obj.asInstanceOf[Job]
  }
}

