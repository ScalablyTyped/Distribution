package typings.firefoxWebextBrowser.browser.windows

import typings.firefoxWebextBrowser.AnonDrawAttention
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.windows.update")
@js.native
object update extends js.Object {
  /**
    * Updates the properties of a window. Specify only the properties that you want to change; unspecified properties
    * will be left unchanged.
    */
  def apply(windowId: Double, updateInfo: AnonDrawAttention): js.Promise[Window] = js.native
}

