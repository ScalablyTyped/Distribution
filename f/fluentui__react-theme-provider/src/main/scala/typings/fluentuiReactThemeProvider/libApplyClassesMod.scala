package typings.fluentuiReactThemeProvider

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApplyClassesMod {
  
  @JSImport("@fluentui/react-theme-provider/lib/applyClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyClasses[TState /* <: js.Object */](state: TState, classMap: Record[String, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyClasses")(state.asInstanceOf[js.Any], classMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
