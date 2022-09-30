package typings.gatsbyCli

import typings.ink.textMod.Props
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/components/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLabel(text: String, color: String): FunctionComponent[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLabel")(text.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[Props]]
}
