package typings.domhandler

import org.scalablytyped.runtime.StringDictionary
import typings.domelementtype.mod.ElementType
import typings.domelementtype.mod.ElementType.Directive
import typings.domelementtype.mod.ElementType.Root
import typings.domelementtype.mod.ElementType.Script
import typings.domelementtype.mod.ElementType.Style
import typings.domelementtype.mod.ElementType.Tag
import typings.domhandler.domhandlerInts.`1`
import typings.domhandler.domhandlerInts.`3`
import typings.domhandler.domhandlerInts.`4`
import typings.domhandler.domhandlerInts.`8`
import typings.domhandler.domhandlerInts.`9`
import typings.domhandler.domhandlerStrings.`limited-quirks`
import typings.domhandler.domhandlerStrings.`no-quirks`
import typings.domhandler.domhandlerStrings.quirks
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodeMod {
  
  @JSImport("domhandler/lib/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("domhandler/lib/node", "CDATA")
  @js.native
  open class CDATA protected ()
    extends NodeWithChildren
       with ChildNode
       with ParentNode {
    /**
      * @param children Children of the node. Only certain node types can have children.
      */
    def this(children: js.Array[ChildNode]) = this()
    
    @JSName("nodeType")
    def nodeType_MCDATA: `4` = js.native
    
    @JSName("type")
    var type_CDATA: typings.domelementtype.mod.ElementType.CDATA = js.native
  }
  
  @JSImport("domhandler/lib/node", "Comment")
  @js.native
  open class Comment protected ()
    extends DataNode
       with ChildNode {
    /**
      * @param data The content of the data node
      */
    def this(data: String) = this()
    
    @JSName("nodeType")
    def nodeType_MComment: `8` = js.native
    
    @JSName("type")
    var type_Comment: typings.domelementtype.mod.ElementType.Comment = js.native
  }
  
  @JSImport("domhandler/lib/node", "DataNode")
  @js.native
  abstract class DataNode protected () extends Node {
    /**
      * @param data The content of the data node
      */
    def this(data: String) = this()
    
    var data: String = js.native
    
    /**
      * Same as {@link data}.
      * [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    def nodeValue: String = js.native
    def nodeValue_=(data: String): Unit = js.native
  }
  
  @JSImport("domhandler/lib/node", "Document")
  @js.native
  open class Document protected ()
    extends NodeWithChildren
       with ChildNode
       with ParentNode {
    /**
      * @param children Children of the node. Only certain node types can have children.
      */
    def this(children: js.Array[ChildNode]) = this()
    
    @JSName("nodeType")
    def nodeType_MDocument: `9` = js.native
    
    @JSName("type")
    var type_Document: Root = js.native
    
    /** [Document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks) (parse5 only). */
    var `x-mode`: js.UndefOr[`no-quirks` | quirks | `limited-quirks`] = js.native
  }
  
  @JSImport("domhandler/lib/node", "Element")
  @js.native
  open class Element protected ()
    extends NodeWithChildren
       with ChildNode
       with ParentNode {
    /**
      * @param name Name of the tag, eg. `div`, `span`.
      * @param attribs Object mapping attribute names to attribute values.
      * @param children Children of the node.
      */
    def this(name: String, attribs: StringDictionary[String]) = this()
    def this(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode]) = this()
    def this(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode], `type`: Script) = this()
    def this(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode], `type`: Style) = this()
    def this(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode], `type`: Tag) = this()
    def this(name: String, attribs: StringDictionary[String], children: Unit, `type`: Script) = this()
    def this(name: String, attribs: StringDictionary[String], children: Unit, `type`: Style) = this()
    def this(name: String, attribs: StringDictionary[String], children: Unit, `type`: Tag) = this()
    
    var attribs: StringDictionary[String] = js.native
    
    def attributes: js.Array[Attribute] = js.native
    
    var name: String = js.native
    
    /** Element namespace (parse5 only). */
    var namespace: js.UndefOr[String] = js.native
    
    @JSName("nodeType")
    def nodeType_MElement: `1` = js.native
    
    /**
      * `parse5` source code location info, with start & end tags.
      *
      * Available if parsing with parse5 and location info is enabled.
      */
    @JSName("sourceCodeLocation")
    var sourceCodeLocation_Element: js.UndefOr[TagSourceCodeLocation | Null] = js.native
    
    /**
      * Same as {@link name}.
      * [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    def tagName: String = js.native
    def tagName_=(name: String): Unit = js.native
    
    @JSName("type")
    var type_Element: Tag | Script | Style = js.native
    
    /** Element attribute namespaces (parse5 only). */
    var `x-attribsNamespace`: js.UndefOr[Record[String, String]] = js.native
    
    /** Element attribute namespace-related prefixes (parse5 only). */
    var `x-attribsPrefix`: js.UndefOr[Record[String, String]] = js.native
  }
  
  @JSImport("domhandler/lib/node", "Node")
  @js.native
  abstract class Node () extends StObject {
    
    /**
      * Clone this node, and optionally its children.
      *
      * @param recursive Clone child nodes as well.
      * @returns A clone of the node.
      */
    def cloneNode[T /* <: Node */](): T = js.native
    def cloneNode[T /* <: Node */](recursive: Boolean): T = js.native
    
    /** The end index of the node. Requires `withEndIndices` on the handler to be `true. */
    var endIndex: Double | Null = js.native
    
    /** Next sibling */
    var next: ChildNode | Null = js.native
    
    /**
      * Same as {@link next}.
      * [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    def nextSibling: ChildNode | Null = js.native
    def nextSibling_=(next: ChildNode | Null): Unit = js.native
    
    /**
      * [DOM spec](https://dom.spec.whatwg.org/#dom-node-nodetype)-compatible
      * node {@link type}.
      */
    val nodeType: Double = js.native
    
    /** Parent of the node */
    var parent: ParentNode | Null = js.native
    
    /**
      * Same as {@link parent}.
      * [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    def parentNode: ParentNode | Null = js.native
    def parentNode_=(parent: ParentNode | Null): Unit = js.native
    
    /** Previous sibling */
    var prev: ChildNode | Null = js.native
    
    /**
      * Same as {@link prev}.
      * [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    def previousSibling: ChildNode | Null = js.native
    def previousSibling_=(prev: ChildNode | Null): Unit = js.native
    
    /**
      * `parse5` source code location info.
      *
      * Available if parsing with parse5 and location info is enabled.
      */
    var sourceCodeLocation: js.UndefOr[SourceCodeLocation | Null] = js.native
    
    /** The start index of the node. Requires `withStartIndices` on the handler to be `true. */
    var startIndex: Double | Null = js.native
    
    /** The type of the node. */
    val `type`: ElementType = js.native
  }
  
  @JSImport("domhandler/lib/node", "NodeWithChildren")
  @js.native
  abstract class NodeWithChildren protected () extends Node {
    /**
      * @param children Children of the node. Only certain node types can have children.
      */
    def this(children: js.Array[ChildNode]) = this()
    
    /**
      * Same as {@link children}.
      * [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
      */
    def childNodes: js.Array[ChildNode] = js.native
    def childNodes_=(children: js.Array[ChildNode]): Unit = js.native
    
    var children: js.Array[ChildNode] = js.native
    
    /** First child of the node. */
    def firstChild: ChildNode | Null = js.native
    
    /** Last child of the node. */
    def lastChild: ChildNode | Null = js.native
  }
  
  @JSImport("domhandler/lib/node", "ProcessingInstruction")
  @js.native
  open class ProcessingInstruction protected ()
    extends DataNode
       with ChildNode {
    def this(name: String, data: String) = this()
    
    var name: String = js.native
    
    @JSName("nodeType")
    def nodeType_MProcessingInstruction: `1` = js.native
    
    @JSName("type")
    var type_ProcessingInstruction: Directive = js.native
    
    /** If this is a doctype, the document type name (parse5 only). */
    var `x-name`: js.UndefOr[String] = js.native
    
    /** If this is a doctype, the document type public identifier (parse5 only). */
    var `x-publicId`: js.UndefOr[String] = js.native
    
    /** If this is a doctype, the document type system identifier (parse5 only). */
    var `x-systemId`: js.UndefOr[String] = js.native
  }
  
  @JSImport("domhandler/lib/node", "Text")
  @js.native
  open class Text protected ()
    extends DataNode
       with ChildNode {
    /**
      * @param data The content of the data node
      */
    def this(data: String) = this()
    
    @JSName("nodeType")
    def nodeType_MText: `3` = js.native
    
    @JSName("type")
    var type_Text: typings.domelementtype.mod.ElementType.Text = js.native
  }
  
  inline def cloneNode[T /* <: Node */](node: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneNode")(node.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def cloneNode[T /* <: Node */](node: T, recursive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneNode")(node.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def hasChildren(node: Node): /* is domhandler.domhandler/lib/node.ParentNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasChildren")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/node.ParentNode */ Boolean]
  
  inline def isCDATA(node: Node): /* is domhandler.domhandler/lib/node.CDATA */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCDATA")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/node.CDATA */ Boolean]
  
  inline def isComment(node: Node): /* is domhandler.domhandler/lib/node.Comment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/node.Comment */ Boolean]
  
  inline def isDirective(node: Node): /* is domhandler.domhandler/lib/node.ProcessingInstruction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirective")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/node.ProcessingInstruction */ Boolean]
  
  inline def isDocument(node: Node): /* is domhandler.domhandler/lib/node.Document */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocument")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/node.Document */ Boolean]
  
  inline def isTag(node: Node): /* is domhandler.domhandler/lib/node.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/node.Element */ Boolean]
  
  inline def isText(node: Node): /* is domhandler.domhandler/lib/node.Text */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isText")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/node.Text */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.domhandler.libNodeMod.ParentNode
    - typings.domhandler.libNodeMod.ChildNode
  */
  trait AnyNode extends StObject
  
  /**
    * The description of an individual attribute.
    */
  trait Attribute extends StObject {
    
    var name: String
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object Attribute {
    
    inline def apply(name: String, value: String): Attribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attribute]
    }
    
    extension [Self <: Attribute](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.domhandler.libNodeMod.Text
    - typings.domhandler.libNodeMod.Comment
    - typings.domhandler.libNodeMod.ProcessingInstruction
    - typings.domhandler.libNodeMod.Element
    - typings.domhandler.libNodeMod.CDATA
    - typings.domhandler.libNodeMod.Document
  */
  trait ChildNode
    extends StObject
       with AnyNode
  
  /* Rewritten from type alias, can be one of: 
    - typings.domhandler.libNodeMod.Document
    - typings.domhandler.libNodeMod.Element
    - typings.domhandler.libNodeMod.CDATA
  */
  trait ParentNode
    extends StObject
       with AnyNode
  
  trait SourceCodeLocation extends StObject {
    
    /** One-based column index of the last character. Points directly *after* the last character. */
    var endCol: Double
    
    /** One-based line index of the last character. */
    var endLine: Double
    
    /** Zero-based last character index. Points directly *after* the last character. */
    var endOffset: Double
    
    /** One-based column index of the first character. */
    var startCol: Double
    
    /** One-based line index of the first character. */
    var startLine: Double
    
    /** Zero-based first character index. */
    var startOffset: Double
  }
  object SourceCodeLocation {
    
    inline def apply(
      endCol: Double,
      endLine: Double,
      endOffset: Double,
      startCol: Double,
      startLine: Double,
      startOffset: Double
    ): SourceCodeLocation = {
      val __obj = js.Dynamic.literal(endCol = endCol.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceCodeLocation]
    }
    
    extension [Self <: SourceCodeLocation](x: Self) {
      
      inline def setEndCol(value: Double): Self = StObject.set(x, "endCol", value.asInstanceOf[js.Any])
      
      inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
      
      inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
      
      inline def setStartCol(value: Double): Self = StObject.set(x, "startCol", value.asInstanceOf[js.Any])
      
      inline def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
      
      inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagSourceCodeLocation
    extends StObject
       with SourceCodeLocation {
    
    var endTag: js.UndefOr[SourceCodeLocation] = js.undefined
    
    var startTag: js.UndefOr[SourceCodeLocation] = js.undefined
  }
  object TagSourceCodeLocation {
    
    inline def apply(
      endCol: Double,
      endLine: Double,
      endOffset: Double,
      startCol: Double,
      startLine: Double,
      startOffset: Double
    ): TagSourceCodeLocation = {
      val __obj = js.Dynamic.literal(endCol = endCol.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagSourceCodeLocation]
    }
    
    extension [Self <: TagSourceCodeLocation](x: Self) {
      
      inline def setEndTag(value: SourceCodeLocation): Self = StObject.set(x, "endTag", value.asInstanceOf[js.Any])
      
      inline def setEndTagUndefined: Self = StObject.set(x, "endTag", js.undefined)
      
      inline def setStartTag(value: SourceCodeLocation): Self = StObject.set(x, "startTag", value.asInstanceOf[js.Any])
      
      inline def setStartTagUndefined: Self = StObject.set(x, "startTag", js.undefined)
    }
  }
}
