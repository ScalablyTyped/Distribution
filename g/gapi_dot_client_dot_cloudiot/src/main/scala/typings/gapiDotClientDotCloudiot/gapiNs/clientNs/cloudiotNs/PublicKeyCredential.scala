package typings.gapiDotClientDotCloudiot.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyCredential extends js.Object {
  /** The format of the key. */
  var format: js.UndefOr[String] = js.undefined
  /** The key data. */
  var key: js.UndefOr[String] = js.undefined
}

object PublicKeyCredential {
  @scala.inline
  def apply(format: String = null, key: String = null): PublicKeyCredential = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[PublicKeyCredential]
  }
}

