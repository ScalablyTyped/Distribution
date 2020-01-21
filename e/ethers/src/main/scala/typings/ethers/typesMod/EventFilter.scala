package typings.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventFilter extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var topics: js.UndefOr[js.Array[String]] = js.undefined
}

object EventFilter {
  @scala.inline
  def apply(address: String = null, topics: js.Array[String] = null): EventFilter = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFilter]
  }
}

