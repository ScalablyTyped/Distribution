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
  def apply(getLinkUrls: () => js.Array[java.lang.String], getText: () => java.lang.String): QuizFeedback = {
    val __obj = js.Dynamic.literal(getLinkUrls = js.Any.fromFunction0(getLinkUrls), getText = js.Any.fromFunction0(getText))
  
    __obj.asInstanceOf[QuizFeedback]
  }
}

