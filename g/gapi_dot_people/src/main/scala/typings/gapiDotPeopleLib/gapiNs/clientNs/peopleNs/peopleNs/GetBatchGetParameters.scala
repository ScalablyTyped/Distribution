package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBatchGetParameters extends js.Object {
  var personFields: java.lang.String
  // Query parameters
  var resourcesName: js.UndefOr[java.lang.String] = js.undefined
}

object GetBatchGetParameters {
  @scala.inline
  def apply(personFields: java.lang.String, resourcesName: java.lang.String = null): GetBatchGetParameters = {
    val __obj = js.Dynamic.literal(personFields = personFields)
    if (resourcesName != null) __obj.updateDynamic("resourcesName")(resourcesName)
    __obj.asInstanceOf[GetBatchGetParameters]
  }
}

