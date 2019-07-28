package typings.gapiDotPlus.gapiNs.clientNs.plusNs.peopleNs

import typings.gapi.gapiNs.clientNs.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.plus.people")
@js.native
object ^ extends js.Object {
  def get(parameters: GetParameters): HttpRequest[Person] = js.native
  def search(parameters: SearchParameters): HttpRequest[PeopleFeed] = js.native
}

