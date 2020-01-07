package typings.googleapis.buildSrcApisGenomicsV2alpha1Mod.genomics_v2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata describing an Operation.
  */
@js.native
trait Schema$OperationMetadata extends js.Object {
  /**
    * This field is deprecated. Use `labels` instead. Optionally provided by
    * the caller when submitting the request that creates the operation.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * The time at which the job was submitted to the Genomics service.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The time at which the job stopped running.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Optional event messages that were generated during the job&#39;s
    * execution. This also contains any warnings that were generated during
    * import or export.
    */
  var events: js.UndefOr[js.Array[Schema$OperationEvent]] = js.native
  /**
    * Optionally provided by the caller when submitting the request that
    * creates the operation.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The Google Cloud Project in which the job is scoped.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The original request that started the operation. Note that this will be
    * in current version of the API. If the operation was started with v1beta2
    * API and a GetOperation is performed on v1 API, a v1 request will be
    * returned.
    */
  var request: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Runtime metadata on this Operation.
    */
  var runtimeMetadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The time at which the job began to run.
    */
  var startTime: js.UndefOr[String] = js.native
}

object Schema$OperationMetadata {
  @scala.inline
  def apply(
    clientId: String = null,
    createTime: String = null,
    endTime: String = null,
    events: js.Array[Schema$OperationEvent] = null,
    labels: StringDictionary[String] = null,
    projectId: String = null,
    request: StringDictionary[js.Any] = null,
    runtimeMetadata: StringDictionary[js.Any] = null,
    startTime: String = null
  ): Schema$OperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (runtimeMetadata != null) __obj.updateDynamic("runtimeMetadata")(runtimeMetadata.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperationMetadata]
  }
}

