package typings.fineUploader.s3Mod.s3

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3CredentialsOptions extends js.Object {
  /**
    * Temporary public AWS key
    *
    * @default `null`
    */
  var accessKey: js.UndefOr[String] = js.native
  /**
    * Expiration date for temporary credentials. May be an ISO 8601 String or a `Date` object.
    *
    * @default `null`
    */
  var expiration: js.UndefOr[String | Date] = js.native
  /**
    * Temporary secret AWS key
    *
    * @default `null`
    */
  var secretKey: js.UndefOr[String] = js.native
  /**
    * Session token associated with the temporary credentials
    *
    * @default `null`
    */
  var sessionToken: js.UndefOr[String] = js.native
}

object S3CredentialsOptions {
  @scala.inline
  def apply(): S3CredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3CredentialsOptions]
  }
  @scala.inline
  implicit class S3CredentialsOptionsOps[Self <: S3CredentialsOptions] (val x: Self) extends AnyVal {
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
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    @scala.inline
    def setExpiration(value: String | Date): Self = this.set("expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    @scala.inline
    def setSecretKey(value: String): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretKey: Self = this.set("secretKey", js.undefined)
    @scala.inline
    def setSessionToken(value: String): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionToken: Self = this.set("sessionToken", js.undefined)
  }
  
}

