package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserParserMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/Parser", "Parser")
  @js.native
  class Parser protected () extends StObject {
    def this(parserOptions: ParserOptions) = this()
    
    def parse(line: String, hasMoreData: Boolean): ParseResult = js.native
    
    /* private */ var parseRow: js.Any = js.native
    
    /* private */ var parseWithComments: js.Any = js.native
    
    /* private */ var parseWithoutComments: js.Any = js.native
    
    /* private */ val parserOptions: js.Any = js.native
    
    /* private */ val rowParser: js.Any = js.native
  }
  /* static members */
  object Parser {
    
    @JSImport("@fast-csv/parse/build/src/parser/Parser", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser/Parser", "Parser.removeBOM")
    @js.native
    def removeBOM: js.Any = js.native
    inline def removeBOM_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeBOM")(x.asInstanceOf[js.Any])
  }
  
  trait ParseResult extends StObject {
    
    var line: String
    
    var rows: js.Array[js.Array[String]]
  }
  object ParseResult {
    
    inline def apply(line: String, rows: js.Array[js.Array[String]]): ParseResult = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResult]
    }
    
    extension [Self <: ParseResult](x: Self) {
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setRows(value: js.Array[js.Array[String]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: js.Array[String]*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
}
