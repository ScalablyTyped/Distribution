package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DnsKeyDigest extends js.Object {
  var digest: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Schema$DnsKeyDigest {
  @scala.inline
  def apply(digest: String = null, `type`: String = null): Schema$DnsKeyDigest = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DnsKeyDigest]
  }
}

