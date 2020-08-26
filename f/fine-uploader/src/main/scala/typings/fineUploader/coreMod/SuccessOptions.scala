package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessOptions extends js.Object {
  /**
    * Endpoint to send a POST after all chunks have been successfully uploaded for each file.
    *
    * Required if the `concurrent.enabled` option is set.
    * 
    * If a function value is provided, the file's ID will be passed when invoking the function
    *
    * @default `null`
    */
  var endpoint: js.UndefOr[String | js.Function] = js.native
  /**
    * Headers to send to with chunking success request. The file's ID will be passed to your provided function
    * 
    * @default `function(fileId) { return null }`
    */
  var headers: js.UndefOr[js.Function] = js.native
  /**
    * Send all parameters in the request body JSON-encoded. Otherwise params will be sent application/x-www-form-urlencoded
    * 
    * @default `false`
    */
  var jsonPayload: js.UndefOr[Boolean] = js.native
  /**
    * HTTP method used when sending the success request
    * 
    * @default `POST`
    */
  var method: js.UndefOr[String] = js.native
  /**
    * Parameters to send in the message body of the success request.  The file's ID will be passed to your provided function
    * 
    * @default `function(fileId) { return null }`
    */
  var params: js.UndefOr[js.Function] = js.native
  /**
    * Fine Uploader will reset the file such that a retry will start at chunk 0 if the success response status matches any of the provided status codes
    * 
    * @default `[]`
    */
  var resetOnStatus: js.UndefOr[js.Array[_]] = js.native
}

object SuccessOptions {
  @scala.inline
  def apply(): SuccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessOptions]
  }
  @scala.inline
  implicit class SuccessOptionsOps[Self <: SuccessOptions] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: String | js.Function): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setHeaders(value: js.Function): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setJsonPayload(value: Boolean): Self = this.set("jsonPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonPayload: Self = this.set("jsonPayload", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setParams(value: js.Function): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setResetOnStatusVarargs(value: js.Any*): Self = this.set("resetOnStatus", js.Array(value :_*))
    @scala.inline
    def setResetOnStatus(value: js.Array[_]): Self = this.set("resetOnStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetOnStatus: Self = this.set("resetOnStatus", js.undefined)
  }
  
}

