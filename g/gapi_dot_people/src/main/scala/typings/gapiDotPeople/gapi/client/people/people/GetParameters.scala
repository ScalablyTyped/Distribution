package typings.gapiDotPeople.gapi.client.people.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParameters extends js.Object {
  // Query parameters
  var personFields: String
  var resourceName: String
}

object GetParameters {
  @scala.inline
  def apply(personFields: String, resourceName: String): GetParameters = {
    val __obj = js.Dynamic.literal(personFields = personFields.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetParameters]
  }
}

