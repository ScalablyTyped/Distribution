package typings.googleFeeds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait feedJSON extends StObject {
  
  var author: String
  
  var description: String
  
  var entries: js.Array[feedEntry]
  
  var feedURL: String
  
  var link: String
}
object feedJSON {
  
  inline def apply(author: String, description: String, entries: js.Array[feedEntry], feedURL: String, link: String): feedJSON = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], feedURL = feedURL.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[feedJSON]
  }
  
  extension [Self <: feedJSON](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: js.Array[feedEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: feedEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    inline def setFeedURL(value: String): Self = StObject.set(x, "feedURL", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
  }
}
