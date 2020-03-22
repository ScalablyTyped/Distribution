package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.AnonCode
import typings.googleapis.AnonErrorsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Operation resource, used to manage asynchronous API requests. (==
  * resource_for v1.globalOperations ==) (== resource_for beta.globalOperations
  * ==) (== resource_for v1.regionOperations ==) (== resource_for
  * beta.regionOperations ==) (== resource_for v1.zoneOperations ==) (==
  * resource_for beta.zoneOperations ==)
  */
@js.native
trait SchemaOperation extends js.Object {
  /**
    * [Output Only] The value of `requestId` if you provided it in the request.
    * Not present otherwise.
    */
  var clientOperationId: js.UndefOr[String] = js.native
  /**
    * [Deprecated] This field is deprecated.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] A textual description of the operation, which is set when
    * the operation is created.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The time that this operation was completed. This value is
    * in RFC3339 text format.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * [Output Only] If errors are generated during processing of the operation,
    * this field will be populated.
    */
  var error: js.UndefOr[AnonErrorsArray] = js.native
  /**
    * [Output Only] If the operation fails, this field contains the HTTP error
    * message that was returned, such as NOT FOUND.
    */
  var httpErrorMessage: js.UndefOr[String] = js.native
  /**
    * [Output Only] If the operation fails, this field contains the HTTP error
    * status code that was returned. For example, a 404 means the resource was
    * not found.
    */
  var httpErrorStatusCode: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] The time that this operation was requested. This value is
    * in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#operation for
    * Operation resources.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] The type of operation, such as insert, update, or delete,
    * and so on.
    */
  var operationType: js.UndefOr[String] = js.native
  /**
    * [Output Only] An optional progress indicator that ranges from 0 to 100.
    * There is no requirement that this be linear or support any granularity of
    * operations. This should not be used to guess when the operation will be
    * complete. This number should monotonically increase as the operation
    * progresses.
    */
  var progress: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The URL of the region where the operation resides. Only
    * available when performing regional operations. You must specify this
    * field as part of the HTTP request URL. It is not settable as a field in
    * the request body.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * [Output Only] The time that this operation was started by the server.
    * This value is in RFC3339 text format.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * [Output Only] The status of the operation, which can be one of the
    * following: PENDING, RUNNING, or DONE.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * [Output Only] An optional textual description of the current status of
    * the operation.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique target ID, which identifies a specific
    * incarnation of the target resource.
    */
  var targetId: js.UndefOr[String] = js.native
  /**
    * [Output Only] The URL of the resource that the operation modifies. For
    * operations related to creating a snapshot, this points to the persistent
    * disk that the snapshot was created from.
    */
  var targetLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] User who requested the operation, for example:
    * user@example.com.
    */
  var user: js.UndefOr[String] = js.native
  /**
    * [Output Only] If warning messages are generated during processing of the
    * operation, this field will be populated.
    */
  var warnings: js.UndefOr[js.Array[AnonCode]] = js.native
  /**
    * [Output Only] The URL of the zone where the operation resides. Only
    * available when performing per-zone operations. You must specify this
    * field as part of the HTTP request URL. It is not settable as a field in
    * the request body.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaOperation {
  @scala.inline
  def apply(
    clientOperationId: String = null,
    creationTimestamp: String = null,
    description: String = null,
    endTime: String = null,
    error: AnonErrorsArray = null,
    httpErrorMessage: String = null,
    httpErrorStatusCode: Int | Double = null,
    id: String = null,
    insertTime: String = null,
    kind: String = null,
    name: String = null,
    operationType: String = null,
    progress: Int | Double = null,
    region: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    startTime: String = null,
    status: String = null,
    statusMessage: String = null,
    targetId: String = null,
    targetLink: String = null,
    user: String = null,
    warnings: js.Array[AnonCode] = null,
    zone: String = null
  ): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    if (clientOperationId != null) __obj.updateDynamic("clientOperationId")(clientOperationId.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (httpErrorMessage != null) __obj.updateDynamic("httpErrorMessage")(httpErrorMessage.asInstanceOf[js.Any])
    if (httpErrorStatusCode != null) __obj.updateDynamic("httpErrorStatusCode")(httpErrorStatusCode.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    if (targetLink != null) __obj.updateDynamic("targetLink")(targetLink.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperation]
  }
}

