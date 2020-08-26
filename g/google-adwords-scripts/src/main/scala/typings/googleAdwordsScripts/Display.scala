package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Display extends js.Object {
  def audiences(): AdWordsSelector[Audience] = js.native
  def keywords(): AdWordsSelector[DisplayKeyword] = js.native
  def placements(): AdWordsSelector[Placement] = js.native
  def topics(): AdWordsSelector[Topic] = js.native
}

object Display {
  @scala.inline
  def apply(
    audiences: () => AdWordsSelector[Audience],
    keywords: () => AdWordsSelector[DisplayKeyword],
    placements: () => AdWordsSelector[Placement],
    topics: () => AdWordsSelector[Topic]
  ): Display = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), keywords = js.Any.fromFunction0(keywords), placements = js.Any.fromFunction0(placements), topics = js.Any.fromFunction0(topics))
    __obj.asInstanceOf[Display]
  }
  @scala.inline
  implicit class DisplayOps[Self <: Display] (val x: Self) extends AnyVal {
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
    def setAudiences(value: () => AdWordsSelector[Audience]): Self = this.set("audiences", js.Any.fromFunction0(value))
    @scala.inline
    def setKeywords(value: () => AdWordsSelector[DisplayKeyword]): Self = this.set("keywords", js.Any.fromFunction0(value))
    @scala.inline
    def setPlacements(value: () => AdWordsSelector[Placement]): Self = this.set("placements", js.Any.fromFunction0(value))
    @scala.inline
    def setTopics(value: () => AdWordsSelector[Topic]): Self = this.set("topics", js.Any.fromFunction0(value))
  }
  
}

