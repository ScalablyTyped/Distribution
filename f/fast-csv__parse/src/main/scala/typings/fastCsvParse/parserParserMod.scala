package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserParserMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/Parser", "Parser")
  @js.native
  class Parser protected () extends StObject {
    def this(parserOptions: ParserOptions) = this()
    
    def parse(line: String, hasMoreData: Boolean): ParseResult = js.native
    
    var parseRow: js.Any = js.native
    
    var parseWithComments: js.Any = js.native
    
    var parseWithoutComments: js.Any = js.native
    
    val parserOptions: js.Any = js.native
    
    val rowParser: js.Any = js.native
  }
  /* static members */
  object Parser {
    
    @JSImport("@fast-csv/parse/build/src/parser/Parser", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser/Parser", "Parser.removeBOM")
    @js.native
    def removeBOM: js.Any = js.native
    @scala.inline
    def removeBOM_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeBOM")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ParseResult extends StObject {
    
    var line: String = js.native
    
    var rows: js.Array[js.Array[String]] = js.native
  }
  object ParseResult {
    
    @scala.inline
    def apply(line: String, rows: js.Array[js.Array[String]]): ParseResult = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResult]
    }
    
    @scala.inline
    implicit class ParseResultMutableBuilder[Self <: ParseResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows(value: js.Array[js.Array[String]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsVarargs(value: js.Array[String]*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
}
