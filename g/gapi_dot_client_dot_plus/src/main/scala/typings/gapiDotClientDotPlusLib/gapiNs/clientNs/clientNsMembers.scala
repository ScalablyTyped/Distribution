package typings
package gapiDotClientDotPlusLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val activities: gapiDotClientDotPlusLib.gapiNs.clientNs.plusNs.ActivitiesResource = js.native
  val comments: gapiDotClientDotPlusLib.gapiNs.clientNs.plusNs.CommentsResource = js.native
  val people: gapiDotClientDotPlusLib.gapiNs.clientNs.plusNs.PeopleResource = js.native
  /** Load Google+ API v1 */
  def load(
    name: gapiDotClientDotPlusLib.gapiDotClientDotPlusLibStrings.plus,
    version: gapiDotClientDotPlusLib.gapiDotClientDotPlusLibStrings.v1
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotPlusLib.gapiDotClientDotPlusLibStrings.plus,
    version: gapiDotClientDotPlusLib.gapiDotClientDotPlusLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

