package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleapiUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonResponse extends js.Object {
  var httpStatusCode: js.UndefOr[scala.Double] = js.undefined
  var person: js.UndefOr[Person] = js.undefined
  var requestedResourceName: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[Status] = js.undefined
}

object PersonResponse {
  @scala.inline
  def apply(
    httpStatusCode: scala.Int | scala.Double = null,
    person: Person = null,
    requestedResourceName: java.lang.String = null,
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

