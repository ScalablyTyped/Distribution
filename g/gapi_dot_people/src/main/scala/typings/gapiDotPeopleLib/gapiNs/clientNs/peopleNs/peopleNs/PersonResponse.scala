package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonResponse extends js.Object {
  var httpStatusCode: scala.Double
  var person: gapiDotPeopleLib.gapiNs.clientNs.peopleNs.Person
  var requestedResourceName: java.lang.String
}

object PersonResponse {
  @scala.inline
  def apply(
    httpStatusCode: scala.Double,
    person: gapiDotPeopleLib.gapiNs.clientNs.peopleNs.Person,
    requestedResourceName: java.lang.String
  ): PersonResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode, person = person, requestedResourceName = requestedResourceName)
  
    __obj.asInstanceOf[PersonResponse]
  }
}

