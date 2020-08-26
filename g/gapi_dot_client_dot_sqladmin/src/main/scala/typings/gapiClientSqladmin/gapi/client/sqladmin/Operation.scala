package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation extends js.Object {
  /** The time this operation finished in UTC timezone in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var endTime: js.UndefOr[String] = js.native
  /** If errors occurred during processing of this operation, this field will be populated. */
  var error: js.UndefOr[OperationErrors] = js.native
  /** The context for export operation, if applicable. */
  var exportContext: js.UndefOr[ExportContext] = js.native
  /** The context for import operation, if applicable. */
  var importContext: js.UndefOr[ImportContext] = js.native
  /** The time this operation was enqueued in UTC timezone in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var insertTime: js.UndefOr[String] = js.native
  /** This is always sql#operation. */
  var kind: js.UndefOr[String] = js.native
  /**
    * An identifier that uniquely identifies the operation. You can use this identifier to retrieve the Operations resource that has information about the
    * operation.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of the operation. Valid values are CREATE, DELETE, UPDATE, RESTART, IMPORT, EXPORT, BACKUP_VOLUME, RESTORE_VOLUME, CREATE_USER, DELETE_USER,
    * CREATE_DATABASE, DELETE_DATABASE .
    */
  var operationType: js.UndefOr[String] = js.native
  /** The URI of this resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** The time this operation actually started in UTC timezone in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var startTime: js.UndefOr[String] = js.native
  /** The status of an operation. Valid values are PENDING, RUNNING, DONE, UNKNOWN. */
  var status: js.UndefOr[String] = js.native
  /** Name of the database instance related to this operation. */
  var targetId: js.UndefOr[String] = js.native
  var targetLink: js.UndefOr[String] = js.native
  /** The project ID of the target instance related to this operation. */
  var targetProject: js.UndefOr[String] = js.native
  /** The email address of the user who initiated this operation. */
  var user: js.UndefOr[String] = js.native
}

object Operation {
  @scala.inline
  def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setError(value: OperationErrors): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExportContext(value: ExportContext): Self = this.set("exportContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportContext: Self = this.set("exportContext", js.undefined)
    @scala.inline
    def setImportContext(value: ImportContext): Self = this.set("importContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportContext: Self = this.set("importContext", js.undefined)
    @scala.inline
    def setInsertTime(value: String): Self = this.set("insertTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertTime: Self = this.set("insertTime", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOperationType(value: String): Self = this.set("operationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTargetId(value: String): Self = this.set("targetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
    @scala.inline
    def setTargetLink(value: String): Self = this.set("targetLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetLink: Self = this.set("targetLink", js.undefined)
    @scala.inline
    def setTargetProject(value: String): Self = this.set("targetProject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetProject: Self = this.set("targetProject", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

