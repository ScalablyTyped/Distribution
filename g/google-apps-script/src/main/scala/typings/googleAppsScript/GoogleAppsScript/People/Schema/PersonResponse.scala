package typings.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonResponse extends js.Object {
  var httpStatusCode: js.UndefOr[Double] = js.native
  var person: js.UndefOr[Person] = js.native
  var requestedResourceName: js.UndefOr[String] = js.native
  var status: js.UndefOr[Status] = js.native
}

object PersonResponse {
  @scala.inline
  def apply(): PersonResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonResponse]
  }
  @scala.inline
  implicit class PersonResponseOps[Self <: PersonResponse] (val x: Self) extends AnyVal {
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
    def setHttpStatusCode(value: Double): Self = this.set("httpStatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpStatusCode: Self = this.set("httpStatusCode", js.undefined)
    @scala.inline
    def setPerson(value: Person): Self = this.set("person", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerson: Self = this.set("person", js.undefined)
    @scala.inline
    def setRequestedResourceName(value: String): Self = this.set("requestedResourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedResourceName: Self = this.set("requestedResourceName", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

