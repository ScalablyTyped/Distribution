package typings.gatsbyCli.typesMod

import typings.gatsbyCli.anon.Duration
import typings.gatsbyCli.anon.IdString
import typings.gatsbyCli.anon.StartTime
import typings.gatsbyCli.anon.Type
import typings.gatsbyCli.anon.Uuid
import typings.gatsbyCli.constantsMod.Actions.ActivityErrored
import typings.gatsbyCli.constantsMod.Actions.CancelActivity
import typings.gatsbyCli.constantsMod.Actions.EndActivity
import typings.gatsbyCli.constantsMod.Actions.Log
import typings.gatsbyCli.constantsMod.Actions.PendingActivity
import typings.gatsbyCli.constantsMod.Actions.RenderPageTree
import typings.gatsbyCli.constantsMod.Actions.SetLogs
import typings.gatsbyCli.constantsMod.Actions.SetStatus
import typings.gatsbyCli.constantsMod.Actions.StartActivity
import typings.gatsbyCli.constantsMod.Actions.UpdateActivity
import typings.gatsbyCli.constantsMod.ActivityStatuses
import typings.gatsbyCli.gatsbyCliStrings._empty
import typings.gatsbyCli.reporterTypesMod.IRenderPageArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.gatsbyCli.typesMod.ICreateLog
  - typings.gatsbyCli.typesMod.ISetStatus
  - typings.gatsbyCli.typesMod.IEndActivity
  - typings.gatsbyCli.typesMod.IPendingActivity
  - typings.gatsbyCli.typesMod.IStartActivity
  - typings.gatsbyCli.typesMod.ICancelActivity
  - typings.gatsbyCli.typesMod.IUpdateActivity
  - typings.gatsbyCli.typesMod.IActivityErrored
  - typings.gatsbyCli.typesMod.ISetLogs
  - typings.gatsbyCli.typesMod.IRenderPageTree
*/
trait ActionsUnion extends StObject
object ActionsUnion {
  
  inline def IActivityErrored(payload: IdString, `type`: ActivityErrored): typings.gatsbyCli.typesMod.IActivityErrored = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.gatsbyCli.typesMod.IActivityErrored]
  }
  
  inline def ICancelActivity(payload: Duration, `type`: CancelActivity): typings.gatsbyCli.typesMod.ICancelActivity = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.gatsbyCli.typesMod.ICancelActivity]
  }
  
  inline def ICreateLog(payload: ILog, `type`: Log): typings.gatsbyCli.typesMod.ICreateLog = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.gatsbyCli.typesMod.ICreateLog]
  }
  
  inline def IEndActivity(payload: Type, `type`: EndActivity): typings.gatsbyCli.typesMod.IEndActivity = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.gatsbyCli.typesMod.IEndActivity]
  }
  
  inline def IPendingActivity(payload: StartTime, `type`: PendingActivity): typings.gatsbyCli.typesMod.IPendingActivity = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.gatsbyCli.typesMod.IPendingActivity]
  }
  
  inline def IRenderPageTree(payload: IRenderPageArgs, `type`: RenderPageTree): typings.gatsbyCli.typesMod.IRenderPageTree = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.gatsbyCli.typesMod.IRenderPageTree]
  }
  
  inline def ISetLogs(payload: IGatsbyCLIState, `type`: SetLogs): typings.gatsbyCli.typesMod.ISetLogs = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.gatsbyCli.typesMod.ISetLogs]
  }
  
  inline def ISetStatus(payload: ActivityStatuses | _empty, `type`: SetStatus): typings.gatsbyCli.typesMod.ISetStatus = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.gatsbyCli.typesMod.ISetStatus]
  }
  
  inline def IStartActivity(payload: IActivity, `type`: StartActivity): typings.gatsbyCli.typesMod.IStartActivity = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.gatsbyCli.typesMod.IStartActivity]
  }
  
  inline def IUpdateActivity(payload: Uuid, `type`: UpdateActivity): typings.gatsbyCli.typesMod.IUpdateActivity = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.gatsbyCli.typesMod.IUpdateActivity]
  }
}
