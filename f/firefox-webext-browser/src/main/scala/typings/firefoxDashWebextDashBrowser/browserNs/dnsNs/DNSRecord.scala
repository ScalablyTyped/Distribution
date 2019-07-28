package typings.firefoxDashWebextDashBrowser.browserNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* dns types */
/** An object encapsulating a DNS Record. */
trait DNSRecord extends js.Object {
  var addresses: js.Array[String]
  /**
    * The canonical hostname for this record. this value is empty if the record was not fetched with the
    * 'canonical_name' flag.
    */
  var canonicalName: js.UndefOr[String] = js.undefined
  /** Record retreived with TRR. */
  var isTRR: String
}

object DNSRecord {
  @scala.inline
  def apply(addresses: js.Array[String], isTRR: String, canonicalName: String = null): DNSRecord = {
    val __obj = js.Dynamic.literal(addresses = addresses, isTRR = isTRR)
    if (canonicalName != null) __obj.updateDynamic("canonicalName")(canonicalName)
    __obj.asInstanceOf[DNSRecord]
  }
}

