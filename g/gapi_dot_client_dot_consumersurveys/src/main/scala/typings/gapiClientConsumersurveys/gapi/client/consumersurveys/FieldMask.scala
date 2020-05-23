package typings.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldMask extends js.Object {
  var fields: js.UndefOr[js.Array[FieldMask]] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
}

object FieldMask {
  @scala.inline
  def apply(fields: js.Array[FieldMask] = null, id: js.UndefOr[Double] = js.undefined): FieldMask = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldMask]
  }
}

