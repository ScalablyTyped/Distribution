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
    getFeedback: js.Function0[js.Object],
    getItem: js.Function0[Item],
    getResponse: js.Function0[js.Object],
    getScore: js.Function0[js.Object],
    setFeedback: js.Function1[js.Object, ItemResponse],
    setScore: js.Function1[js.Object, ItemResponse]
  ): ItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFeedback")(getFeedback)
    __obj.updateDynamic("getItem")(getItem)
    __obj.updateDynamic("getResponse")(getResponse)
    __obj.updateDynamic("getScore")(getScore)
    __obj.updateDynamic("setFeedback")(setFeedback)
    __obj.updateDynamic("setScore")(setScore)
    __obj.asInstanceOf[ItemResponse]
  }
}

