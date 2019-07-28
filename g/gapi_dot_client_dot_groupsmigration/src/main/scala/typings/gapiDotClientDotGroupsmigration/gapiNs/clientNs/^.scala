package typings.gapiDotClientDotGroupsmigration.gapiNs.clientNs

import typings.gapiDotClientDotGroupsmigration.gapiDotClientDotGroupsmigrationStrings.groupsmigration
import typings.gapiDotClientDotGroupsmigration.gapiDotClientDotGroupsmigrationStrings.v1
import typings.gapiDotClientDotGroupsmigration.gapiNs.clientNs.groupsmigrationNs.ArchiveResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val archive: ArchiveResource = js.native
  /** Load Groups Migration API v1 */
  def load(name: groupsmigration, version: v1): js.Thenable[Unit] = js.native
  def load(name: groupsmigration, version: v1, callback: js.Function0[_]): Unit = js.native
}

