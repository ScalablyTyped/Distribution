package typings.gatsbyCli

import typings.gatsbyCli.anon.Activitycurrent
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
import typings.gatsbyCli.typesMod.IPendingActivity
import typings.gatsbyCli.typesMod.ISetStatus
import typings.gatsbyCli.typesMod.IStartActivity
import typings.gatsbyCli.typesMod.IUpdateActivity
import typings.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "activityTick")
  @js.native
  def activityTick(hasIdIncrement: Increment): IUpdateActivity | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "createLog")
  @js.native
  def createLog(
    hasLevelTextStatusTextDurationGroupCodeTypeCategoryFilePathLocationDocsUrlContextActivity_currentActivity_totalActivity_typeActivity_uuidStackPluginName: Activitycurrent
  ): ICreateLog = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "createPendingActivity")
  @js.native
  def createPendingActivity(hasIdStatus: Id): js.Array[IPendingActivity | (js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit])] = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "endActivity")
  @js.native
  def endActivity(hasIdStatus: Status): (js.Array[
    ICreateLog | IEndActivity | ICancelActivity | (js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit])
  ]) | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "setActivityErrored")
  @js.native
  def setActivityErrored(hasId: IdString): IActivityErrored | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "setActivityStatusText")
  @js.native
  def setActivityStatusText(hasIdStatusText: IdStatusText): IUpdateActivity | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "setActivityTotal")
  @js.native
  def setActivityTotal(hasIdTotal: Total): IUpdateActivity | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "setStatus")
  @js.native
  def setStatus(status: ActivityStatuses): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "setStatus")
  @js.native
  def setStatus(status: ActivityStatuses, force: Boolean): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "setStatus")
  @js.native
  def setStatus(status: _empty): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "setStatus")
  @js.native
  def setStatus(status: _empty, force: Boolean): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "startActivity")
  @js.native
  def startActivity(hasIdTextTypeStatusCurrentTotal: Current): js.Array[IStartActivity | (js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit])] = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "updateActivity")
  @js.native
  def updateActivity(hasIdRest: StatusText): IUpdateActivity | Null = js.native
}
