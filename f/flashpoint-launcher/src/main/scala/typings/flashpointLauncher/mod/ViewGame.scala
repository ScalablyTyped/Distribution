package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Shortend version of {@link Game} returned in searches, makes for better performance. */
trait ViewGame extends StObject {
  
  var developer: String
  
  var id: String
  
  var platform: String
  
  var publisher: String
  
  var tagsStr: String
  
  var title: String
}
object ViewGame {
  
  inline def apply(developer: String, id: String, platform: String, publisher: String, tagsStr: String, title: String): ViewGame = {
    val __obj = js.Dynamic.literal(developer = developer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], tagsStr = tagsStr.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewGame]
  }
  
  extension [Self <: ViewGame](x: Self) {
    
    inline def setDeveloper(value: String): Self = StObject.set(x, "developer", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setTagsStr(value: String): Self = StObject.set(x, "tagsStr", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
