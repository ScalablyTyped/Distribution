package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParameters extends js.Object {
  // Query parameters
  var personFields: java.lang.String
  var resourceName: java.lang.String
}

object GetParameters {
  @scala.inline
  def apply(personFields: java.lang.String, resourceName: java.lang.String): GetParameters = {
    val __obj = js.Dynamic.literal(personFields = personFields, resourceName = resourceName)
  
    __obj.asInstanceOf[GetParameters]
  }
}

