package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to a batch get contact groups request.
  */
@js.native
trait Schema$BatchGetContactGroupsResponse extends js.Object {
  /**
    * The list of responses for each requested contact group resource.
    */
  var responses: js.UndefOr[js.Array[Schema$ContactGroupResponse]] = js.native
}

object Schema$BatchGetContactGroupsResponse {
  @scala.inline
  def apply(responses: js.Array[Schema$ContactGroupResponse] = null): Schema$BatchGetContactGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchGetContactGroupsResponse]
  }
}

