package typings.gapiDotClientDotPlus.gapiNs.clientNs

import typings.gapiDotClientDotPlus.gapiDotClientDotPlusStrings.plus
import typings.gapiDotClientDotPlus.gapiDotClientDotPlusStrings.v1
import typings.gapiDotClientDotPlus.gapiNs.clientNs.plusNs.ActivitiesResource
import typings.gapiDotClientDotPlus.gapiNs.clientNs.plusNs.CommentsResource
import typings.gapiDotClientDotPlus.gapiNs.clientNs.plusNs.PeopleResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val activities: ActivitiesResource = js.native
  val comments: CommentsResource = js.native
  val people: PeopleResource = js.native
  /** Load Google+ API v1 */
  def load(name: plus, version: v1): js.Thenable[Unit] = js.native
  def load(name: plus, version: v1, callback: js.Function0[_]): Unit = js.native
}

