package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemResponse extends js.Object {
  def getFeedback(): js.Any
  def getItem(): Item
  def getResponse(): js.Any
  def getScore(): js.Any
  def setFeedback(feedback: js.Any): ItemResponse
  def setScore(score: js.Any): ItemResponse
}

object ItemResponse {
  @scala.inline
  def apply(
    getFeedback: () => js.Any,
    getItem: () => Item,
    getResponse: () => js.Any,
    getScore: () => js.Any,
    setFeedback: js.Any => ItemResponse,
    setScore: js.Any => ItemResponse
  ): ItemResponse = {
    val __obj = js.Dynamic.literal(getFeedback = js.Any.fromFunction0(getFeedback), getItem = js.Any.fromFunction0(getItem), getResponse = js.Any.fromFunction0(getResponse), getScore = js.Any.fromFunction0(getScore), setFeedback = js.Any.fromFunction1(setFeedback), setScore = js.Any.fromFunction1(setScore))
  
    __obj.asInstanceOf[ItemResponse]
  }
}

