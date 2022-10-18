package typings.fastCsvParse

import typings.fastCsvParse.buildSrcParserOptionsMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcParserParserMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/Parser", "Parser")
  @js.native
  open class Parser protected () extends StObject {
    def this(parserOptions: ParserOptions) = this()
    
    def parse(line: String, hasMoreData: Boolean): ParseResult = js.native
    
    /* private */ var parseRow: Any = js.native
    
    /* private */ var parseWithComments: Any = js.native
    
    /* private */ var parseWithoutComments: Any = js.native
    
    /* private */ val parserOptions: Any = js.native
    
    /* private */ val rowParser: Any = js.native
  }
  /* static members */
  object Parser {
    
    @JSImport("@fast-csv/parse/build/src/parser/Parser", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser/Parser", "Parser.removeBOM")
    @js.native
    def removeBOM: Any = js.native
    inline def removeBOM_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeBOM")(x.asInstanceOf[js.Any])
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
      
      inline def setRowsVarargs(value: js.Array[String]*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
}
