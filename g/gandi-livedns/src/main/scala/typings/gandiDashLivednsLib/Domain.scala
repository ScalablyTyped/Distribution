package typings
package gandiDashLivednsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  var fqdn: java.lang.String
  var zone_uuid: java.lang.String
}

object Domain {
  @scala.inline
  def apply(fqdn: java.lang.String, zone_uuid: java.lang.String): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fqdn")(fqdn)
    __obj.updateDynamic("zone_uuid")(zone_uuid)
    __obj.asInstanceOf[Domain]
  }
}

