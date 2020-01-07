package typings.googleapis.buildSrcApisDnsV2beta1Mod.dns_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DnsKeysListResponse extends js.Object {
  var dnsKeys: js.UndefOr[js.Array[Schema$DnsKey]] = js.native
  var header: js.UndefOr[Schema$ResponseHeader] = js.native
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$DnsKeysListResponse {
  @scala.inline
  def apply(
    dnsKeys: js.Array[Schema$DnsKey] = null,
    header: Schema$ResponseHeader = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$DnsKeysListResponse = {
    val __obj = js.Dynamic.literal()
    if (dnsKeys != null) __obj.updateDynamic("dnsKeys")(dnsKeys.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DnsKeysListResponse]
  }
}

