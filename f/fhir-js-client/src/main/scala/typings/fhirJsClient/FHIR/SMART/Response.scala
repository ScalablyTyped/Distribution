package typings.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure of the response from the FHIR server
  */
trait Response extends js.Object {
  /**
    * Contains state information. Url, type, server configuration used, Id etc
    */
  var config: js.UndefOr[js.Any] = js.undefined
  /**
    * Data returned from the FHIR server
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Error object returned by the client library.
    */
  var error: js.UndefOr[js.Any] = js.undefined
  /**
    * HTTP Response headers
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  /**
    * HTTP Status code string
    */
  var status: js.UndefOr[js.Any] = js.undefined
}

object Response {
  @scala.inline
  def apply(
    config: js.Any = null,
    data: js.Any = null,
    error: js.Any = null,
    headers: js.Any = null,
    status: js.Any = null
  ): Response = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

