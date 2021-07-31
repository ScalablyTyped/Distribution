package typings.gatsbyCli

import typings.gatsbyCli.constantsMod.ActivityStatuses
import typings.gatsbyCli.typesMod.ActionsUnion
import typings.gatsbyCli.typesMod.IActivity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxUtilsMod {
  
  @JSImport("gatsby-cli/lib/reporter/redux/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def delayedCall(fn: js.Function0[Unit], timeout: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def getActivity(id: String): IActivity | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActivity")(id.asInstanceOf[js.Any]).asInstanceOf[IActivity | Null]
  
  @scala.inline
  def getElapsedTimeMS(activity: IActivity): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getElapsedTimeMS")(activity.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getGlobalStatus(id: String, status: ActivityStatuses): ActivityStatuses = (^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalStatus")(id.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[ActivityStatuses]
  
  @scala.inline
  def isActivityInProgress(activityStatus: ActivityStatuses): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActivityInProgress")(activityStatus.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isInternalAction(action: ActionsUnion): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInternalAction")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
