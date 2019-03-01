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
    build: js.Function0[AdWordsOperation[TopicBuilder[Topic]]],
    exclude: js.Function0[AdWordsOperation[TopicBuilder[Topic]]],
    withCpc: js.Function1[scala.Double, TopicBuilder[Topic]],
    withCpm: js.Function1[scala.Double, TopicBuilder[Topic]],
    withTopicId: js.Function1[scala.Double, TopicBuilder[Topic]]
  ): TopicBuilder[Topic] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("exclude")(exclude)
    __obj.updateDynamic("withCpc")(withCpc)
    __obj.updateDynamic("withCpm")(withCpm)
    __obj.updateDynamic("withTopicId")(withTopicId)
    __obj.asInstanceOf[TopicBuilder[Topic]]
  }
}

