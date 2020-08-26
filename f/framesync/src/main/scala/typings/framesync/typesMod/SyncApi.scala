package typings.framesync.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncApi extends js.Object {
  var cancelSync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process): void}
    */ typings.framesync.framesyncStrings.SyncApi with TopLevel[js.Any] = js.native
  var steps: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: framesync.framesync/lib/types.Step}
    */ typings.framesync.framesyncStrings.SyncApi with TopLevel[js.Any] = js.native
  var sync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process, keepAlive : boolean | undefined, immediate : boolean | undefined): framesync.framesync/lib/types.Process}
    */ typings.framesync.framesyncStrings.SyncApi with TopLevel[js.Any] = js.native
}

object SyncApi {
  @scala.inline
  def apply(
    cancelSync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process): void}
    */ typings.framesync.framesyncStrings.SyncApi with TopLevel[js.Any],
    steps: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: framesync.framesync/lib/types.Step}
    */ typings.framesync.framesyncStrings.SyncApi with TopLevel[js.Any],
    sync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process, keepAlive : boolean | undefined, immediate : boolean | undefined): framesync.framesync/lib/types.Process}
    */ typings.framesync.framesyncStrings.SyncApi with TopLevel[js.Any]
  ): SyncApi = {
    val __obj = js.Dynamic.literal(cancelSync = cancelSync.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncApi]
  }
  @scala.inline
  implicit class SyncApiOps[Self <: SyncApi] (val x: Self) extends AnyVal {
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
    def setCancelSync(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process): void}
      */ typings.framesync.framesyncStrings.SyncApi with TopLevel[js.Any]
    ): Self = this.set("cancelSync", value.asInstanceOf[js.Any])
    @scala.inline
    def setSteps(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in framesync.framesync/lib/types.StepId ]: framesync.framesync/lib/types.Step}
      */ typings.framesync.framesyncStrings.SyncApi with TopLevel[js.Any]
    ): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def setSync(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process, keepAlive : boolean | undefined, immediate : boolean | undefined): framesync.framesync/lib/types.Process}
      */ typings.framesync.framesyncStrings.SyncApi with TopLevel[js.Any]
    ): Self = this.set("sync", value.asInstanceOf[js.Any])
  }
  
}

