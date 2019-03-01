package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  /** The time this operation finished in UTC timezone in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** If errors occurred during processing of this operation, this field will be populated. */
  var error: js.UndefOr[OperationErrors] = js.undefined
  /** The context for export operation, if applicable. */
  var exportContext: js.UndefOr[ExportContext] = js.undefined
  /** The context for import operation, if applicable. */
  var importContext: js.UndefOr[ImportContext] = js.undefined
  /** The time this operation was enqueued in UTC timezone in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var insertTime: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#operation. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An identifier that uniquely identifies the operation. You can use this identifier to retrieve the Operations resource that has information about the
    * operation.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the operation. Valid values are CREATE, DELETE, UPDATE, RESTART, IMPORT, EXPORT, BACKUP_VOLUME, RESTORE_VOLUME, CREATE_USER, DELETE_USER,
    * CREATE_DATABASE, DELETE_DATABASE .
    */
  var operationType: js.UndefOr[java.lang.String] = js.undefined
  /** The URI of this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The time this operation actually started in UTC timezone in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** The status of an operation. Valid values are PENDING, RUNNING, DONE, UNKNOWN. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the database instance related to this operation. */
  var targetId: js.UndefOr[java.lang.String] = js.undefined
  var targetLink: js.UndefOr[java.lang.String] = js.undefined
  /** The project ID of the target instance related to this operation. */
  var targetProject: js.UndefOr[java.lang.String] = js.undefined
  /** The email address of the user who initiated this operation. */
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object Operation {
  @scala.inline
  def apply(
    endTime: java.lang.String = null,
    error: OperationErrors = null,
    exportContext: ExportContext = null,
    importContext: ImportContext = null,
    insertTime: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    operationType: java.lang.String = null,
    selfLink: java.lang.String = null,
    startTime: java.lang.String = null,
    status: java.lang.String = null,
    targetId: java.lang.String = null,
    targetLink: java.lang.String = null,
    targetProject: java.lang.String = null,
    user: java.lang.String = null
  ): Operation = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (error != null) __obj.updateDynamic("error")(error)
    if (exportContext != null) __obj.updateDynamic("exportContext")(exportContext)
    if (importContext != null) __obj.updateDynamic("importContext")(importContext)
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (operationType != null) __obj.updateDynamic("operationType")(operationType)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (status != null) __obj.updateDynamic("status")(status)
    if (targetId != null) __obj.updateDynamic("targetId")(targetId)
    if (targetLink != null) __obj.updateDynamic("targetLink")(targetLink)
    if (targetProject != null) __obj.updateDynamic("targetProject")(targetProject)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Operation]
  }
}

