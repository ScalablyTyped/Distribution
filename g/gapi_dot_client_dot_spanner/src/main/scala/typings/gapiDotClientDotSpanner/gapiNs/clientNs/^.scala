package typings.gapiDotClientDotSpanner.gapiNs.clientNs

import typings.gapiDotClientDotSpanner.gapiDotClientDotSpannerStrings.spanner
import typings.gapiDotClientDotSpanner.gapiDotClientDotSpannerStrings.v1
import typings.gapiDotClientDotSpanner.gapiNs.clientNs.spannerNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  /** Load Cloud Spanner API v1 */
  def load(name: spanner, version: v1): js.Thenable[Unit] = js.native
  def load(name: spanner, version: v1, callback: js.Function0[_]): Unit = js.native
}

