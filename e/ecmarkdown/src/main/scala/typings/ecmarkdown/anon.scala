package typings.ecmarkdown

import typings.ecmarkdown.distNodeTypesMod.CommentNode
import typings.ecmarkdown.distNodeTypesMod.LocationRange
import typings.ecmarkdown.distNodeTypesMod.OrderedListItemNode
import typings.ecmarkdown.distNodeTypesMod.OrderedListNode
import typings.ecmarkdown.distNodeTypesMod.TagNode
import typings.ecmarkdown.distNodeTypesMod.TextNode
import typings.ecmarkdown.distNodeTypesMod.UnorderedListItemNode
import typings.ecmarkdown.ecmarkdownStrings.algorithm
import typings.ecmarkdown.ecmarkdownStrings.ol
import typings.ecmarkdown.ecmarkdownStrings.pipe
import typings.ecmarkdown.ecmarkdownStrings.star
import typings.ecmarkdown.ecmarkdownStrings.text
import typings.ecmarkdown.ecmarkdownStrings.tick
import typings.ecmarkdown.ecmarkdownStrings.tilde
import typings.ecmarkdown.ecmarkdownStrings.ul
import typings.ecmarkdown.ecmarkdownStrings.underscore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Contents extends StObject {
    
    var contents: OrderedListNode
    
    var location: LocationRange
    
    var name: algorithm
  }
  object Contents {
    
    inline def apply(contents: OrderedListNode, location: LocationRange): Contents = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "algorithm")
      __obj.asInstanceOf[Contents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Contents] (val x: Self) extends AnyVal {
      
      inline def setContents(value: OrderedListNode): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: algorithm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentsLocation extends StObject {
    
    var contents: js.Array[TagNode | CommentNode | TextNode]
    
    var location: LocationRange
    
    var name: star | underscore | tick | tilde
  }
  object ContentsLocation {
    
    inline def apply(
      contents: js.Array[TagNode | CommentNode | TextNode],
      location: LocationRange,
      name: star | underscore | tick | tilde
    ): ContentsLocation = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentsLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentsLocation] (val x: Self) extends AnyVal {
      
      inline def setContents(value: js.Array[TagNode | CommentNode | TextNode]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsVarargs(value: (TagNode | CommentNode | TextNode)*): Self = StObject.set(x, "contents", js.Array(value*))
      
      inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: star | underscore | tick | tilde): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var location: LocationRange
    
    var value: String
  }
  object Key {
    
    inline def apply(key: String, location: LocationRange, value: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Location extends StObject {
    
    var location: LocationRange
  }
  object Location {
    
    inline def apply(location: LocationRange): Location = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var contents: String
    
    var location: LocationRange
    
    var name: text
  }
  object Name {
    
    inline def apply(contents: String, location: LocationRange): Name = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "text")
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: text): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<ecmarkdown.ecmarkdown/dist/node-types.OrderedListNode, 'contents' | 'name' | 'indent' | 'start'> & {  location :ecmarkdown.ecmarkdown/dist/node-types.LocationRange} */
  trait PickOrderedListNodeconten extends StObject {
    
    var contents: js.Array[OrderedListItemNode]
    
    var indent: Double
    
    var location: LocationRange
    
    var name: ol
    
    var start: Double
  }
  object PickOrderedListNodeconten {
    
    inline def apply(contents: js.Array[OrderedListItemNode], indent: Double, location: LocationRange, start: Double): PickOrderedListNodeconten = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ol", start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickOrderedListNodeconten]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickOrderedListNodeconten] (val x: Self) extends AnyVal {
      
      inline def setContents(value: js.Array[OrderedListItemNode]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsVarargs(value: OrderedListItemNode*): Self = StObject.set(x, "contents", js.Array(value*))
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: ol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<ecmarkdown.ecmarkdown/dist/node-types.PipeNode, 'contents' | 'name' | 'nonTerminal' | 'params' | 'optional'> & {  location :ecmarkdown.ecmarkdown/dist/node-types.LocationRange} */
  trait PickPipeNodecontentsnamen extends StObject {
    
    var contents: Null
    
    var location: LocationRange
    
    var name: pipe
    
    var nonTerminal: String
    
    var optional: Boolean
    
    var params: String
  }
  object PickPipeNodecontentsnamen {
    
    inline def apply(contents: Null, location: LocationRange, nonTerminal: String, optional: Boolean, params: String): PickPipeNodecontentsnamen = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "pipe", nonTerminal = nonTerminal.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickPipeNodecontentsnamen]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickPipeNodecontentsnamen] (val x: Self) extends AnyVal {
      
      inline def setContents(value: Null): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: pipe): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNonTerminal(value: String): Self = StObject.set(x, "nonTerminal", value.asInstanceOf[js.Any])
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<ecmarkdown.ecmarkdown/dist/node-types.UnorderedListNode, 'contents' | 'name' | 'indent'> & {  location :ecmarkdown.ecmarkdown/dist/node-types.LocationRange} */
  trait PickUnorderedListNodecont extends StObject {
    
    var contents: js.Array[UnorderedListItemNode]
    
    var indent: Double
    
    var location: LocationRange
    
    var name: ul
  }
  object PickUnorderedListNodecont {
    
    inline def apply(contents: js.Array[UnorderedListItemNode], indent: Double, location: LocationRange): PickUnorderedListNodecont = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ul")
      __obj.asInstanceOf[PickUnorderedListNodecont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickUnorderedListNodecont] (val x: Self) extends AnyVal {
      
      inline def setContents(value: js.Array[UnorderedListItemNode]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsVarargs(value: UnorderedListItemNode*): Self = StObject.set(x, "contents", js.Array(value*))
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: ul): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
