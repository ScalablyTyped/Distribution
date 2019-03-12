package typings
package gapiDotPlusLib.gapiNs.clientNs.plusNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.plus.people")
@js.native
object ^ extends js.Object {
  def get(parameters: GetParameters): gapiLib.gapiNs.clientNs.HttpRequest[Person] = js.native
  def search(parameters: SearchParameters): gapiLib.gapiNs.clientNs.HttpRequest[PeopleFeed] = js.native
}

