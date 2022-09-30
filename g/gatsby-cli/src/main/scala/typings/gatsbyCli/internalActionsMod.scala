package typings.gatsbyCli

import typings.gatsbyCli.anon.Activitytotal
import typings.gatsbyCli.anon.Current
import typings.gatsbyCli.anon.Id
import typings.gatsbyCli.anon.IdStatusText
import typings.gatsbyCli.anon.IdString
import typings.gatsbyCli.anon.Increment
import typings.gatsbyCli.anon.Status
import typings.gatsbyCli.anon.StatusText
import typings.gatsbyCli.anon.Total
import typings.gatsbyCli.constantsMod.ActivityStatuses
import typings.gatsbyCli.gatsbyCliStrings._empty
import typings.gatsbyCli.reporterTypesMod.IRenderPageArgs
import typings.gatsbyCli.typesMod.IActivityErrored
import typings.gatsbyCli.typesMod.ICancelActivity
import typings.gatsbyCli.typesMod.ICreateLog
import typings.gatsbyCli.typesMod.IEndActivity
import typings.gatsbyCli.typesMod.IGatsbyCLIState
import typings.gatsbyCli.typesMod.IPendingActivity
import typings.gatsbyCli.typesMod.IRenderPageTree
import typings.gatsbyCli.typesMod.ISetLogs
import typings.gatsbyCli.typesMod.ISetStatus
import typings.gatsbyCli.typesMod.IStartActivity
import typings.gatsbyCli.typesMod.IUpdateActivity
import typings.redux.mod.Dispatch
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalActionsMod {
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def activityTick(hasIdIncrement: Increment): IUpdateActivity | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("activityTick")(hasIdIncrement.asInstanceOf[js.Any]).asInstanceOf[IUpdateActivity | Null]
  
  inline def createLog(
    hasLevelTextStatusTextDurationGroupCodeTypeCategoryFilePathLocationDocsUrlContextActivity_currentActivity_totalActivity_typeActivity_uuidStackPluginName: Activitytotal
  ): ICreateLog = ^.asInstanceOf[js.Dynamic].applyDynamic("createLog")(hasLevelTextStatusTextDurationGroupCodeTypeCategoryFilePathLocationDocsUrlContextActivity_currentActivity_totalActivity_typeActivity_uuidStackPluginName.asInstanceOf[js.Any]).asInstanceOf[ICreateLog]
  
  inline def createPendingActivity(hasIdStatus: Id): ActionsToEmit = ^.asInstanceOf[js.Dynamic].applyDynamic("createPendingActivity")(hasIdStatus.asInstanceOf[js.Any]).asInstanceOf[ActionsToEmit]
  
  inline def endActivity(hasIdStatus: Status): QueuedEndActivity | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("endActivity")(hasIdStatus.asInstanceOf[js.Any]).asInstanceOf[QueuedEndActivity | Null]
  
  inline def renderPageTree(payload: IRenderPageArgs): IRenderPageTree = ^.asInstanceOf[js.Dynamic].applyDynamic("renderPageTree")(payload.asInstanceOf[js.Any]).asInstanceOf[IRenderPageTree]
  
  inline def setActivityErrored(hasId: IdString): IActivityErrored | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("setActivityErrored")(hasId.asInstanceOf[js.Any]).asInstanceOf[IActivityErrored | Null]
  
  inline def setActivityStatusText(hasIdStatusText: IdStatusText): IUpdateActivity | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("setActivityStatusText")(hasIdStatusText.asInstanceOf[js.Any]).asInstanceOf[IUpdateActivity | Null]
  
  inline def setActivityTotal(hasIdTotal: Total): IUpdateActivity | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("setActivityTotal")(hasIdTotal.asInstanceOf[js.Any]).asInstanceOf[IUpdateActivity | Null]
  
  inline def setLogs(logs: IGatsbyCLIState): ISetLogs = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogs")(logs.asInstanceOf[js.Any]).asInstanceOf[ISetLogs]
  
  inline def setStatus(status: ActivityStatuses): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setStatus")(status.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]]
  inline def setStatus(status: ActivityStatuses, force: Boolean): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatus")(status.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]]
  inline def setStatus(status: _empty): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setStatus")(status.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]]
  inline def setStatus(status: _empty, force: Boolean): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatus")(status.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]]
  
  inline def startActivity(hasIdTextTypeStatusCurrentTotal: Current): QueuedStartActivityActions = ^.asInstanceOf[js.Dynamic].applyDynamic("startActivity")(hasIdTextTypeStatusCurrentTotal.asInstanceOf[js.Any]).asInstanceOf[QueuedStartActivityActions]
  
  inline def updateActivity(hasIdRest: StatusText): IUpdateActivity | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("updateActivity")(hasIdRest.asInstanceOf[js.Any]).asInstanceOf[IUpdateActivity | Null]
  
  type ActionsToEmit = js.Array[
    IPendingActivity | (ReturnType[
      js.Function2[
        /* status */ ActivityStatuses | _empty, 
        /* force */ js.UndefOr[Boolean], 
        js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]
      ]
    ])
  ]
  
  type QueuedEndActivity = js.Array[
    ICancelActivity | IEndActivity | ICreateLog | (ReturnType[
      js.Function2[
        /* status */ ActivityStatuses | _empty, 
        /* force */ js.UndefOr[Boolean], 
        js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]
      ]
    ])
  ]
  
  type QueuedStartActivityActions = js.Array[
    IStartActivity | (ReturnType[
      js.Function2[
        /* status */ ActivityStatuses | _empty, 
        /* force */ js.UndefOr[Boolean], 
        js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]
      ]
    ])
  ]
}
