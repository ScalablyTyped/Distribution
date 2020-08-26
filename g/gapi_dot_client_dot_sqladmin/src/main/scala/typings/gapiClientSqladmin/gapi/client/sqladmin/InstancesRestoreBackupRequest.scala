package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesRestoreBackupRequest extends js.Object {
  /** Parameters required to perform the restore backup operation. */
  var restoreBackupContext: js.UndefOr[RestoreBackupContext] = js.native
}

object InstancesRestoreBackupRequest {
  @scala.inline
  def apply(): InstancesRestoreBackupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesRestoreBackupRequest]
  }
  @scala.inline
  implicit class InstancesRestoreBackupRequestOps[Self <: InstancesRestoreBackupRequest] (val x: Self) extends AnyVal {
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
    def setRestoreBackupContext(value: RestoreBackupContext): Self = this.set("restoreBackupContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreBackupContext: Self = this.set("restoreBackupContext", js.undefined)
  }
  
}

