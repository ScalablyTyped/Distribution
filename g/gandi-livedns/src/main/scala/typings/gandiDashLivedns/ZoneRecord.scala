package typings.gandiDashLivedns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneRecord extends js.Object {
  var rrset_name: String
  var rrset_ttl: Double
  /**
    * One of A, AAA, CNAME, MX, NS, TXT, WKS, SRV, LOC, SPF, SSHFP, DNAME
    */
  var rrset_type: String
  var rrset_values: js.Array[String]
}

object ZoneRecord {
  @scala.inline
  def apply(rrset_name: String, rrset_ttl: Double, rrset_type: String, rrset_values: js.Array[String]): ZoneRecord = {
    val __obj = js.Dynamic.literal(rrset_name = rrset_name, rrset_ttl = rrset_ttl, rrset_type = rrset_type, rrset_values = rrset_values)
  
    __obj.asInstanceOf[ZoneRecord]
  }
}

