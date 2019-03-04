package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuizFeedback extends js.Object {
  def getLinkUrls(): js.Array[java.lang.String]
  def getText(): java.lang.String
}

object QuizFeedback {
  @scala.inline
  def apply(getLinkUrls: js.Function0[js.Array[java.lang.String]], getText: js.Function0[java.lang.String]): QuizFeedback = {
    val __obj = js.Dynamic.literal(getLinkUrls = getLinkUrls, getText = getText)
  
    __obj.asInstanceOf[QuizFeedback]
  }
}

