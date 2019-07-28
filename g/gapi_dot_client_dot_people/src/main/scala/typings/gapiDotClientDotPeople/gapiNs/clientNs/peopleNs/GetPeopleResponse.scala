package typings.gapiDotClientDotPeople.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPeopleResponse extends js.Object {
  /** The response for each requested resource name. */
  var responses: js.UndefOr[js.Array[PersonResponse]] = js.undefined
}

object GetPeopleResponse {
  @scala.inline
  def apply(responses: js.Array[PersonResponse] = null): GetPeopleResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses)
    __obj.asInstanceOf[GetPeopleResponse]
  }
}

