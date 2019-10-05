package typings.googleDashAppsDashScript.GoogleAppsScript.Forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemResponse extends js.Object {
  def getFeedback(): QuizFeedback
  def getItem(): Item
  def getResponse(): (js.Array[js.Array[String] | String]) | String
  def getScore(): Double
  def setFeedback(feedback: js.Any): ItemResponse
  def setScore(score: js.Any): ItemResponse
}

object ItemResponse {
  @scala.inline
  def apply(
    getFeedback: () => QuizFeedback,
    getItem: () => Item,
    getResponse: () => (js.Array[js.Array[String] | String]) | String,
    getScore: () => Double,
    setFeedback: js.Any => ItemResponse,
    setScore: js.Any => ItemResponse
  ): ItemResponse = {
    val __obj = js.Dynamic.literal(getFeedback = js.Any.fromFunction0(getFeedback), getItem = js.Any.fromFunction0(getItem), getResponse = js.Any.fromFunction0(getResponse), getScore = js.Any.fromFunction0(getScore), setFeedback = js.Any.fromFunction1(setFeedback), setScore = js.Any.fromFunction1(setScore))
  
    __obj.asInstanceOf[ItemResponse]
  }
}

