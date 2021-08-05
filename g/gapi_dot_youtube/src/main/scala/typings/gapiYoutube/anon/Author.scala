package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Author extends StObject {
  
  /**
    * The author of the social network post.
    */
  var author: String
  
  /**
    * An image of the posts author.
    */
  var imageUrl: String
  
  /**
    * The URL of the social network post.
    */
  var referenceUrl: String
  
  /**
    * The resourceId object encapsulates information that identifies the resource associated with a social network post.
    */
  var resourceId: KindPlaylistId
  
  /**
    * The name of the social network.
    */
  var `type`: String
}
object Author {
  
  inline def apply(author: String, imageUrl: String, referenceUrl: String, resourceId: KindPlaylistId, `type`: String): Author = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], referenceUrl = referenceUrl.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  
  extension [Self <: Author](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setReferenceUrl(value: String): Self = StObject.set(x, "referenceUrl", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: KindPlaylistId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
