package typings.googleFeeds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait feedEntry extends StObject {
  
  var categories: js.Array[String]
  
  var content: String
  
  var contentSnippet: String
  
  var link: String
  
  var mediaGroup: js.Array[MediaGroup]
  
  var publishedDate: String
  
  var title: String
}
object feedEntry {
  
  inline def apply(
    categories: js.Array[String],
    content: String,
    contentSnippet: String,
    link: String,
    mediaGroup: js.Array[MediaGroup],
    publishedDate: String,
    title: String
  ): feedEntry = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentSnippet = contentSnippet.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], mediaGroup = mediaGroup.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[feedEntry]
  }
  
  extension [Self <: feedEntry](x: Self) {
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentSnippet(value: String): Self = StObject.set(x, "contentSnippet", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setMediaGroup(value: js.Array[MediaGroup]): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
    
    inline def setMediaGroupVarargs(value: MediaGroup*): Self = StObject.set(x, "mediaGroup", js.Array(value :_*))
    
    inline def setPublishedDate(value: String): Self = StObject.set(x, "publishedDate", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
