package typings.gapiDotClientDotDatastore.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyOrder extends js.Object {
  /** The direction to order by. Defaults to `ASCENDING`. */
  var direction: js.UndefOr[String] = js.undefined
  /** The property to order by. */
  var property: js.UndefOr[PropertyReference] = js.undefined
}

object PropertyOrder {
  @scala.inline
  def apply(direction: String = null, property: PropertyReference = null): PropertyOrder = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (property != null) __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[PropertyOrder]
  }
}

