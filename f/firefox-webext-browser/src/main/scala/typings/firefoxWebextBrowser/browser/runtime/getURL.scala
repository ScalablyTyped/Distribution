package typings.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.runtime.getURL")
@js.native
object getURL extends js.Object {
  /**
    * Converts a relative path within an app/extension install directory to a fully-qualified URL.
    * @param path A path to a resource within an app/extension expressed relative to its install directory.
    * @returns The fully-qualified URL to the resource.
    */
  def apply(path: String): String = js.native
}

