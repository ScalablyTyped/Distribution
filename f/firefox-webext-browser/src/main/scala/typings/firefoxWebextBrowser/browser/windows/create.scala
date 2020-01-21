package typings.firefoxWebextBrowser.browser.windows

import typings.firefoxWebextBrowser.AnonAllowScriptsToClose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.windows.create")
@js.native
object create extends js.Object {
  /** Creates (opens) a new browser with any optional sizing, position or default URL provided. */
  def apply(): js.Promise[Window] = js.native
  def apply(createData: AnonAllowScriptsToClose): js.Promise[Window] = js.native
}

