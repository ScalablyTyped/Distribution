package typings.firefoxWebextBrowser.browser.devtools.panels

import typings.firefoxWebextBrowser.browser.devtools.inspectedWindow.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.devtools.panels.setOpenResourceHandler")
@js.native
object setOpenResourceHandler extends js.Object {
  /**
    * Specifies the function to be called when the user clicks a resource link in the Developer Tools window. To unset
    * the handler, either call the method with no parameters or pass null as the parameter.
    * @deprecated Unsupported on Firefox at this time.
    */
  def apply(): js.Promise[Resource] = js.native
}

