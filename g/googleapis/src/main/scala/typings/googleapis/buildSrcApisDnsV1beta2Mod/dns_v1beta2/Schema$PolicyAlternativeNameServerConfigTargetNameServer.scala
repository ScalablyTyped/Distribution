package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PolicyAlternativeNameServerConfigTargetNameServer extends js.Object {
  var ipv4Address: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#policyAlternativeNameServerConfigTargetNameServer&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$PolicyAlternativeNameServerConfigTargetNameServer {
  @scala.inline
  def apply(ipv4Address: String = null, kind: String = null): Schema$PolicyAlternativeNameServerConfigTargetNameServer = {
    val __obj = js.Dynamic.literal()
    if (ipv4Address != null) __obj.updateDynamic("ipv4Address")(ipv4Address.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PolicyAlternativeNameServerConfigTargetNameServer]
  }
}

