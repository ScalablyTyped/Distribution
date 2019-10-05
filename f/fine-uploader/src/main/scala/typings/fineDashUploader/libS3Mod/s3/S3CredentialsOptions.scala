package typings.fineDashUploader.libS3Mod.s3

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3CredentialsOptions extends js.Object {
  /**
    * Temporary public AWS key
    *
    * @default `null`
    */
  var accessKey: js.UndefOr[String] = js.undefined
  /**
    * Expiration date for temporary credentials. May be an ISO 8601 String or a `Date` object.
    *
    * @default `null`
    */
  var expiration: js.UndefOr[String | Date] = js.undefined
  /**
    * Temporary secret AWS key
    *
    * @default `null`
    */
  var secretKey: js.UndefOr[String] = js.undefined
  /**
    * Session token associated with the temporary credentials
    *
    * @default `null`
    */
  var sessionToken: js.UndefOr[String] = js.undefined
}

object S3CredentialsOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    expiration: String | Date = null,
    secretKey: String = null,
    sessionToken: String = null
  ): S3CredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey)
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    __obj.asInstanceOf[S3CredentialsOptions]
  }
}

