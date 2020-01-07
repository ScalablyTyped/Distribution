package typings.googleapis.buildSrcApisSurveysV2Mod.surveys_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$FieldMask extends js.Object {
  var fields: js.UndefOr[js.Array[Schema$FieldMask]] = js.native
  var id: js.UndefOr[Double] = js.native
}

object Schema$FieldMask {
  @scala.inline
  def apply(fields: js.Array[Schema$FieldMask] = null, id: Int | Double = null): Schema$FieldMask = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FieldMask]
  }
}

