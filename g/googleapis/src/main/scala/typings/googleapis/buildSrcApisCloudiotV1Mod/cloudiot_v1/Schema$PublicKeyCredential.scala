package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A public key format and data.
  */
@js.native
trait Schema$PublicKeyCredential extends js.Object {
  /**
    * The format of the key.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The key data.
    */
  var key: js.UndefOr[String] = js.native
}

object Schema$PublicKeyCredential {
  @scala.inline
  def apply(format: String = null, key: String = null): Schema$PublicKeyCredential = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PublicKeyCredential]
  }
}

