package typings.googleDashAppsDashScript.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonResponse extends js.Object {
  var httpStatusCode: js.UndefOr[Double] = js.undefined
  var person: js.UndefOr[Person] = js.undefined
  var requestedResourceName: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Status] = js.undefined
}

object PersonResponse {
  @scala.inline
  def apply(
    httpStatusCode: Int | Double = null,
    person: Person = null,
    requestedResourceName: String = null,
    status: Status = null
  ): PersonResponse = {
    val __obj = js.Dynamic.literal()
    if (httpStatusCode != null) __obj.updateDynamic("httpStatusCode")(httpStatusCode.asInstanceOf[js.Any])
    if (person != null) __obj.updateDynamic("person")(person)
    if (requestedResourceName != null) __obj.updateDynamic("requestedResourceName")(requestedResourceName)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[PersonResponse]
  }
}

