package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicBuilder[Topic] extends DisplayBuilder[TopicBuilder[Topic]] {
  def withTopicId(topicId: scala.Double): TopicBuilder[Topic]
}

object TopicBuilder {
  @scala.inline
  def apply[Topic](
    build: () => AdWordsOperation[TopicBuilder[Topic]],
    exclude: () => AdWordsOperation[TopicBuilder[Topic]],
    withCpc: scala.Double => TopicBuilder[Topic],
    withCpm: scala.Double => TopicBuilder[Topic],
    withTopicId: scala.Double => TopicBuilder[Topic]
  ): TopicBuilder[Topic] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withTopicId = js.Any.fromFunction1(withTopicId))
  
    __obj.asInstanceOf[TopicBuilder[Topic]]
  }
}

