package typings
package gapiDotClientDotDnsLib.gapiNs.clientNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRecordSet extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dns#resourceRecordSet". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** For example, www.example.com. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1). */
  var rrdatas: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Number of seconds that this ResourceRecordSet can be cached by resolvers. */
  var ttl: js.UndefOr[scala.Double] = js.undefined
  /** The identifier of a supported record type, for example, A, AAAA, MX, TXT, and so on. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ResourceRecordSet {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    name: java.lang.String = null,
    rrdatas: js.Array[java.lang.String] = null,
    ttl: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): ResourceRecordSet = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rrdatas != null) __obj.updateDynamic("rrdatas")(rrdatas)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResourceRecordSet]
  }
}

