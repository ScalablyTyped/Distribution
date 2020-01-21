package typings.gapiPeople.gapi.client.people.people

import typings.gapiPeople.gapi.client.people.Person
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
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], person = person.asInstanceOf[js.Any], requestedResourceName = requestedResourceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PersonResponse]
  }
}

