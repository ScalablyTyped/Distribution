package typings.gapiPeople.gapi.client.people.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBatchGetParameters extends js.Object {
  var personFields: String = js.native
  // Query parameters
  var resourcesName: js.UndefOr[String] = js.native
}

object GetBatchGetParameters {
  @scala.inline
  def apply(personFields: String): GetBatchGetParameters = {
    val __obj = js.Dynamic.literal(personFields = personFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBatchGetParameters]
  }
  @scala.inline
  implicit class GetBatchGetParametersOps[Self <: GetBatchGetParameters] (val x: Self) extends AnyVal {
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
    def setPersonFields(value: String): Self = this.set("personFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcesName(value: String): Self = this.set("resourcesName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourcesName: Self = this.set("resourcesName", js.undefined)
  }
  
}

