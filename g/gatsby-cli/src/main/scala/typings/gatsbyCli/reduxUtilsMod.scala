package typings.gatsbyCli

import typings.gatsbyCli.constantsMod.ActivityStatuses
import typings.gatsbyCli.typesMod.ActionsUnion
import typings.gatsbyCli.typesMod.IActivity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxUtilsMod {
  
  @JSImport("gatsby-cli/lib/reporter/redux/utils", "delayedCall")
  @js.native
  def delayedCall(fn: js.Function0[Unit], timeout: Double): js.Function0[Unit] = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/utils", "getActivity")
  @js.native
  def getActivity(id: String): IActivity | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/utils", "getElapsedTimeMS")
  @js.native
  def getElapsedTimeMS(activity: IActivity): Double = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/utils", "getGlobalStatus")
  @js.native
  def getGlobalStatus(id: String, status: ActivityStatuses): ActivityStatuses = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/utils", "isActivityInProgress")
  @js.native
  def isActivityInProgress(activityStatus: ActivityStatuses): Boolean = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/utils", "isInternalAction")
  @js.native
  def isInternalAction(action: ActionsUnion): Boolean = js.native
}
