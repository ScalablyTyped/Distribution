package typings
package atGoogleDashCloudDatastoreLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderOptions extends js.Object {
  var descending: scala.Boolean
}

object OrderOptions {
  @scala.inline
  def apply(descending: scala.Boolean): OrderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("descending")(descending)
    __obj.asInstanceOf[OrderOptions]
  }
}

