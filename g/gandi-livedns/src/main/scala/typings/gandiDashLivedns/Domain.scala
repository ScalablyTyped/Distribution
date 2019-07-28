package typings.gandiDashLivedns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  var fqdn: String
  var zone_uuid: String
}

object Domain {
  @scala.inline
  def apply(fqdn: String, zone_uuid: String): Domain = {
    val __obj = js.Dynamic.literal(fqdn = fqdn, zone_uuid = zone_uuid)
  
    __obj.asInstanceOf[Domain]
  }
}

