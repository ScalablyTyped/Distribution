package typings.firefoxWebextBrowser.browser.geckoProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.geckoProfiler.dumpProfileToFile")
@js.native
object dumpProfileToFile extends js.Object {
  /**
    * Gathers the profile data from the current profiling session, and writes it to disk. The returned promise
    * resolves to a path that locates the created file.
    * @param fileName The name of the file inside the profile/profiler directory
    */
  def apply(fileName: String): js.Promise[_] = js.native
}

