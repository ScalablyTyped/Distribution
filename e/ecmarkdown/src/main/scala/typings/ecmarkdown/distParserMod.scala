package typings.ecmarkdown

import typings.ecmarkdown.anon.Contents
import typings.ecmarkdown.anon.ContentsLocation
import typings.ecmarkdown.anon.Location
import typings.ecmarkdown.anon.Name
import typings.ecmarkdown.anon.PickOrderedListNodeconten
import typings.ecmarkdown.anon.PickPipeNodecontentsnamen
import typings.ecmarkdown.anon.PickUnorderedListNodecont
import typings.ecmarkdown.distNodeTypesMod.CommentNode
import typings.ecmarkdown.distNodeTypesMod.Format
import typings.ecmarkdown.distNodeTypesMod.FragmentNode
import typings.ecmarkdown.distNodeTypesMod.Node
import typings.ecmarkdown.distNodeTypesMod.OrderedListItemNode
import typings.ecmarkdown.distNodeTypesMod.Position
import typings.ecmarkdown.distNodeTypesMod.TagNode
import typings.ecmarkdown.distNodeTypesMod.TextNode
import typings.ecmarkdown.distNodeTypesMod.Token
import typings.ecmarkdown.distNodeTypesMod.Unlocated
import typings.ecmarkdown.distNodeTypesMod.UnorderedListItemNode
import typings.ecmarkdown.distTokenizerMod.Tokenizer
import typings.ecmarkdown.ecmarkdownStrings.ol
import typings.ecmarkdown.ecmarkdownStrings.ul
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserMod {
  
  @JSImport("ecmarkdown/dist/parser", "Parser")
  @js.native
  open class Parser protected () extends StObject {
    def this(tokenizer: Tokenizer) = this()
    
    var _posStack: js.Array[Position] = js.native
    
    var _t: Tokenizer = js.native
    
    def finish[T /* <: Unlocated[Node] */](node: T): T & Location = js.native
    def finish[T /* <: Unlocated[Node] */](node: T, start: Unit, end: Position): T & Location = js.native
    def finish[T /* <: Unlocated[Node] */](node: T, start: Position): T & Location = js.native
    def finish[T /* <: Unlocated[Node] */](node: T, start: Position, end: Position): T & Location = js.native
    
    def getEnd(node: Node): Position = js.native
    def getEnd(node: Token): Position = js.native
    
    def getPos(): Position = js.native
    def getPos(node: Node): Position = js.native
    def getPos(node: Token): Position = js.native
    
    def parseAlgorithm(): Contents = js.native
    
    def parseFormat(format: Format, opts: ParseFragmentOpts): js.Array[CommentNode | ContentsLocation | PickPipeNodecontentsnamen | TagNode | TextNode] = js.native
    
    def parseFragment(opts: ParseFragmentOpts): js.Array[FragmentNode] = js.native
    def parseFragment(opts: ParseFragmentOpts, closingFormatKind: Format): js.Array[TextNode | CommentNode | TagNode] = js.native
    
    def parseList(): PickOrderedListNodeconten | PickUnorderedListNodecont = js.native
    
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
  object Parser {
    
    @JSImport("ecmarkdown/dist/parser", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parseAlgorithm(str: String): Contents = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAlgorithm")(str.asInstanceOf[js.Any]).asInstanceOf[Contents]
    
    inline def parseFragment(str: String): js.Array[FragmentNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[FragmentNode]]
  }
  
  trait ParseFragmentOpts extends StObject {
    
    var inList: js.UndefOr[Boolean] = js.undefined
  }
  object ParseFragmentOpts {
    
    inline def apply(): ParseFragmentOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseFragmentOpts]
    }
    
    extension [Self <: ParseFragmentOpts](x: Self) {
      
      inline def setInList(value: Boolean): Self = StObject.set(x, "inList", value.asInstanceOf[js.Any])
      
      inline def setInListUndefined: Self = StObject.set(x, "inList", js.undefined)
    }
  }
}
