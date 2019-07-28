package typings.gapiDotClientDotFirebasedynamiclinks.gapiNs.clientNs

import typings.gapiDotClientDotFirebasedynamiclinks.gapiDotClientDotFirebasedynamiclinksStrings.firebasedynamiclinks
import typings.gapiDotClientDotFirebasedynamiclinks.gapiNs.clientNs.firebasedynamiclinksNs.ShortLinksResource
import typings.gapiDotClientDotFirebasedynamiclinks.gapiNs.clientNs.firebasedynamiclinksNs.V1Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val shortLinks: ShortLinksResource = js.native
  val v1: V1Resource = js.native
  /** Load Firebase Dynamic Links API v1 */
  def load(
    name: firebasedynamiclinks,
    version: typings.gapiDotClientDotFirebasedynamiclinks.gapiDotClientDotFirebasedynamiclinksStrings.v1
  ): js.Thenable[Unit] = js.native
  def load(
    name: firebasedynamiclinks,
    version: typings.gapiDotClientDotFirebasedynamiclinks.gapiDotClientDotFirebasedynamiclinksStrings.v1,
    callback: js.Function0[_]
  ): Unit = js.native
}

