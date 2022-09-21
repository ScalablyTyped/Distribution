package typings.formatjsIcuMessageformatParser

import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.DateTimeSkeleton
import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.MessageFormatElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatjsIcuMessageformatParserPrinterMod {
  
  @JSImport("@formatjs/icu-messageformat-parser/printer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def doPrintAST(ast: js.Array[MessageFormatElement], isInPlural: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("doPrintAST")(ast.asInstanceOf[js.Any], isInPlural.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def printAST(ast: js.Array[MessageFormatElement]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printAST")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def printDateTimeSkeleton(style: DateTimeSkeleton): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printDateTimeSkeleton")(style.asInstanceOf[js.Any]).asInstanceOf[String]
}
