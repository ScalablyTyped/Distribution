package typings.fineUploader.s3Mod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3SignatureOptions extends js.Object {
  /**
    * Additional headers sent along with each signature request.
    *
    * If you declare a function as the value, the associated file's ID will be passed to your function when it is invoked
    *
    * @default `{}`
    */
  var customHeaders: js.UndefOr[js.Any | S3CustomHeaderFunction] = js.undefined
  /**
    * The endpoint that Fine Uploader can use to send policy documents (HTML form uploads) or other strings to sign (REST requests) before sending requests off to S3
    *
    * @default `null`
    */
  var endpoint: js.UndefOr[String] = js.undefined
  /**
    * The AWS/S3 signature version to use. Currently supported values are `2` and `4`. Directly related to `objectProperties.region`
    *
    * @default `2`
    */
  var version: js.UndefOr[Double] = js.undefined
}

object S3SignatureOptions {
  @scala.inline
  def apply(
    customHeaders: js.Any | S3CustomHeaderFunction = null,
    endpoint: String = null,
    version: Int | Double = null
  ): S3SignatureOptions = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SignatureOptions]
  }
}

