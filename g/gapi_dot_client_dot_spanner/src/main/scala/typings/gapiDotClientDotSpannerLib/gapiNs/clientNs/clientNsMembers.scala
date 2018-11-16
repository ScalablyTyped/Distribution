package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val projects: gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs.ProjectsResource = js.native
  /** Load Cloud Spanner API v1 */
  def load(
    name: gapiDotClientDotSpannerLib.gapiDotClientDotSpannerLibStrings.spanner,
    version: gapiDotClientDotSpannerLib.gapiDotClientDotSpannerLibStrings.v1
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotSpannerLib.gapiDotClientDotSpannerLibStrings.spanner,
    version: gapiDotClientDotSpannerLib.gapiDotClientDotSpannerLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

