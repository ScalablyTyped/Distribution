package typings.firefoxWebextBrowser.browser.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* dns types */
/** An object encapsulating a DNS Record. */
@js.native
trait DNSRecord extends js.Object {
  
  var addresses: js.Array[String] = js.native
  
  /**
    * The canonical hostname for this record. this value is empty if the record was not fetched with the 'canonical_name' flag.
    */
  var canonicalName: js.UndefOr[String] = js.native
  
  /** Record retreived with TRR. */
  var isTRR: String = js.native
}
object DNSRecord {
  
  @scala.inline
  def apply(addresses: js.Array[String], isTRR: String): DNSRecord = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], isTRR = isTRR.asInstanceOf[js.Any])
    __obj.asInstanceOf[DNSRecord]
  }
  
  @scala.inline
  implicit class DNSRecordOps[Self <: DNSRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddressesVarargs(value: String*): Self = this.set("addresses", js.Array(value :_*))
    
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTRR(value: String): Self = this.set("isTRR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalName(value: String): Self = this.set("canonicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanonicalName: Self = this.set("canonicalName", js.undefined)
  }
}
