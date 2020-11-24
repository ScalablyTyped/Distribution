package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicBuilder[Topic] extends DisplayBuilder[TopicBuilder[Topic]] {
  
  def withTopicId(topicId: Double): TopicBuilder[Topic] = js.native
}
object TopicBuilder {
  
  @scala.inline
  def apply[Topic](
    build: () => AdWordsOperation[TopicBuilder[Topic]],
    exclude: () => AdWordsOperation[TopicBuilder[Topic]],
    withCpc: Double => TopicBuilder[Topic],
    withCpm: Double => TopicBuilder[Topic],
    withTopicId: Double => TopicBuilder[Topic]
  ): TopicBuilder[Topic] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withTopicId = js.Any.fromFunction1(withTopicId))
    __obj.asInstanceOf[TopicBuilder[Topic]]
  }
  
  @scala.inline
  implicit class TopicBuilderOps[Self <: TopicBuilder[_], Topic] (val x: Self with TopicBuilder[Topic]) extends AnyVal {
    
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
    def setWithTopicId(value: Double => TopicBuilder[Topic]): Self = this.set("withTopicId", js.Any.fromFunction1(value))
  }
}
