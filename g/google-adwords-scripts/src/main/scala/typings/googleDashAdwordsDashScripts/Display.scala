package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Display extends js.Object {
  def audiences(): AdWordsSelector[Audience]
  def keywords(): AdWordsSelector[DisplayKeyword]
  def placements(): AdWordsSelector[Placement]
  def topics(): AdWordsSelector[Topic]
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
}

