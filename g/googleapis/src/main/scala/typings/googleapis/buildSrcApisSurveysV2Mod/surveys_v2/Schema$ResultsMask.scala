package typings.googleapis.buildSrcApisSurveysV2Mod.surveys_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ResultsMask extends js.Object {
  var fields: js.UndefOr[js.Array[Schema$FieldMask]] = js.native
  var projection: js.UndefOr[String] = js.native
}

object Schema$ResultsMask {
  @scala.inline
  def apply(fields: js.Array[Schema$FieldMask] = null, projection: String = null): Schema$ResultsMask = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResultsMask]
  }
}

