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
  def apply(): SchemaLookupGroupNameResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupGroupNameResponse]
  }
  @scala.inline
  implicit class SchemaLookupGroupNameResponseOps[Self <: SchemaLookupGroupNameResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

