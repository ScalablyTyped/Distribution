package typings
package gandiDashLivednsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneRecord extends js.Object {
  var rrset_name: java.lang.String
  var rrset_ttl: scala.Double
  /**
    * One of A, AAA, CNAME, MX, NS, TXT, WKS, SRV, LOC, SPF, SSHFP, DNAME
    */
  var rrset_type: java.lang.String
  var rrset_values: js.Array[java.lang.String]
}

object ZoneRecord {
  @scala.inline
  def apply(
    rrset_name: java.lang.String,
    rrset_ttl: scala.Double,
    rrset_type: java.lang.String,
    rrset_values: js.Array[java.lang.String]
  ): ZoneRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rrset_name")(rrset_name)
    __obj.updateDynamic("rrset_ttl")(rrset_ttl)
    __obj.updateDynamic("rrset_type")(rrset_type)
    __obj.updateDynamic("rrset_values")(rrset_values)
    __obj.asInstanceOf[ZoneRecord]
  }
}

