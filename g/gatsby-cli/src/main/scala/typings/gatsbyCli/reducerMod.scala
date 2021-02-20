package typings.gatsbyCli

import typings.gatsbyCli.typesMod.ActionsUnion
import typings.gatsbyCli.typesMod.IGatsbyCLIState
import typings.gatsbyCli.typesMod.ISetLogs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reducerMod {
  
  @JSImport("gatsby-cli/lib/reporter/redux/reducer", "reducer")
  @js.native
  def reducer(state: js.UndefOr[scala.Nothing], action: ActionsUnion): IGatsbyCLIState = js.native
  @JSImport("gatsby-cli/lib/reporter/redux/reducer", "reducer")
  @js.native
  def reducer(state: js.UndefOr[scala.Nothing], action: ISetLogs): IGatsbyCLIState = js.native
  @JSImport("gatsby-cli/lib/reporter/redux/reducer", "reducer")
  @js.native
  def reducer(state: IGatsbyCLIState, action: ActionsUnion): IGatsbyCLIState = js.native
  @JSImport("gatsby-cli/lib/reporter/redux/reducer", "reducer")
  @js.native
  def reducer(state: IGatsbyCLIState, action: ISetLogs): IGatsbyCLIState = js.native
}
