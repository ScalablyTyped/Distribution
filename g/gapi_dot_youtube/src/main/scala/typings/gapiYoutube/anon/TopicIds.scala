package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicIds extends js.Object {
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
  implicit class TopicIdsOps[Self <: TopicIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTopicIdsVarargs(value: String*): Self = this.set("topicIds", js.Array(value :_*))
    @scala.inline
    def setTopicIds(value: js.Array[String]): Self = this.set("topicIds", value.asInstanceOf[js.Any])
  }
  
}

