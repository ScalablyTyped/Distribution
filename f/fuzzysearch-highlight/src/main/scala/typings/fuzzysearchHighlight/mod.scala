package typings.fuzzysearchHighlight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Highlight fuzzy matched text with html.
    */
  inline def apply(query: String, text: String): String | Null = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(query: String, text: String, opts: Options): String | Null = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @JSImport("fuzzysearch-highlight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var tag: String
  }
  object Options {
    
    inline def apply(tag: String): Options = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
}
