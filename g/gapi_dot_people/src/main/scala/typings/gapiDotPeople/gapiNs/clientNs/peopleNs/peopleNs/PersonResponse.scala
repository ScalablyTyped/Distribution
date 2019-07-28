package typings.gapiDotPeople.gapiNs.clientNs.peopleNs.peopleNs

import typings.gapiDotPeople.gapiNs.clientNs.peopleNs.Person
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonResponse extends js.Object {
  var httpStatusCode: Double
  var person: Person
  var requestedResourceName: String
}

object PersonResponse {
  @scala.inline
  def apply(httpStatusCode: Double, person: Person, requestedResourceName: String): PersonResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode, person = person, requestedResourceName = requestedResourceName)
  
    __obj.asInstanceOf[PersonResponse]
  }
}

