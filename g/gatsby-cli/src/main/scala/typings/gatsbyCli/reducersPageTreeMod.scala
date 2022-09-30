package typings.gatsbyCli

import typings.gatsbyCli.reporterTypesMod.IRenderPageArgs
import typings.gatsbyCli.typesMod.ActionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reducersPageTreeMod {
  
  @JSImport("gatsby-cli/lib/reporter/redux/reducers/page-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reducer(state: Null, action: ActionsUnion): IRenderPageArgs | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[IRenderPageArgs | Null]
  inline def reducer(state: Unit, action: ActionsUnion): IRenderPageArgs | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[IRenderPageArgs | Null]
  inline def reducer(state: IRenderPageArgs, action: ActionsUnion): IRenderPageArgs | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[IRenderPageArgs | Null]
}
