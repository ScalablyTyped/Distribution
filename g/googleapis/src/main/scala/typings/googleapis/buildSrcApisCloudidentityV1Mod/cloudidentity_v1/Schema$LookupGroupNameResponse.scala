package typings.googleapis.buildSrcApisCloudidentityV1Mod.cloudidentity_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LookupGroupNameResponse extends js.Object {
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Group in the format: `groups/{group_id}`, where `group_id` is the
    * unique ID assigned to the Group.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$LookupGroupNameResponse {
  @scala.inline
  def apply(name: String = null): Schema$LookupGroupNameResponse = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LookupGroupNameResponse]
  }
}

