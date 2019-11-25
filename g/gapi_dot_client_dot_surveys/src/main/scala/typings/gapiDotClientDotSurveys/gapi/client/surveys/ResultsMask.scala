package typings.gapiDotClientDotSurveys.gapi.client.surveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultsMask extends js.Object {
  var fields: js.UndefOr[js.Array[FieldMask]] = js.undefined
  var projection: js.UndefOr[String] = js.undefined
}

object ResultsMask {
  @scala.inline
  def apply(fields: js.Array[FieldMask] = null, projection: String = null): ResultsMask = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultsMask]
  }
}

