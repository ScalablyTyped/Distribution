package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  def setId(id: java.lang.String): Info
  def setText(text: java.lang.String): Info
}

object Info {
  @scala.inline
  def apply(setId: java.lang.String => Info, setText: java.lang.String => Info): Info = {
    val __obj = js.Dynamic.literal(setId = js.Any.fromFunction1(setId), setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[Info]
  }
}

