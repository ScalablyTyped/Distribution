package typings.ecmarkdown.parserMod

import typings.ecmarkdown.anon.Contents
import typings.ecmarkdown.anon.ContentsLocation
import typings.ecmarkdown.anon.Location
import typings.ecmarkdown.anon.Name
import typings.ecmarkdown.anon.PickOrderedListNodestartc
import typings.ecmarkdown.anon.PickPipeNodeoptionalconte
import typings.ecmarkdown.anon.PickUnorderedListNodecont
import typings.ecmarkdown.ecmarkdownStrings.ol
import typings.ecmarkdown.ecmarkdownStrings.ul
import typings.ecmarkdown.nodeTypesMod.CommentNode
import typings.ecmarkdown.nodeTypesMod.Format
import typings.ecmarkdown.nodeTypesMod.FragmentNode
import typings.ecmarkdown.nodeTypesMod.Node
import typings.ecmarkdown.nodeTypesMod.OrderedListItemNode
import typings.ecmarkdown.nodeTypesMod.Position
import typings.ecmarkdown.nodeTypesMod.TagNode
import typings.ecmarkdown.nodeTypesMod.TextNode
import typings.ecmarkdown.nodeTypesMod.Token
import typings.ecmarkdown.nodeTypesMod.Unlocated
import typings.ecmarkdown.nodeTypesMod.UnorderedListItemNode
import typings.ecmarkdown.tokenizerMod.Tokenizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkdown/dist/parser", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(tokenizer: Tokenizer) = this()
  
  var _posStack: js.Array[Position] = js.native
  
  var _t: Tokenizer = js.native
  
  def finish[T /* <: Unlocated[Node] */](node: T): T with Location = js.native
  def finish[T /* <: Unlocated[Node] */](node: T, start: js.UndefOr[scala.Nothing], end: Position): T with Location = js.native
  def finish[T /* <: Unlocated[Node] */](node: T, start: Position): T with Location = js.native
  def finish[T /* <: Unlocated[Node] */](node: T, start: Position, end: Position): T with Location = js.native
  
  def getEnd(node: Node): Position = js.native
  def getEnd(node: Token): Position = js.native
  
  def getPos(): Position = js.native
  def getPos(node: Node): Position = js.native
  def getPos(node: Token): Position = js.native
  
  def parseAlgorithm(): Contents = js.native
  
  def parseFormat(format: Format, opts: ParseFragmentOpts): js.Array[CommentNode | ContentsLocation | PickPipeNodeoptionalconte | TagNode | TextNode] = js.native
  
  def parseFragment(opts: ParseFragmentOpts): js.Array[FragmentNode] = js.native
  def parseFragment(opts: ParseFragmentOpts, closingFormatKind: Format): js.Array[TextNode | CommentNode | TagNode] = js.native
  
  def parseList(): PickOrderedListNodestartc | PickUnorderedListNodecont = js.native
  
  @JSName("parseListItem")
  def parseListItem_ol(kind: ol, indent: Double): OrderedListItemNode = js.native
  @JSName("parseListItem")
  def parseListItem_ul(kind: ul, indent: Double): UnorderedListItemNode = js.native
  
  def parseText(opts: ParseFragmentOpts): Name | Null = js.native
  def parseText(opts: ParseFragmentOpts, closingFormatKind: Format): Name | Null = js.native
  
  def popPos(): js.UndefOr[Position] = js.native
  
  def pushPos(): Unit = js.native
}
/* static members */
@JSImport("ecmarkdown/dist/parser", "Parser")
@js.native
object Parser extends js.Object {
  
  def parseAlgorithm(str: String): Contents = js.native
  
  def parseFragment(str: String): js.Array[FragmentNode] = js.native
}
