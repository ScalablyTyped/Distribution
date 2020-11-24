package typings.ecmarkdown

import typings.ecmarkdown.ecmarkdownStrings.EOF
import typings.ecmarkdown.ecmarkdownStrings.comment
import typings.ecmarkdown.ecmarkdownStrings.linebreak
import typings.ecmarkdown.ecmarkdownStrings.ol
import typings.ecmarkdown.ecmarkdownStrings.opaqueTag
import typings.ecmarkdown.ecmarkdownStrings.parabreak
import typings.ecmarkdown.ecmarkdownStrings.tag
import typings.ecmarkdown.ecmarkdownStrings.text
import typings.ecmarkdown.ecmarkdownStrings.ul
import typings.ecmarkdown.ecmarkdownStrings.whitespace
import typings.ecmarkdown.nodeTypesMod.CommentToken
import typings.ecmarkdown.nodeTypesMod.EOFToken
import typings.ecmarkdown.nodeTypesMod.Format
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
import typings.ecmarkdown.nodeTypesMod.Unlocated
import typings.ecmarkdown.nodeTypesMod.UnorderedListToken
import typings.ecmarkdown.nodeTypesMod.WhitespaceToken
import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkdown/dist/tokenizer", JSImport.Namespace)
@js.native
object tokenizerMod extends js.Object {
  
  @js.native
  class Tokenizer protected () extends js.Object {
    def this(str: String) = this()
    
    var _eof: Boolean = js.native
    
    var _lookahead: js.Array[Token] = js.native
    
    var _newline: Boolean = js.native
    
    var column: Double = js.native
    
    def dequeue(): js.UndefOr[
        EOFToken | FormatToken | ParabreakToken | LinebreakToken | WhitespaceToken | TextToken | CommentToken | OpaqueTagToken | TagToken | UnorderedListToken | OrderedListToken
      ] = js.native
    
    def enqueue(tok: Unlocated[Token], pos: Position): Unit = js.native
    
    def enqueueLookahead(tok: Unlocated[Token], pos: Position): Unit = js.native
    
    def expect(name: Format): Unit = js.native
    @JSName("expect")
    def expect_EOF(name: EOF): Unit = js.native
    @JSName("expect")
    def expect_comment(name: comment): Unit = js.native
    @JSName("expect")
    def expect_linebreak(name: linebreak): Unit = js.native
    @JSName("expect")
    def expect_ol(name: ol): Unit = js.native
    @JSName("expect")
    def expect_opaqueTag(name: opaqueTag): Unit = js.native
    @JSName("expect")
    def expect_parabreak(name: parabreak): Unit = js.native
    @JSName("expect")
    def expect_tag(name: tag): Unit = js.native
    @JSName("expect")
    def expect_text(name: text): Unit = js.native
    @JSName("expect")
    def expect_ul(name: ul): Unit = js.native
    @JSName("expect")
    def expect_whitespace(name: whitespace): Unit = js.native
    
    def getLocation(): Position = js.native
    
    var line: Double = js.native
    
    def locate(tok: Unlocated[IdToken | Token], startPos: Position): /* asserts tok is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(ecmarkdown), TsIdentModule(None,List(ecmarkdown, dist, node-types)), TsIdentSimple(Token))),IArray())*/ Boolean = js.native
    
    def matchToken(): Unit = js.native
    
    def next(): Token = js.native
    
    def peek(): Token = js.native
    def peek(dist: Double): Token = js.native
    
    var pos: Double = js.native
    
    var previous: js.UndefOr[Token] = js.native
    
    var queue: js.Array[Token] = js.native
    
    def raise(message: String, pos: Position): Unit = js.native
    
    def scanChars(): String = js.native
    
    def scanDigits(): String = js.native
    
    def scanEscape(): String = js.native
    
    def scanToEOL(): String = js.native
    
    def scanToEndTag(endTag: String): String = js.native
    
    def scanWhitespace(): String = js.native
    
    var str: String = js.native
    
    def tryScanComment(): js.UndefOr[String] = js.native
    
    def tryScanId(): IdToken | Null = js.native
    
    def tryScanTag(): js.UndefOr[RegExpMatchArray] = js.native
  }
}
