package typings.gapiDotPeople.gapiNs.clientNs.peopleNs.peopleNs

import typings.gapi.gapiNs.clientNs.HttpRequest
import typings.gapiDotPeople.gapiNs.clientNs.peopleNs.Person
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.people.people")
@js.native
object ^ extends js.Object {
  def get(parameters: GetParameters): HttpRequest[Person] = js.native
  def getBatchGet(parameters: GetBatchGetParameters): HttpRequest[BatchGetResponse] = js.native
}

