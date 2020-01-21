package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data hosted at an external location. The data is to be downloaded by
  * Android Device Policy and verified against the hash.
  */
@js.native
trait SchemaExternalData extends js.Object {
  /**
    * The base-64 encoded SHA-256 hash of the content hosted at url. If the
    * content doesn&#39;t match this hash, Android Device Policy won&#39;t use
    * the data.
    */
  var sha256Hash: js.UndefOr[String] = js.native
  /**
    * The absolute URL to the data, which must use either the http or https
    * scheme. Android Device Policy doesn&#39;t provide any credentials in the
    * GET request, so the URL must be publicly accessible. Including a long,
    * random component in the URL may be used to prevent attackers from
    * discovering the URL.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaExternalData {
  @scala.inline
  def apply(sha256Hash: String = null, url: String = null): SchemaExternalData = {
    val __obj = js.Dynamic.literal()
    if (sha256Hash != null) __obj.updateDynamic("sha256Hash")(sha256Hash.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExternalData]
  }
}

