package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TopicIds extends js.Object {
  /**
    * A list of Freebase topic IDs associated with the video. You can retrieve information about each topic using the Freebase Topic API.
    */
  var topicIds: js.Array[java.lang.String]
}

object Anon_TopicIds {
  @scala.inline
  def apply(topicIds: js.Array[java.lang.String]): Anon_TopicIds = {
    val __obj = js.Dynamic.literal(topicIds = topicIds)
  
    __obj.asInstanceOf[Anon_TopicIds]
  }
}

