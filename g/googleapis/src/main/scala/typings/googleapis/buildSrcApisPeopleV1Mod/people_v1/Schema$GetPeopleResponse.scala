package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GetPeopleResponse extends js.Object {
  /**
    * The response for each requested resource name.
    */
  var responses: js.UndefOr[js.Array[Schema$PersonResponse]] = js.native
}

object Schema$GetPeopleResponse {
  @scala.inline
  def apply(responses: js.Array[Schema$PersonResponse] = null): Schema$GetPeopleResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetPeopleResponse]
  }
}

