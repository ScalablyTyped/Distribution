package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import typings.fastCsvParse.scannerMod.ScannerArgs
import typings.fastCsvParse.tokenMod.TokenArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fast-csv/parse/build/src/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  
  @js.native
  class ColumnParser protected ()
    extends typings.fastCsvParse.columnMod.ColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class NonQuotedColumnParser protected ()
    extends typings.fastCsvParse.columnMod.NonQuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class Parser protected ()
    extends typings.fastCsvParse.parserParserMod.Parser {
    def this(parserOptions: ParserOptions) = this()
  }
  /* static members */
  @js.native
  object Parser extends js.Object {
    
    var removeBOM: js.Any = js.native
  }
  
  @js.native
  class QuotedColumnParser protected ()
    extends typings.fastCsvParse.columnMod.QuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class RowParser protected ()
    extends typings.fastCsvParse.rowParserMod.RowParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class Scanner protected ()
    extends typings.fastCsvParse.scannerMod.Scanner {
    def this(args: ScannerArgs) = this()
  }
  
  @js.native
  class Token protected ()
    extends typings.fastCsvParse.tokenMod.Token {
    def this(tokenArgs: TokenArgs) = this()
  }
  /* static members */
  @js.native
  object Token extends js.Object {
    
    def isTokenCarriageReturn(token: typings.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    
    def isTokenComment(token: typings.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    
    def isTokenDelimiter(token: typings.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    
    def isTokenEscapeCharacter(token: typings.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    
    def isTokenQuote(token: typings.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    
    def isTokenRowDelimiter(token: typings.fastCsvParse.tokenMod.Token): Boolean = js.native
  }
}
