package typings.ecmarkup

import typings.ecmarkup.libFormatterLineBuilderMod.LineBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterTextMod {
  
  @JSImport("ecmarkup/lib/formatter/text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def printText(text: String, indent: Double): LineBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("printText")(text.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[LineBuilder]
}
