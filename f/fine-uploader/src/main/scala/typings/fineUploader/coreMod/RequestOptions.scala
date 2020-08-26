package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  /**
    * Additional headers sent along with each upload request
    */
  var customHeaders: js.UndefOr[js.Any] = js.native
  /**
    * The endpoint to send upload requests to
    *
    * @default `'/server/upload'`
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * The name of the parameter passed if the original filename has been edited or a `Blob` is being sent
    *
    * @default `'qqfilename'`
    */
  var filenameParam: js.UndefOr[String] = js.native
  /**
    * Force all uploads to use multipart encoding
    *
    * @default `true`
    */
  var forceMultipart: js.UndefOr[Boolean] = js.native
  /**
    * The attribute of the input element which will contain the file name.
    *
    * For non-multipart-encoded upload requests, this will be included as a parameter in the query string of the URI with a value equal to the file name
    *
    * @default `'qqfile'`
    */
  var inputName: js.UndefOr[String] = js.native
  /**
    * Specify a method to use when sending files to a traditional endpoint. This option is ignored in older browsers (such as IE 9 and older)
    *
    * @default `'POST'`
    */
  var method: js.UndefOr[String] = js.native
  /**
    * If set to true, any Fine Uploader created parameters (qq*) will not be sent with the upload request
    * 
    * @default `false`
    */
  var omitDefaultParams: js.UndefOr[Boolean] = js.native
  /**
    * The parameters that shall be sent with each upload request
    */
  var params: js.UndefOr[js.Any] = js.native
  /**
    * Enable or disable sending parameters in the request body.
    *
    * If `false`, parameters are sent in the URL.
    * Otherwise, parameters are sent in the request body
    *
    * @default `true`
    */
  var paramsInBody: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, each upload response MUST contain a JSON message-body with `{success: true}` in order to be considered a success.
    * 
    * If set to false, the success of the request is determined by examining the response status code
    * 
    * @default `true`
    */
  var requireSuccessJson: js.UndefOr[Boolean] = js.native
  /**
    * The name of the parameter passed that specifies the total file size in bytes
    *
    * @default `'qqtotalfilesize'`
    */
  var totalFileSizeName: js.UndefOr[String] = js.native
  /**
    * The name of the parameter the uniquely identifies each associated item. The value is a Level 4 UUID
    *
    * @default `'qquuid'`
    */
  var uuidName: js.UndefOr[String] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
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
    def setCustomHeaders(value: js.Any): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomHeaders: Self = this.set("customHeaders", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setFilenameParam(value: String): Self = this.set("filenameParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilenameParam: Self = this.set("filenameParam", js.undefined)
    @scala.inline
    def setForceMultipart(value: Boolean): Self = this.set("forceMultipart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceMultipart: Self = this.set("forceMultipart", js.undefined)
    @scala.inline
    def setInputName(value: String): Self = this.set("inputName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputName: Self = this.set("inputName", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setOmitDefaultParams(value: Boolean): Self = this.set("omitDefaultParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOmitDefaultParams: Self = this.set("omitDefaultParams", js.undefined)
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setParamsInBody(value: Boolean): Self = this.set("paramsInBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParamsInBody: Self = this.set("paramsInBody", js.undefined)
    @scala.inline
    def setRequireSuccessJson(value: Boolean): Self = this.set("requireSuccessJson", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireSuccessJson: Self = this.set("requireSuccessJson", js.undefined)
    @scala.inline
    def setTotalFileSizeName(value: String): Self = this.set("totalFileSizeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalFileSizeName: Self = this.set("totalFileSizeName", js.undefined)
    @scala.inline
    def setUuidName(value: String): Self = this.set("uuidName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUuidName: Self = this.set("uuidName", js.undefined)
  }
  
}

