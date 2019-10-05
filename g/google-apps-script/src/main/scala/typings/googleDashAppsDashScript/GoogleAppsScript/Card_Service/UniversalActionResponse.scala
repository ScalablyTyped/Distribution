package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniversalActionResponse extends js.Object {
  def printJson(): String
}

object UniversalActionResponse {
  @scala.inline
  def apply(printJson: () => String): UniversalActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
  
    __obj.asInstanceOf[UniversalActionResponse]
  }
}

