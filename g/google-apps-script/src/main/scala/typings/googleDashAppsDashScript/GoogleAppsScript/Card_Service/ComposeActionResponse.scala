package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeActionResponse extends js.Object {
  def printJson(): String
}

object ComposeActionResponse {
  @scala.inline
  def apply(printJson: () => String): ComposeActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
  
    __obj.asInstanceOf[ComposeActionResponse]
  }
}

