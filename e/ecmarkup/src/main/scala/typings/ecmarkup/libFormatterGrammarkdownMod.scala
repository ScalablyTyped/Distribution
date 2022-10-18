package typings.ecmarkup

import typings.ecmarkup.libFormatterLineBuilderMod.LineBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterGrammarkdownMod {
  
  @JSImport("ecmarkup/lib/formatter/grammarkdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def printGrammar(source: String, indent: Double): js.Promise[LineBuilder] = (^.asInstanceOf[js.Dynamic].applyDynamic("printGrammar")(source.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LineBuilder]]
}
