package typings.gatsbyCli.anon

import typings.gatsbyCli.constantsMod.ActivityStatuses
import typings.gatsbyCli.reporterTypesMod.IRenderPageArgs
import typings.gatsbyCli.typesMod.IActivityErrored
import typings.gatsbyCli.typesMod.ICancelActivity
import typings.gatsbyCli.typesMod.ICreateLog
import typings.gatsbyCli.typesMod.IEndActivity
import typings.gatsbyCli.typesMod.IPendingActivity
import typings.gatsbyCli.typesMod.IRenderPageTree
import typings.gatsbyCli.typesMod.ISetStatus
import typings.gatsbyCli.typesMod.IStartActivity
import typings.gatsbyCli.typesMod.IUpdateActivity
import typings.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofreporterActionsForT extends StObject {
  
  def activityTick(hasIdIncrement: Increment): IUpdateActivity | Null = js.native
  
  def createLog(
    hasLevelTextStatusTextDurationGroupCodeTypeCategoryFilePathLocationDocsUrlContextActivity_currentActivity_totalActivity_typeActivity_uuidStackPluginName: Activitycurrent
  ): ICreateLog = js.native
  
  def createPendingActivity(hasIdStatus: Id): js.Array[(js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IPendingActivity] = js.native
  
  def endActivity(hasIdStatus: Status): (js.Array[
    ICreateLog | (js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IEndActivity | ICancelActivity
  ]) | Null = js.native
  
  def renderPageTree(payload: IRenderPageArgs): IRenderPageTree = js.native
  
  def setActivityErrored(hasId: IdString): IActivityErrored | Null = js.native
  
  def setActivityStatusText(hasIdStatusText: IdStatusText): IUpdateActivity | Null = js.native
  
  def setActivityTotal(hasIdTotal: Total): IUpdateActivity | Null = js.native
  
  def setStatus(status: ActivityStatuses): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  def setStatus(status: ActivityStatuses, force: Boolean): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  def setStatus(status: typings.gatsbyCli.gatsbyCliStrings._empty): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  def setStatus(status: typings.gatsbyCli.gatsbyCliStrings._empty, force: Boolean): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  
  def startActivity(hasIdTextTypeStatusCurrentTotal: Current): js.Array[(js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IStartActivity] = js.native
  
  def updateActivity(hasIdRest: StatusText): IUpdateActivity | Null = js.native
}
