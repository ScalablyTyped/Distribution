package typings.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Dataproc job resource.
  */
@js.native
trait Schema$Job extends js.Object {
  /**
    * Output only. If present, the location of miscellaneous control files
    * which may be used as part of job setup and handling. If not present,
    * control files may be placed in the same location as driver_output_uri.
    */
  var driverControlFilesUri: js.UndefOr[String] = js.native
  /**
    * Output only. A URI pointing to the location of the stdout of the
    * job&#39;s driver program.
    */
  var driverOutputResourceUri: js.UndefOr[String] = js.native
  /**
    * Job is a Hadoop job.
    */
  var hadoopJob: js.UndefOr[Schema$HadoopJob] = js.native
  /**
    * Job is a Hive job.
    */
  var hiveJob: js.UndefOr[Schema$HiveJob] = js.native
  /**
    * Output only. A UUID that uniquely identifies a job within the project
    * over time. This is in contrast to a user-settable reference.job_id that
    * may be reused over time.
    */
  var jobUuid: js.UndefOr[String] = js.native
  /**
    * Optional. The labels to associate with this job. Label keys must contain
    * 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but,
    * if present, must contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
    * associated with a job.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Job is a Pig job.
    */
  var pigJob: js.UndefOr[Schema$PigJob] = js.native
  /**
    * Required. Job information, including how, when, and where to run the job.
    */
  var placement: js.UndefOr[Schema$JobPlacement] = js.native
  /**
    * Job is a Pyspark job.
    */
  var pysparkJob: js.UndefOr[Schema$PySparkJob] = js.native
  /**
    * Optional. The fully qualified reference to the job, which can be used to
    * obtain the equivalent REST path of the job resource. If this property is
    * not specified when a job is created, the server generates a
    * &lt;code&gt;job_id&lt;/code&gt;.
    */
  var reference: js.UndefOr[Schema$JobReference] = js.native
  /**
    * Optional. Job scheduling configuration.
    */
  var scheduling: js.UndefOr[Schema$JobScheduling] = js.native
  /**
    * Job is a Spark job.
    */
  var sparkJob: js.UndefOr[Schema$SparkJob] = js.native
  /**
    * Job is a SparkSql job.
    */
  var sparkSqlJob: js.UndefOr[Schema$SparkSqlJob] = js.native
  /**
    * Output only. The job status. Additional application-specific status
    * information may be contained in the &lt;code&gt;type_job&lt;/code&gt; and
    * &lt;code&gt;yarn_applications&lt;/code&gt; fields.
    */
  var status: js.UndefOr[Schema$JobStatus] = js.native
  /**
    * Output only. The previous job status.
    */
  var statusHistory: js.UndefOr[js.Array[Schema$JobStatus]] = js.native
  /**
    * Output only. The collection of YARN applications spun up by this job.Beta
    * Feature: This report is available for testing purposes only. It may be
    * changed before final release.
    */
  var yarnApplications: js.UndefOr[js.Array[Schema$YarnApplication]] = js.native
}

object Schema$Job {
  @scala.inline
  def apply(
    driverControlFilesUri: String = null,
    driverOutputResourceUri: String = null,
    hadoopJob: Schema$HadoopJob = null,
    hiveJob: Schema$HiveJob = null,
    jobUuid: String = null,
    labels: StringDictionary[String] = null,
    pigJob: Schema$PigJob = null,
    placement: Schema$JobPlacement = null,
    pysparkJob: Schema$PySparkJob = null,
    reference: Schema$JobReference = null,
    scheduling: Schema$JobScheduling = null,
    sparkJob: Schema$SparkJob = null,
    sparkSqlJob: Schema$SparkSqlJob = null,
    status: Schema$JobStatus = null,
    statusHistory: js.Array[Schema$JobStatus] = null,
    yarnApplications: js.Array[Schema$YarnApplication] = null
  ): Schema$Job = {
    val __obj = js.Dynamic.literal()
    if (driverControlFilesUri != null) __obj.updateDynamic("driverControlFilesUri")(driverControlFilesUri.asInstanceOf[js.Any])
    if (driverOutputResourceUri != null) __obj.updateDynamic("driverOutputResourceUri")(driverOutputResourceUri.asInstanceOf[js.Any])
    if (hadoopJob != null) __obj.updateDynamic("hadoopJob")(hadoopJob.asInstanceOf[js.Any])
    if (hiveJob != null) __obj.updateDynamic("hiveJob")(hiveJob.asInstanceOf[js.Any])
    if (jobUuid != null) __obj.updateDynamic("jobUuid")(jobUuid.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (pigJob != null) __obj.updateDynamic("pigJob")(pigJob.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (pysparkJob != null) __obj.updateDynamic("pysparkJob")(pysparkJob.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    if (scheduling != null) __obj.updateDynamic("scheduling")(scheduling.asInstanceOf[js.Any])
    if (sparkJob != null) __obj.updateDynamic("sparkJob")(sparkJob.asInstanceOf[js.Any])
    if (sparkSqlJob != null) __obj.updateDynamic("sparkSqlJob")(sparkSqlJob.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusHistory != null) __obj.updateDynamic("statusHistory")(statusHistory.asInstanceOf[js.Any])
    if (yarnApplications != null) __obj.updateDynamic("yarnApplications")(yarnApplications.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Job]
  }
}

