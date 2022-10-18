package typings.ecmarkup

import typings.ecmarkup.anon.`5`
import typings.ecmarkup.libFormatterLineBuilderMod.LineBuilder
import typings.ecmarkup.libHeaderParserMod.ParsedHeaderOrFailure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterHeaderMod {
  
  @JSImport("ecmarkup/lib/formatter/header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def printHeader(parseResult: ParsedHeaderOrFailure & `5`, clauseType: String, indent: Double): LineBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("printHeader")(parseResult.asInstanceOf[js.Any], clauseType.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[LineBuilder]
  inline def printHeader(parseResult: ParsedHeaderOrFailure & `5`, clauseType: Null, indent: Double): LineBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("printHeader")(parseResult.asInstanceOf[js.Any], clauseType.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[LineBuilder]
}
