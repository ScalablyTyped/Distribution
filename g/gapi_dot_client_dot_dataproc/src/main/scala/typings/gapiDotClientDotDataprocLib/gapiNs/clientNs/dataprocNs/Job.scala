package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  /**
    * Output-only. If present, the location of miscellaneous control files which may be used as part of job setup and handling. If not present, control files
    * may be placed in the same location as driver_output_uri.
    */
  var driverControlFilesUri: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. A URI pointing to the location of the stdout of the job's driver program. */
  var driverOutputResourceUri: js.UndefOr[java.lang.String] = js.undefined
  /** Job is a Hadoop job. */
  var hadoopJob: js.UndefOr[HadoopJob] = js.undefined
  /** Job is a Hive job. */
  var hiveJob: js.UndefOr[HiveJob] = js.undefined
  /**
    * Optional. The labels to associate with this job. Label keys must contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a job.
    */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
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

