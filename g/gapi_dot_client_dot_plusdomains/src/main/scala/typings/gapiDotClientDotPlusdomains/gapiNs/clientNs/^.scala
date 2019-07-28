package typings.gapiDotClientDotPlusdomains.gapiNs.clientNs

import typings.gapiDotClientDotPlusdomains.gapiDotClientDotPlusdomainsStrings.plusdomains
import typings.gapiDotClientDotPlusdomains.gapiDotClientDotPlusdomainsStrings.v1
import typings.gapiDotClientDotPlusdomains.gapiNs.clientNs.plusdomainsNs.ActivitiesResource
import typings.gapiDotClientDotPlusdomains.gapiNs.clientNs.plusdomainsNs.AudiencesResource
import typings.gapiDotClientDotPlusdomains.gapiNs.clientNs.plusdomainsNs.CirclesResource
import typings.gapiDotClientDotPlusdomains.gapiNs.clientNs.plusdomainsNs.CommentsResource
import typings.gapiDotClientDotPlusdomains.gapiNs.clientNs.plusdomainsNs.MediaResource
import typings.gapiDotClientDotPlusdomains.gapiNs.clientNs.plusdomainsNs.PeopleResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val activities: ActivitiesResource = js.native
  val audiences: AudiencesResource = js.native
  val circles: CirclesResource = js.native
  val comments: CommentsResource = js.native
  val media: MediaResource = js.native
  val people: PeopleResource = js.native
  /** Load Google+ Domains API v1 */
  def load(name: plusdomains, version: v1): js.Thenable[Unit] = js.native
  def load(name: plusdomains, version: v1, callback: js.Function0[_]): Unit = js.native
}

