package typings.firefoxWebextBrowser.browser.normandyAddonStudy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.normandyAddonStudy.endStudy")
@js.native
object endStudy extends js.Object {
  /**
    * Marks the study as ended and then uninstalls the addon.
    * @param reason The reason why the study is ending.
    */
  def apply(reason: String): js.Promise[_] = js.native
}

