package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a job to be run by the Cloud Dataflow service.
  */
@js.native
trait Schema$Job extends js.Object {
  /**
    * The client&#39;s unique identifier of the job, re-used across retried
    * attempts. If this field is set, the service will ensure its uniqueness.
    * The request to create a job will fail if the service has knowledge of a
    * previously submitted job with the same client&#39;s ID and job name. The
    * caller may use this field to ensure idempotence of job creation across
    * retried attempts to create a job. By default, the field is empty and, in
    * that case, the service ignores it.
    */
  var clientRequestId: js.UndefOr[String] = js.native
  /**
    * The timestamp when the job was initially created. Immutable and set by
    * the Cloud Dataflow service.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * If this is specified, the job&#39;s initial state is populated from the
    * given snapshot.
    */
  var createdFromSnapshotId: js.UndefOr[String] = js.native
  /**
    * The current state of the job.  Jobs are created in the
    * `JOB_STATE_STOPPED` state unless otherwise specified.  A job in the
    * `JOB_STATE_RUNNING` state may asynchronously enter a terminal state.
    * After a job has reached a terminal state, no further state updates may be
    * made.  This field may be mutated by the Cloud Dataflow service; callers
    * cannot mutate it.
    */
  var currentState: js.UndefOr[String] = js.native
  /**
    * The timestamp associated with the current state.
    */
  var currentStateTime: js.UndefOr[String] = js.native
  /**
    * The environment for the job.
    */
  var environment: js.UndefOr[Schema$Environment] = js.native
  /**
    * Deprecated.
    */
  var executionInfo: js.UndefOr[Schema$JobExecutionInfo] = js.native
  /**
    * The unique ID of this job.  This field is set by the Cloud Dataflow
    * service when the Job is created, and is immutable for the life of the
    * job.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * This field is populated by the Dataflow service to support filtering jobs
    * by the metadata values provided here. Populated for ListJobs and all
    * GetJob views SUMMARY and higher.
    */
  var jobMetadata: js.UndefOr[Schema$JobMetadata] = js.native
  /**
    * User-defined labels for this job.  The labels map can contain no more
    * than 64 entries.  Entries of the labels map are UTF8 strings that comply
    * with the following restrictions:  * Keys must conform to regexp:
    * \p{Ll}\p{Lo}{0,62} * Values must conform to regexp:
    * [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally
    * constrained to be &lt;= 128 bytes in size.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains this job.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The user-specified Cloud Dataflow job name.  Only one Job with a given
    * name may exist in a project at any given time. If a caller attempts to
    * create a Job with the same name as an already-existing Job, the attempt
    * returns the existing Job.  The name must match the regular expression
    * `[a-z]([-a-z0-9]{0,38}[a-z0-9])?`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Preliminary field: The format of this data may change at any time. A
    * description of the user pipeline and stages through which it is executed.
    * Created by Cloud Dataflow service.  Only retrieved with
    * JOB_VIEW_DESCRIPTION or JOB_VIEW_ALL.
    */
  var pipelineDescription: js.UndefOr[Schema$PipelineDescription] = js.native
  /**
    * The ID of the Cloud Platform project that the job belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * If this job is an update of an existing job, this field is the job ID of
    * the job it replaced.  When sending a `CreateJobRequest`, you can update a
    * job by specifying it here. The job named here is stopped, and its
    * intermediate state is transferred to this job.
    */
  var replaceJobId: js.UndefOr[String] = js.native
  /**
    * If another job is an update of this job (and thus, this job is in
    * `JOB_STATE_UPDATED`), this field contains the ID of that job.
    */
  var replacedByJobId: js.UndefOr[String] = js.native
  /**
    * The job&#39;s requested state.  `UpdateJob` may be used to switch between
    * the `JOB_STATE_STOPPED` and `JOB_STATE_RUNNING` states, by setting
    * requested_state.  `UpdateJob` may also be used to directly set a
    * job&#39;s requested state to `JOB_STATE_CANCELLED` or `JOB_STATE_DONE`,
    * irrevocably terminating the job if it has not already reached a terminal
    * state.
    */
  var requestedState: js.UndefOr[String] = js.native
  /**
    * This field may be mutated by the Cloud Dataflow service; callers cannot
    * mutate it.
    */
  var stageStates: js.UndefOr[js.Array[Schema$ExecutionStageState]] = js.native
  /**
    * The timestamp when the job was started (transitioned to
    * JOB_STATE_PENDING). Flexible resource scheduling jobs are started with
    * some delay after job creation, so start_time is unset before start and is
    * updated when the job is started by the Cloud Dataflow service. For other
    * jobs, start_time always equals to create_time and is immutable and set by
    * the Cloud Dataflow service.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Exactly one of step or steps_location should be specified.  The top-level
    * steps that constitute the entire job.
    */
  var steps: js.UndefOr[js.Array[Schema$Step]] = js.native
  /**
    * The GCS location where the steps are stored.
    */
  var stepsLocation: js.UndefOr[String] = js.native
  /**
    * A set of files the system should be aware of that are used for temporary
    * storage. These temporary files will be removed on job completion. No
    * duplicates are allowed. No file patterns are supported.  The supported
    * files are:  Google Cloud Storage:
    * storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var tempFiles: js.UndefOr[js.Array[String]] = js.native
  /**
    * The map of transform name prefixes of the job to be replaced to the
    * corresponding name prefixes of the new job.
    */
  var transformNameMapping: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The type of Cloud Dataflow job.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Job {
  @scala.inline
  def apply(
    clientRequestId: String = null,
    createTime: String = null,
    createdFromSnapshotId: String = null,
    currentState: String = null,
    currentStateTime: String = null,
    environment: Schema$Environment = null,
    executionInfo: Schema$JobExecutionInfo = null,
    id: String = null,
    jobMetadata: Schema$JobMetadata = null,
    labels: StringDictionary[String] = null,
    location: String = null,
    name: String = null,
    pipelineDescription: Schema$PipelineDescription = null,
    projectId: String = null,
    replaceJobId: String = null,
    replacedByJobId: String = null,
    requestedState: String = null,
    stageStates: js.Array[Schema$ExecutionStageState] = null,
    startTime: String = null,
    steps: js.Array[Schema$Step] = null,
    stepsLocation: String = null,
    tempFiles: js.Array[String] = null,
    transformNameMapping: StringDictionary[String] = null,
    `type`: String = null
  ): Schema$Job = {
    val __obj = js.Dynamic.literal()
    if (clientRequestId != null) __obj.updateDynamic("clientRequestId")(clientRequestId.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (createdFromSnapshotId != null) __obj.updateDynamic("createdFromSnapshotId")(createdFromSnapshotId.asInstanceOf[js.Any])
    if (currentState != null) __obj.updateDynamic("currentState")(currentState.asInstanceOf[js.Any])
    if (currentStateTime != null) __obj.updateDynamic("currentStateTime")(currentStateTime.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (executionInfo != null) __obj.updateDynamic("executionInfo")(executionInfo.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (jobMetadata != null) __obj.updateDynamic("jobMetadata")(jobMetadata.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pipelineDescription != null) __obj.updateDynamic("pipelineDescription")(pipelineDescription.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (replaceJobId != null) __obj.updateDynamic("replaceJobId")(replaceJobId.asInstanceOf[js.Any])
    if (replacedByJobId != null) __obj.updateDynamic("replacedByJobId")(replacedByJobId.asInstanceOf[js.Any])
    if (requestedState != null) __obj.updateDynamic("requestedState")(requestedState.asInstanceOf[js.Any])
    if (stageStates != null) __obj.updateDynamic("stageStates")(stageStates.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (stepsLocation != null) __obj.updateDynamic("stepsLocation")(stepsLocation.asInstanceOf[js.Any])
    if (tempFiles != null) __obj.updateDynamic("tempFiles")(tempFiles.asInstanceOf[js.Any])
    if (transformNameMapping != null) __obj.updateDynamic("transformNameMapping")(transformNameMapping.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Job]
  }
}

