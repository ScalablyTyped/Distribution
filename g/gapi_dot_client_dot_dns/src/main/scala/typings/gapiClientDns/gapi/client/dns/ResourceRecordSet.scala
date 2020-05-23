package typings.gapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRecordSet extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dns#resourceRecordSet". */
  var kind: js.UndefOr[String] = js.undefined
  /** For example, www.example.com. */
  var name: js.UndefOr[String] = js.undefined
  /** As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1). */
  var rrdatas: js.UndefOr[js.Array[String]] = js.undefined
  /** Number of seconds that this ResourceRecordSet can be cached by resolvers. */
  var ttl: js.UndefOr[Double] = js.undefined
  /** The identifier of a supported record type, for example, A, AAAA, MX, TXT, and so on. */
  var `type`: js.UndefOr[String] = js.undefined
}

object ResourceRecordSet {
  @scala.inline
  def apply(
    kind: String = null,
    name: String = null,
    rrdatas: js.Array[String] = null,
    ttl: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): ResourceRecordSet = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rrdatas != null) __obj.updateDynamic("rrdatas")(rrdatas.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRecordSet]
  }
}

