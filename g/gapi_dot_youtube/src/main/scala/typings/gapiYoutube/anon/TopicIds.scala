package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicIds extends StObject {
  
  /**
    * A list of Freebase topic IDs associated with the video. You can retrieve information about each topic using the Freebase Topic API.
    */
  var topicIds: js.Array[String] = js.native
}
object TopicIds {
  
  @scala.inline
  def apply(topicIds: js.Array[String]): TopicIds = {
    val __obj = js.Dynamic.literal(topicIds = topicIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicIds]
  }
  
  @scala.inline
  implicit class TopicIdsMutableBuilder[Self <: TopicIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopicIds(value: js.Array[String]): Self = StObject.set(x, "topicIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicIdsVarargs(value: String*): Self = StObject.set(x, "topicIds", js.Array(value :_*))
  }
}
