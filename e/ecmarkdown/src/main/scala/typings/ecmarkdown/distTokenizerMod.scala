package typings.ecmarkdown

import typings.ecmarkdown.distNodeTypesMod.AttrToken
import typings.ecmarkdown.distNodeTypesMod.CommentToken
import typings.ecmarkdown.distNodeTypesMod.DoubleBracketsToken
import typings.ecmarkdown.distNodeTypesMod.EOFToken
import typings.ecmarkdown.distNodeTypesMod.Format
import typings.ecmarkdown.distNodeTypesMod.FormatToken
import typings.ecmarkdown.distNodeTypesMod.LinebreakToken
import typings.ecmarkdown.distNodeTypesMod.OpaqueTagToken
import typings.ecmarkdown.distNodeTypesMod.OrderedListToken
import typings.ecmarkdown.distNodeTypesMod.ParabreakToken
import typings.ecmarkdown.distNodeTypesMod.Position
import typings.ecmarkdown.distNodeTypesMod.TagToken
import typings.ecmarkdown.distNodeTypesMod.TextToken
import typings.ecmarkdown.distNodeTypesMod.Token
import typings.ecmarkdown.distNodeTypesMod.Unlocated
import typings.ecmarkdown.distNodeTypesMod.UnorderedListToken
import typings.ecmarkdown.distNodeTypesMod.WhitespaceToken
import typings.ecmarkdown.ecmarkdownStrings.EOF
import typings.ecmarkdown.ecmarkdownStrings.`double-brackets`
import typings.ecmarkdown.ecmarkdownStrings.comment
import typings.ecmarkdown.ecmarkdownStrings.linebreak
import typings.ecmarkdown.ecmarkdownStrings.ol
import typings.ecmarkdown.ecmarkdownStrings.opaqueTag
import typings.ecmarkdown.ecmarkdownStrings.parabreak
import typings.ecmarkdown.ecmarkdownStrings.tag
import typings.ecmarkdown.ecmarkdownStrings.text
import typings.ecmarkdown.ecmarkdownStrings.ul
import typings.ecmarkdown.ecmarkdownStrings.whitespace
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTokenizerMod {
  
  @JSImport("ecmarkdown/dist/tokenizer", "Tokenizer")
  @js.native
  open class Tokenizer protected () extends StObject {
    def this(str: String) = this()
    
    var _eof: Boolean = js.native
    
    var _lookahead: js.Array[Token] = js.native
    
    var _newline: Boolean = js.native
    
    var column: Double = js.native
    
    def dequeue(): js.UndefOr[
        EOFToken | FormatToken | ParabreakToken | LinebreakToken | WhitespaceToken | DoubleBracketsToken | TextToken | CommentToken | OpaqueTagToken | TagToken | UnorderedListToken | OrderedListToken
      ] = js.native
    
    def enqueue(tok: Unlocated[Token], pos: Position): Unit = js.native
    
    def expect(
      name: EOF | parabreak | linebreak | whitespace | `double-brackets` | text | comment | tag | ul | ol | opaqueTag
    ): Unit = js.native
    def expect(name: Format): Unit = js.native
    
    def getLocation(): Position = js.native
    
    var line: Double = js.native
    
    def locate(tok: Unlocated[Token], startPos: Position): /* asserts tok is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(ecmarkdown), TsIdentModule(None,List(ecmarkdown, dist, node-types)), TsIdentSimple(Token))),IArray())*/ Boolean = js.native
    def locate(tok: Unlocated[AttrToken], startPos: Position): /* asserts tok is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(ecmarkdown), TsIdentModule(None,List(ecmarkdown, dist, node-types)), TsIdentSimple(AttrToken))),IArray())*/ Boolean = js.native
    
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
    
    def scanToEndTag(endTag: String): String = js.native
    
    def scanWhitespace(): String = js.native
    
    var str: String = js.native
    
    def tryScanComment(): js.UndefOr[String] = js.native
    
    def tryScanFieldOrSlot(): js.UndefOr[String] = js.native
    
    def tryScanListItemAttributes(): js.Array[AttrToken] = js.native
    
    def tryScanTag(): js.UndefOr[RegExpMatchArray] = js.native
  }
}
