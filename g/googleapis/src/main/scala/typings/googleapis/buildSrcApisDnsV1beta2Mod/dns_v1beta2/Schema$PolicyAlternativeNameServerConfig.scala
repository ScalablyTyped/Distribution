package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PolicyAlternativeNameServerConfig extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#policyAlternativeNameServerConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var targetNameServers: js.UndefOr[js.Array[Schema$PolicyAlternativeNameServerConfigTargetNameServer]] = js.native
}

object Schema$PolicyAlternativeNameServerConfig {
  @scala.inline
  def apply(
    kind: String = null,
    targetNameServers: js.Array[Schema$PolicyAlternativeNameServerConfigTargetNameServer] = null
  ): Schema$PolicyAlternativeNameServerConfig = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (targetNameServers != null) __obj.updateDynamic("targetNameServers")(targetNameServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PolicyAlternativeNameServerConfig]
  }
}

