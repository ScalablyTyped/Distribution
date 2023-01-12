package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPhraseSuggestHighlight extends StObject {
  
  var post_tag: String
  
  var pre_tag: String
}
object SearchPhraseSuggestHighlight {
  
  inline def apply(post_tag: String, pre_tag: String): SearchPhraseSuggestHighlight = {
    val __obj = js.Dynamic.literal(post_tag = post_tag.asInstanceOf[js.Any], pre_tag = pre_tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPhraseSuggestHighlight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchPhraseSuggestHighlight] (val x: Self) extends AnyVal {
    
    inline def setPost_tag(value: String): Self = StObject.set(x, "post_tag", value.asInstanceOf[js.Any])
    
    inline def setPre_tag(value: String): Self = StObject.set(x, "pre_tag", value.asInstanceOf[js.Any])
  }
}
