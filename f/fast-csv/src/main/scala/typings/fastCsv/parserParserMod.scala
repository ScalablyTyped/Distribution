package typings.fastCsv

import typings.fastCsv.parserOptionsMod.ParserOptions
import typings.fastCsv.parserParserParserMod.default
import typings.fastCsv.scannerMod.ScannerArgs
import typings.fastCsv.tokenMod.TokenArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/parser", JSImport.Namespace)
@js.native
object parserParserMod extends js.Object {
  @js.native
  class Parser protected () extends default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class RowParser protected ()
    extends typings.fastCsv.rowParserMod.default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class Scanner protected ()
    extends typings.fastCsv.scannerMod.Scanner {
    def this(args: ScannerArgs) = this()
  }
  
  @js.native
  class Token protected ()
    extends typings.fastCsv.tokenMod.Token {
    def this(tokenArgs: TokenArgs) = this()
  }
  
  /* static members */
  @js.native
  object Parser extends js.Object {
    var removeBOM: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Token extends js.Object {
    def isTokenCarriageReturn(token: typings.fastCsv.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenComment(token: typings.fastCsv.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenDelimiter(token: typings.fastCsv.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenEscapeCharacter(token: typings.fastCsv.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenQuote(token: typings.fastCsv.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenRowDelimiter(token: typings.fastCsv.tokenMod.Token): Boolean = js.native
  }
  
}

