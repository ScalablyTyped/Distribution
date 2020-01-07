package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DnsKey extends js.Object {
  var algorithm: js.UndefOr[String] = js.native
  var creationTime: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var digests: js.UndefOr[js.Array[Schema$DnsKeyDigest]] = js.native
  var id: js.UndefOr[String] = js.native
  var isActive: js.UndefOr[Boolean] = js.native
  var keyLength: js.UndefOr[Double] = js.native
  var keyTag: js.UndefOr[Double] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#dnsKey&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var publicKey: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Schema$DnsKey {
  @scala.inline
  def apply(
    algorithm: String = null,
    creationTime: String = null,
    description: String = null,
    digests: js.Array[Schema$DnsKeyDigest] = null,
    id: String = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    keyLength: Int | Double = null,
    keyTag: Int | Double = null,
    kind: String = null,
    publicKey: String = null,
    `type`: String = null
  ): Schema$DnsKey = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (digests != null) __obj.updateDynamic("digests")(digests.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    if (keyTag != null) __obj.updateDynamic("keyTag")(keyTag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DnsKey]
  }
}

