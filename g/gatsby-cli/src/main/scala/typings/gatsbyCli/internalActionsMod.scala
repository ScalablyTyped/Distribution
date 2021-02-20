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
import typings.gatsbyCli.typesMod.IActivityErrored
import typings.gatsbyCli.typesMod.ICancelActivity
import typings.gatsbyCli.typesMod.ICreateLog
import typings.gatsbyCli.typesMod.IEndActivity
import typings.gatsbyCli.typesMod.IGatsbyCLIState
import typings.gatsbyCli.typesMod.IPendingActivity
import typings.gatsbyCli.typesMod.ISetLogs
import typings.gatsbyCli.typesMod.ISetStatus
import typings.gatsbyCli.typesMod.IStartActivity
import typings.gatsbyCli.typesMod.IUpdateActivity
import typings.redux.mod.Dispatch
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalActionsMod {
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "activityTick")
  @js.native
  def activityTick(hasIdIncrement: Increment): IUpdateActivity | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "createLog")
  @js.native
  def createLog(
    hasLevelTextStatusTextDurationGroupCodeTypeCategoryFilePathLocationDocsUrlContextActivity_currentActivity_totalActivity_typeActivity_uuidStackPluginName: Activitytotal
  ): ICreateLog = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "createPendingActivity")
  @js.native
  def createPendingActivity(hasIdStatus: Id): ActionsToEmit = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "endActivity")
  @js.native
  def endActivity(hasIdStatus: Status): QueuedEndActivity | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "setActivityErrored")
  @js.native
  def setActivityErrored(hasId: IdString): IActivityErrored | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "setActivityStatusText")
  @js.native
  def setActivityStatusText(hasIdStatusText: IdStatusText): IUpdateActivity | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "setActivityTotal")
  @js.native
  def setActivityTotal(hasIdTotal: Total): IUpdateActivity | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "setLogs")
  @js.native
  def setLogs(logs: IGatsbyCLIState): ISetLogs = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "setStatus")
  @js.native
  def setStatus(status: ActivityStatuses): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "setStatus")
  @js.native
  def setStatus(status: ActivityStatuses, force: Boolean): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "setStatus")
  @js.native
  def setStatus(status: _empty): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "setStatus")
  @js.native
  def setStatus(status: _empty, force: Boolean): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "startActivity")
  @js.native
  def startActivity(hasIdTextTypeStatusCurrentTotal: Current): QueuedStartActivityActions = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "updateActivity")
  @js.native
  def updateActivity(hasIdRest: StatusText): IUpdateActivity | Null = js.native
  
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
