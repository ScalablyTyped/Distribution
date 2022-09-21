package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import typings.fastCsvParse.scannerMod.ScannerArgs
import typings.fastCsvParse.tokenMod.TokenArgs
import typings.fastCsvParse.typesMod.RowArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("@fast-csv/parse/build/src/parser", "ColumnParser")
  @js.native
  open class ColumnParser protected ()
    extends typings.fastCsvParse.columnMod.ColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "NonQuotedColumnParser")
  @js.native
  open class NonQuotedColumnParser protected ()
    extends typings.fastCsvParse.columnMod.NonQuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "Parser")
  @js.native
  open class Parser protected ()
    extends typings.fastCsvParse.parserParserMod.Parser {
    def this(parserOptions: ParserOptions) = this()
  }
  /* static members */
  object Parser {
    
    @JSImport("@fast-csv/parse/build/src/parser", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser", "Parser.removeBOM")
    @js.native
    def removeBOM: Any = js.native
    inline def removeBOM_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeBOM")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "QuotedColumnParser")
  @js.native
  open class QuotedColumnParser protected ()
    extends typings.fastCsvParse.columnMod.QuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "RowParser")
  @js.native
  open class RowParser protected ()
    extends typings.fastCsvParse.rowParserMod.RowParser {
    def this(parserOptions: ParserOptions) = this()
  }
  /* static members */
  object RowParser {
    
    @JSImport("@fast-csv/parse/build/src/parser", "RowParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isEmptyRow(row: RowArray[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyRow")(row.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "Scanner")
  @js.native
  open class Scanner protected ()
    extends typings.fastCsvParse.scannerMod.Scanner {
    def this(args: ScannerArgs) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "Token")
  @js.native
  open class Token protected ()
    extends typings.fastCsvParse.tokenMod.Token {
    def this(tokenArgs: TokenArgs) = this()
  }
  /* static members */
  object Token {
    
    @JSImport("@fast-csv/parse/build/src/parser", "Token")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isTokenCarriageReturn(token: typings.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTokenCarriageReturn")(token.asInstanceOf[js.Any], parserOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTokenComment(token: typings.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTokenComment")(token.asInstanceOf[js.Any], parserOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTokenDelimiter(token: typings.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTokenDelimiter")(token.asInstanceOf[js.Any], parserOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTokenEscapeCharacter(token: typings.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTokenEscapeCharacter")(token.asInstanceOf[js.Any], parserOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTokenQuote(token: typings.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTokenQuote")(token.asInstanceOf[js.Any], parserOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTokenRowDelimiter(token: typings.fastCsvParse.tokenMod.Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenRowDelimiter")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
