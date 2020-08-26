package typings.ecmarkdown.parserMod

import typings.ecmarkdown.anon.Contents
import typings.ecmarkdown.ecmarkdownStrings.ol
import typings.ecmarkdown.ecmarkdownStrings.ul
import typings.ecmarkdown.mod.Options
import typings.ecmarkdown.nodeTypesMod.CommentNode
import typings.ecmarkdown.nodeTypesMod.Format
import typings.ecmarkdown.nodeTypesMod.FragmentNode
import typings.ecmarkdown.nodeTypesMod.ListNode
import typings.ecmarkdown.nodeTypesMod.Node
import typings.ecmarkdown.nodeTypesMod.OrderedListItemNode
import typings.ecmarkdown.nodeTypesMod.Position
import typings.ecmarkdown.nodeTypesMod.TagNode
import typings.ecmarkdown.nodeTypesMod.TextNode
import typings.ecmarkdown.nodeTypesMod.Token
import typings.ecmarkdown.nodeTypesMod.UnorderedListItemNode
import typings.ecmarkdown.tokenizerMod.Tokenizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkdown/dist/parser", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(tokenizer: Tokenizer) = this()
  def this(tokenizer: Tokenizer, options: Options) = this()
  var _posStack: js.UndefOr[js.Array[Position]] = js.native
  var _t: Tokenizer = js.native
  def finish[T /* <: Node */](node: T): T = js.native
  def finish[T /* <: Node */](node: T, start: js.UndefOr[scala.Nothing], end: Position): T = js.native
  def finish[T /* <: Node */](node: T, start: Position): T = js.native
  def finish[T /* <: Node */](node: T, start: Position, end: Position): T = js.native
  def getEnd(node: Node): js.UndefOr[Position] = js.native
  def getEnd(node: Token): js.UndefOr[Position] = js.native
  def getPos(): js.UndefOr[Position] = js.native
  def getPos(node: Node): js.UndefOr[Position] = js.native
  def getPos(node: Token): js.UndefOr[Position] = js.native
  def parseAlgorithm(): Contents = js.native
  def parseFormat(format: Format, opts: ParseFragmentOpts): js.Array[FragmentNode] = js.native
  def parseFragment(opts: ParseFragmentOpts): js.Array[FragmentNode] = js.native
  def parseFragment(opts: ParseFragmentOpts, closingFormatKind: Format): js.Array[TextNode | CommentNode | TagNode] = js.native
  def parseList(): ListNode = js.native
  @JSName("parseListItem")
  def parseListItem_ol(kind: ol, indent: Double): OrderedListItemNode = js.native
  @JSName("parseListItem")
  def parseListItem_ul(kind: ul, indent: Double): UnorderedListItemNode = js.native
  def parseText(opts: ParseFragmentOpts): TextNode | Null = js.native
  def parseText(opts: ParseFragmentOpts, closingFormatKind: Format): TextNode | Null = js.native
  def popPos(): js.UndefOr[Position] = js.native
  def pushPos(): Unit = js.native
}

/* static members */
@JSImport("ecmarkdown/dist/parser", "Parser")
@js.native
object Parser extends js.Object {
  def parseAlgorithm(str: String): Contents = js.native
  def parseAlgorithm(str: String, options: Options): Contents = js.native
  def parseFragment(str: String): js.Array[FragmentNode] = js.native
  def parseFragment(str: String, options: Options): js.Array[FragmentNode] = js.native
}

