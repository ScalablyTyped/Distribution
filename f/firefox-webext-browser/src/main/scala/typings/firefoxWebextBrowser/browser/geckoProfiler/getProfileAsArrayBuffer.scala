package typings.firefoxWebextBrowser.browser.geckoProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.geckoProfiler.getProfileAsArrayBuffer")
@js.native
object getProfileAsArrayBuffer extends js.Object {
  /**
    * Gathers the profile data from the current profiling session. The returned promise resolves to an array buffer
    * that contains a JSON string.
    */
  def apply(): js.Promise[_] = js.native
}

