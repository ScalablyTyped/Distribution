package typings.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The desired order for a specific property.
  */
@js.native
trait Schema$PropertyOrder extends js.Object {
  /**
    * The direction to order by. Defaults to `ASCENDING`.
    */
  var direction: js.UndefOr[String] = js.native
  /**
    * The property to order by.
    */
  var property: js.UndefOr[Schema$PropertyReference] = js.native
}

object Schema$PropertyOrder {
  @scala.inline
  def apply(direction: String = null, property: Schema$PropertyReference = null): Schema$PropertyOrder = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PropertyOrder]
  }
}

