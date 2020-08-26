package typings.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure of the response from the FHIR server
  */
@js.native
trait Response extends js.Object {
  /**
    * Contains state information. Url, type, server configuration used, Id etc
    */
  var config: js.UndefOr[js.Any] = js.native
  /**
    * Data returned from the FHIR server
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * Error object returned by the client library.
    */
  var error: js.UndefOr[js.Any] = js.native
  /**
    * HTTP Response headers
    */
  var headers: js.UndefOr[js.Any] = js.native
  /**
    * HTTP Status code string
    */
  var status: js.UndefOr[js.Any] = js.native
}

object Response {
  @scala.inline
  def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
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
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setStatus(value: js.Any): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

