package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AllocationAffinity is the configuration of desired allocation which this
  * instance could take capacity from.
  */
@js.native
trait SchemaReservationAffinity extends js.Object {
  var consumeReservationType: js.UndefOr[String] = js.native
  /**
    * Corresponds to the label key of reservation resource.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Corresponds to the label values of reservation resource.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaReservationAffinity {
  @scala.inline
  def apply(consumeReservationType: String = null, key: String = null, values: js.Array[String] = null): SchemaReservationAffinity = {
    val __obj = js.Dynamic.literal()
    if (consumeReservationType != null) __obj.updateDynamic("consumeReservationType")(consumeReservationType.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReservationAffinity]
  }
}

