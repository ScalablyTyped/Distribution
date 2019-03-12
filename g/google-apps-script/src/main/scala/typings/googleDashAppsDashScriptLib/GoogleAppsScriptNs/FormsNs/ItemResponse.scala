package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemResponse extends js.Object {
  def getFeedback(): js.Object
  def getItem(): Item
  def getResponse(): js.Object
  def getScore(): js.Object
  def setFeedback(feedback: js.Object): ItemResponse
  def setScore(score: js.Object): ItemResponse
}

object ItemResponse {
  @scala.inline
  def apply(
    getFeedback: () => js.Object,
    getItem: () => Item,
    getResponse: () => js.Object,
    getScore: () => js.Object,
    setFeedback: js.Object => ItemResponse,
    setScore: js.Object => ItemResponse
  ): ItemResponse = {
    val __obj = js.Dynamic.literal(getFeedback = js.Any.fromFunction0(getFeedback), getItem = js.Any.fromFunction0(getItem), getResponse = js.Any.fromFunction0(getResponse), getScore = js.Any.fromFunction0(getScore), setFeedback = js.Any.fromFunction1(setFeedback), setScore = js.Any.fromFunction1(setScore))
  
    __obj.asInstanceOf[ItemResponse]
  }
}

