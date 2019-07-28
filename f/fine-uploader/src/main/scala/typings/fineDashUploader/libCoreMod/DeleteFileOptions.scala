package typings.fineDashUploader.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileOptions extends js.Object {
  /**
    * Any additional headers to attach to all delete file requests
    *
    * @default `{}`
    */
  var customHeaders: js.UndefOr[js.Any] = js.undefined
  /**
    * Enable or disable deletion of uploaded files
    *
    * @default `false`
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The endpoint to which delete file requests are sent.
    *
    * @default `'/server/upload'`
    */
  var endpoint: js.UndefOr[String] = js.undefined
  /**
    * Set the method to use for delete requests.
    *
    * Accepts `'POST'` or `'DELETE'`
    *
    * @default `'DELETE'`
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * Any additional parameters to attach to delete file requests
    *
    * @default `{}`
    */
  var params: js.UndefOr[js.Any] = js.undefined
}

object DeleteFileOptions {
  @scala.inline
  def apply(
    customHeaders: js.Any = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    endpoint: String = null,
    method: String = null,
    params: js.Any = null
  ): DeleteFileOptions = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (method != null) __obj.updateDynamic("method")(method)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[DeleteFileOptions]
  }
}

