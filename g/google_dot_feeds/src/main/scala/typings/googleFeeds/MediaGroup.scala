package typings.googleFeeds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaGroup extends StObject {
  
  var content: js.Array[MediaContent] = js.native
}
object MediaGroup {
  
  @scala.inline
  def apply(content: js.Array[MediaContent]): MediaGroup = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaGroup]
  }
  
  @scala.inline
  implicit class MediaGroupMutableBuilder[Self <: MediaGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.Array[MediaContent]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVarargs(value: MediaContent*): Self = StObject.set(x, "content", js.Array(value :_*))
  }
}
