package typings
package gapiDotClientDotKgsearchLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val entities: gapiDotClientDotKgsearchLib.gapiNs.clientNs.kgsearchNs.EntitiesResource = js.native
  /** Load Knowledge Graph Search API v1 */
  def load(
    name: gapiDotClientDotKgsearchLib.gapiDotClientDotKgsearchLibStrings.kgsearch,
    version: gapiDotClientDotKgsearchLib.gapiDotClientDotKgsearchLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotKgsearchLib.gapiDotClientDotKgsearchLibStrings.kgsearch,
    version: gapiDotClientDotKgsearchLib.gapiDotClientDotKgsearchLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

