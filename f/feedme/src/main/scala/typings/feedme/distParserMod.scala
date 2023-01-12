package typings.feedme

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserMod {
  
  trait Feed
    extends StObject
       with /* key */ StringDictionary[FeedObject | js.Array[FeedObject]] {
    
    var items: js.Array[FeedItem]
    
    var `type`: String
  }
  object Feed {
    
    inline def apply(items: js.Array[FeedItem], `type`: String): Feed = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Feed] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[FeedItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: FeedItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type FeedItem = {[key: string] : feedme.feedme/dist/parser.FeedObject}
  }}}
  to avoid circular code involving: 
  - feedme.feedme/dist/parser.FeedItem
  - feedme.feedme/dist/parser.FeedObject
  */
  trait FeedItem
    extends StObject
       with /* key */ StringDictionary[FeedObject]
  object FeedItem {
    
    inline def apply(): FeedItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedItem]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type FeedObject = string | {[key: string] : string | boolean | null | feedme.feedme/dist/parser.FeedObject | std.Array<feedme.feedme/dist/parser.FeedObject>}
  }}}
  to avoid circular code involving: 
  - feedme.feedme/dist/parser.FeedObject
  */
  type FeedObject = String | (StringDictionary[String | Boolean | Null | Any | js.Array[Any]])
  
  @js.native
  trait Parser extends Writable {
    
    var _buffer: Boolean = js.native
    
    def done(): js.UndefOr[Feed] = js.native
    
    var parser: Writable = js.native
  }
}
