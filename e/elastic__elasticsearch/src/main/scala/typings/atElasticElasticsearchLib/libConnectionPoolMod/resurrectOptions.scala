package typings
package atElasticElasticsearchLib.libConnectionPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait resurrectOptions extends js.Object {
  var name: java.lang.String
  var now: js.UndefOr[scala.Double] = js.undefined
  var requestId: java.lang.String
}

object resurrectOptions {
  @scala.inline
  def apply(name: java.lang.String, requestId: java.lang.String, now: scala.Int | scala.Double = null): resurrectOptions = {
    val __obj = js.Dynamic.literal(name = name, requestId = requestId)
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    __obj.asInstanceOf[resurrectOptions]
  }
}

