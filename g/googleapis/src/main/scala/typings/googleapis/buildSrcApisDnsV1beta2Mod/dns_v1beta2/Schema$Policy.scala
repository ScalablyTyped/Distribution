package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Policy extends js.Object {
  var alternativeNameServerConfig: js.UndefOr[Schema$PolicyAlternativeNameServerConfig] = js.native
  var description: js.UndefOr[String] = js.native
  var enableInboundForwarding: js.UndefOr[Boolean] = js.native
  var enableLogging: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#policy&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var networks: js.UndefOr[js.Array[Schema$PolicyNetwork]] = js.native
}

object Schema$Policy {
  @scala.inline
  def apply(
    alternativeNameServerConfig: Schema$PolicyAlternativeNameServerConfig = null,
    description: String = null,
    enableInboundForwarding: js.UndefOr[Boolean] = js.undefined,
    enableLogging: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    name: String = null,
    networks: js.Array[Schema$PolicyNetwork] = null
  ): Schema$Policy = {
    val __obj = js.Dynamic.literal()
    if (alternativeNameServerConfig != null) __obj.updateDynamic("alternativeNameServerConfig")(alternativeNameServerConfig.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enableInboundForwarding)) __obj.updateDynamic("enableInboundForwarding")(enableInboundForwarding.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLogging)) __obj.updateDynamic("enableLogging")(enableLogging.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (networks != null) __obj.updateDynamic("networks")(networks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Policy]
  }
}

