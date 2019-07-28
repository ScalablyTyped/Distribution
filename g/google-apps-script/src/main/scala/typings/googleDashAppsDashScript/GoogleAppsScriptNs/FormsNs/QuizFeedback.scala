package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuizFeedback extends js.Object {
  def getLinkUrls(): js.Array[String]
  def getText(): String
}

object QuizFeedback {
  @scala.inline
  def apply(getLinkUrls: () => js.Array[String], getText: () => String): QuizFeedback = {
    val __obj = js.Dynamic.literal(getLinkUrls = js.Any.fromFunction0(getLinkUrls), getText = js.Any.fromFunction0(getText))
  
    __obj.asInstanceOf[QuizFeedback]
  }
}

