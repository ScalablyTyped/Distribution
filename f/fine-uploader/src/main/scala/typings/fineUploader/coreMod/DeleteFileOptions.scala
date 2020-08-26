package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileOptions extends js.Object {
  /**
    * Any additional headers to attach to all delete file requests
    *
    * @default `{}`
    */
  var customHeaders: js.UndefOr[js.Any] = js.native
  /**
    * Enable or disable deletion of uploaded files
    *
    * @default `false`
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The endpoint to which delete file requests are sent.
    *
    * @default `'/server/upload'`
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * Set the method to use for delete requests.
    *
    * Accepts `'POST'` or `'DELETE'`
    *
    * @default `'DELETE'`
    */
  var method: js.UndefOr[String] = js.native
  /**
    * Any additional parameters to attach to delete file requests
    *
    * @default `{}`
    */
  var params: js.UndefOr[js.Any] = js.native
}

object DeleteFileOptions {
  @scala.inline
  def apply(): DeleteFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileOptions]
  }
  @scala.inline
  implicit class DeleteFileOptionsOps[Self <: DeleteFileOptions] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

