package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLookupGroupNameResponse extends js.Object {
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Group in the format: `groups/{group_id}`, where `group_id` is the
    * unique id assigned to the Group.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaLookupGroupNameResponse {
  @scala.inline
  def apply(name: String = null): SchemaLookupGroupNameResponse = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLookupGroupNameResponse]
  }
}

