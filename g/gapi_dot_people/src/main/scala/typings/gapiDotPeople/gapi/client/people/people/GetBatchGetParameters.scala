package typings.gapiDotPeople.gapi.client.people.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBatchGetParameters extends js.Object {
  var personFields: String
  // Query parameters
  var resourcesName: js.UndefOr[String] = js.undefined
}

object GetBatchGetParameters {
  @scala.inline
  def apply(personFields: String, resourcesName: String = null): GetBatchGetParameters = {
    val __obj = js.Dynamic.literal(personFields = personFields)
    if (resourcesName != null) __obj.updateDynamic("resourcesName")(resourcesName)
    __obj.asInstanceOf[GetBatchGetParameters]
  }
}

