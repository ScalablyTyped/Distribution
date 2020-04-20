package typings.framesync.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncApi extends js.Object {
  var cancelSync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process): void}
    */ typings.framesync.framesyncStrings.SyncApi with TopLevel[js.Any]
  var steps: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: framesync.framesync/lib/types.Step}
    */ typings.framesync.framesyncStrings.SyncApi with TopLevel[js.Any]
  var sync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process, keepAlive? : boolean, immediate? : boolean): framesync.framesync/lib/types.Process}
    */ typings.framesync.framesyncStrings.SyncApi with TopLevel[js.Any]
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
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process, keepAlive? : boolean, immediate? : boolean): framesync.framesync/lib/types.Process}
    */ typings.framesync.framesyncStrings.SyncApi with TopLevel[js.Any]
  ): SyncApi = {
    val __obj = js.Dynamic.literal(cancelSync = cancelSync.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncApi]
  }
}

