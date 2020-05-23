package typings.googleAppsScript.GoogleAppsScript.People.Schema

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
    httpStatusCode: js.UndefOr[Double] = js.undefined,
    person: Person = null,
    requestedResourceName: String = null,
    status: Status = null
  ): PersonResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(httpStatusCode)) __obj.updateDynamic("httpStatusCode")(httpStatusCode.get.asInstanceOf[js.Any])
    if (person != null) __obj.updateDynamic("person")(person.asInstanceOf[js.Any])
    if (requestedResourceName != null) __obj.updateDynamic("requestedResourceName")(requestedResourceName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonResponse]
  }
}

