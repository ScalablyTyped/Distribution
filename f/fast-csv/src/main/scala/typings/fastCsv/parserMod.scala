package typings.fastCsv

import typings.fastCsv.csvParserStreamMod.default
import typings.fastCsv.parserOptionsMod.ParserOptionsArgs
import typings.fastCsv.parserTypesMod.RowTransformFunction
import typings.fastCsv.parserTypesMod.RowValidate
import typings.fastCsv.scannerMod.ScannerArgs
import typings.fastCsv.tokenMod.TokenArgs
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  @js.native
  class CsvParserStream protected () extends default {
    def this(parserOptions: typings.fastCsv.parserOptionsMod.ParserOptions) = this()
  }
  
  @js.native
  class HeaderTransformer protected ()
    extends typings.fastCsv.transformsMod.HeaderTransformer {
    def this(parserOptions: typings.fastCsv.parserOptionsMod.ParserOptions) = this()
  }
  
  @js.native
  class Parser protected ()
    extends typings.fastCsv.parserParserMod.Parser {
    def this(parserOptions: typings.fastCsv.parserOptionsMod.ParserOptions) = this()
  }
  
  @js.native
  class ParserOptions ()
    extends typings.fastCsv.parserOptionsMod.ParserOptions {
    def this(opts: ParserOptionsArgs) = this()
  }
  
  @js.native
  class RowParser protected ()
    extends typings.fastCsv.parserParserMod.RowParser {
    def this(parserOptions: typings.fastCsv.parserOptionsMod.ParserOptions) = this()
  }
  
  @js.native
  class RowTransformerValidator ()
    extends typings.fastCsv.transformsMod.RowTransformerValidator
  
  @js.native
  class Scanner protected ()
    extends typings.fastCsv.parserParserMod.Scanner {
    def this(args: ScannerArgs) = this()
  }
  
  @js.native
  class Token protected ()
    extends typings.fastCsv.parserParserMod.Token {
    def this(tokenArgs: TokenArgs) = this()
  }
  
  def isSyncTransform(transform: RowTransformFunction): /* is fast-csv.fast-csv/build/src/parser/types.SyncRowTransform */ Boolean = js.native
  def isSyncValidate(validate: RowValidate): /* is fast-csv.fast-csv/build/src/parser/types.SyncRowValidate */ Boolean = js.native
  def parse(): default = js.native
  def parse(args: ParserOptionsArgs): default = js.native
  def parseFile(location: String): default = js.native
  def parseFile(location: String, options: ParserOptionsArgs): default = js.native
  def parseStream(stream: ReadableStream): default = js.native
  def parseStream(stream: ReadableStream, options: ParserOptionsArgs): default = js.native
  def parseString(string: String): default = js.native
  def parseString(string: String, options: ParserOptionsArgs): default = js.native
  /* static members */
  @js.native
  object Parser extends js.Object {
    var removeBOM: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object RowTransformerValidator extends js.Object {
    var createTransform: js.Any = js.native
    var createValidator: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Token extends js.Object {
    def isTokenCarriageReturn(
      token: typings.fastCsv.tokenMod.Token,
      parserOptions: typings.fastCsv.parserOptionsMod.ParserOptions
    ): Boolean = js.native
    def isTokenComment(
      token: typings.fastCsv.tokenMod.Token,
      parserOptions: typings.fastCsv.parserOptionsMod.ParserOptions
    ): Boolean = js.native
    def isTokenDelimiter(
      token: typings.fastCsv.tokenMod.Token,
      parserOptions: typings.fastCsv.parserOptionsMod.ParserOptions
    ): Boolean = js.native
    def isTokenEscapeCharacter(
      token: typings.fastCsv.tokenMod.Token,
      parserOptions: typings.fastCsv.parserOptionsMod.ParserOptions
    ): Boolean = js.native
    def isTokenQuote(
      token: typings.fastCsv.tokenMod.Token,
      parserOptions: typings.fastCsv.parserOptionsMod.ParserOptions
    ): Boolean = js.native
    def isTokenRowDelimiter(token: typings.fastCsv.tokenMod.Token): Boolean = js.native
  }
  
}

