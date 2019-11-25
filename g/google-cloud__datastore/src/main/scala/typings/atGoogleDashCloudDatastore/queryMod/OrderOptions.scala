package typings.atGoogleDashCloudDatastore.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderOptions extends js.Object {
  var descending: Boolean
}

object OrderOptions {
  @scala.inline
  def apply(descending: Boolean): OrderOptions = {
    val __obj = js.Dynamic.literal(descending = descending.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrderOptions]
  }
}

