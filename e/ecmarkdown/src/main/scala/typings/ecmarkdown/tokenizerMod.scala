package typings.ecmarkdown

import typings.ecmarkdown.mod.Options
import typings.ecmarkdown.nodeTypesMod.CommentToken
import typings.ecmarkdown.nodeTypesMod.EOFToken
import typings.ecmarkdown.nodeTypesMod.FormatToken
import typings.ecmarkdown.nodeTypesMod.IdToken
import typings.ecmarkdown.nodeTypesMod.LinebreakToken
import typings.ecmarkdown.nodeTypesMod.OpaqueTagToken
import typings.ecmarkdown.nodeTypesMod.OrderedListToken
import typings.ecmarkdown.nodeTypesMod.ParabreakToken
import typings.ecmarkdown.nodeTypesMod.Position
import typings.ecmarkdown.nodeTypesMod.TagToken
import typings.ecmarkdown.nodeTypesMod.TextToken
import typings.ecmarkdown.nodeTypesMod.Token
import typings.ecmarkdown.nodeTypesMod.UnorderedListToken
import typings.ecmarkdown.nodeTypesMod.WhitespaceToken
import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkdown/dist/tokenizer", JSImport.Namespace)
@js.native
object tokenizerMod extends js.Object {
  @js.native
  class Tokenizer protected () extends js.Object {
    def this(str: String) = this()
    def this(str: String, options: Options) = this()
    var _eof: Boolean = js.native
    var _lookahead: js.Array[Token] = js.native
    var _newline: Boolean = js.native
    var _trackPositions: Boolean = js.native
    var column: Double = js.native
    var line: Double = js.native
    var pos: Double = js.native
    var previous: js.UndefOr[Token] = js.native
    var queue: js.Array[Token] = js.native
    var str: String = js.native
    def dequeue(): js.UndefOr[
        EOFToken | FormatToken | ParabreakToken | LinebreakToken | WhitespaceToken | TextToken | CommentToken | OpaqueTagToken | TagToken | UnorderedListToken | OrderedListToken
      ] = js.native
    def enqueue(tok: Token, pos: Position): Unit = js.native
    def enqueueLookahead(tok: Token, pos: Position): Unit = js.native
    def getLocation(): Position = js.native
    def locate(tok: IdToken, startPos: Position): Unit = js.native
    def locate(tok: Token, startPos: Position): Unit = js.native
    def matchToken(): Unit = js.native
    def next(): Token = js.native
    def peek(): Token = js.native
    def peek(dist: Double): Token = js.native
    def scanChars(): String = js.native
    def scanDigits(): String = js.native
    def scanEscape(): String = js.native
    def scanToEOL(): String = js.native
    def scanToEndTag(endTag: String): String = js.native
    def scanWhitespace(): String = js.native
    def tryScanComment(): js.UndefOr[String] = js.native
    def tryScanId(): IdToken | Null = js.native
    def tryScanTag(): js.UndefOr[RegExpMatchArray] = js.native
  }
  
}

