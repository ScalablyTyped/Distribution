package typings.gatsbyCli

import typings.gatsbyCli.typesMod.ActionsUnion
import typings.gatsbyCli.typesMod.IGatsbyCLIState
import typings.gatsbyCli.typesMod.ISetLogs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reducerMod {
  
  @JSImport("gatsby-cli/lib/reporter/redux/reducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def reducer(state: Unit, action: ActionsUnion): IGatsbyCLIState = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[IGatsbyCLIState]
  @scala.inline
  def reducer(state: Unit, action: ISetLogs): IGatsbyCLIState = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[IGatsbyCLIState]
  @scala.inline
  def reducer(state: IGatsbyCLIState, action: ActionsUnion): IGatsbyCLIState = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[IGatsbyCLIState]
  @scala.inline
  def reducer(state: IGatsbyCLIState, action: ISetLogs): IGatsbyCLIState = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[IGatsbyCLIState]
}
