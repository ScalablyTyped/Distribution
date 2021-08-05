package typings.googleFeeds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaGroup extends StObject {
  
  var content: js.Array[MediaContent]
}
object MediaGroup {
  
  inline def apply(content: js.Array[MediaContent]): MediaGroup = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaGroup]
  }
  
  extension [Self <: MediaGroup](x: Self) {
    
    inline def setContent(value: js.Array[MediaContent]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentVarargs(value: MediaContent*): Self = StObject.set(x, "content", js.Array(value :_*))
  }
}
