package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a customer-supplied Signing Key used by Cloud CDN Signed URLs
  */
@js.native
trait SchemaSignedUrlKey extends js.Object {
  /**
    * Name of the key. The name must be 1-63 characters long, and comply with
    * RFC1035. Specifically, the name must be 1-63 characters long and match
    * the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
    * character must be a lowercase letter, and all following characters must
    * be a dash, lowercase letter, or digit, except the last character, which
    * cannot be a dash.
    */
  var keyName: js.UndefOr[String] = js.native
  /**
    * 128-bit key value used for signing the URL. The key value must be a valid
    * RFC 4648 Section 5 base64url encoded string.
    */
  var keyValue: js.UndefOr[String] = js.native
}

object SchemaSignedUrlKey {
  @scala.inline
  def apply(keyName: String = null, keyValue: String = null): SchemaSignedUrlKey = {
    val __obj = js.Dynamic.literal()
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSignedUrlKey]
  }
}

