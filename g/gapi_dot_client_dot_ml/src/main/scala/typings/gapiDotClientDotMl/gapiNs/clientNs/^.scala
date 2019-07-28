package typings.gapiDotClientDotMl.gapiNs.clientNs

import typings.gapiDotClientDotMl.gapiDotClientDotMlStrings.ml
import typings.gapiDotClientDotMl.gapiDotClientDotMlStrings.v1
import typings.gapiDotClientDotMl.gapiNs.clientNs.mlNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  /** Load Google Cloud Machine Learning Engine v1 */
  def load(name: ml, version: v1): js.Thenable[Unit] = js.native
  def load(name: ml, version: v1, callback: js.Function0[_]): Unit = js.native
}

