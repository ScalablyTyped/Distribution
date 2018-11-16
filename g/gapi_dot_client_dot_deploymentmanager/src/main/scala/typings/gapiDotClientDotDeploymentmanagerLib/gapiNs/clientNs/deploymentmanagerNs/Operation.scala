package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Operation extends js.Object {
  /** [Output Only] Reserved for future use. */
  var clientOperationId: js.UndefOr[java.lang.String] = js.undefined
  /** [Deprecated] This field is deprecated. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] A textual description of the operation, which is set when the operation is created. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The time that this operation was completed. This value is in RFC3339 text format. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] If errors are generated during processing of the operation, this field will be populated. */
  var error: js.UndefOr[gapiDotClientDotDeploymentmanagerLib.Anon_Errors] = js.undefined
  /** [Output Only] If the operation fails, this field contains the HTTP error message that was returned, such as NOT FOUND. */
  var httpErrorMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
               * [Output Only] If the operation fails, this field contains the HTTP error status code that was returned. For example, a 404 means the resource was not
               * found.
               */
  var httpErrorStatusCode: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The time that this operation was requested. This value is in RFC3339 text format. */
  var insertTime: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#operation for Operation resources. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Name of the resource. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The type of operation, such as insert, update, or delete, and so on. */
  var operationType: js.UndefOr[java.lang.String] = js.undefined
  /**
               * [Output Only] An optional progress indicator that ranges from 0 to 100. There is no requirement that this be linear or support any granularity of
               * operations. This should not be used to guess when the operation will be complete. This number should monotonically increase as the operation
               * progresses.
               */
  var progress: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] The URL of the region where the operation resides. Only available when performing regional operations. */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The time that this operation was started by the server. This value is in RFC3339 text format. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The status of the operation, which can be one of the following: PENDING, RUNNING, or DONE. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] An optional textual description of the current status of the operation. */
  var statusMessage: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The unique target ID, which identifies a specific incarnation of the target resource. */
  var targetId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * [Output Only] The URL of the resource that the operation modifies. For operations related to creating a snapshot, this points to the persistent disk
               * that the snapshot was created from.
               */
  var targetLink: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] User who requested the operation, for example: user@example.com. */
  var user: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] If warning messages are generated during processing of the operation, this field will be populated. */
  var warnings: js.UndefOr[js.Array[gapiDotClientDotDeploymentmanagerLib.Anon_Data]] = js.undefined
  /** [Output Only] The URL of the zone where the operation resides. Only available when performing per-zone operations. */
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

