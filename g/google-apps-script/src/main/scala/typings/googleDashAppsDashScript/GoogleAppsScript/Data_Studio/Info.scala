package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  def setId(id: String): Info
  def setText(text: String): Info
}

object Info {
  @scala.inline
  def apply(setId: String => Info, setText: String => Info): Info = {
    val __obj = js.Dynamic.literal(setId = js.Any.fromFunction1(setId), setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[Info]
  }
}

