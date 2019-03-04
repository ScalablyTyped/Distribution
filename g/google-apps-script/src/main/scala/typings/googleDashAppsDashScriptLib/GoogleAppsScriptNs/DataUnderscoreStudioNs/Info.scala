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
  def apply(setId: js.Function1[java.lang.String, Info], setText: js.Function1[java.lang.String, Info]): Info = {
    val __obj = js.Dynamic.literal(setId = setId, setText = setText)
  
    __obj.asInstanceOf[Info]
  }
}

