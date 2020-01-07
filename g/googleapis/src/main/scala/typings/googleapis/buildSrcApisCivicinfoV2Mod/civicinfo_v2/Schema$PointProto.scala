package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PointProto extends js.Object {
  var latE7: js.UndefOr[Double] = js.native
  var lngE7: js.UndefOr[Double] = js.native
  var metadata: js.UndefOr[Schema$FieldMetadataProto] = js.native
  var temporaryData: js.UndefOr[Schema$MessageSet] = js.native
}

object Schema$PointProto {
  @scala.inline
  def apply(
    latE7: Int | Double = null,
    lngE7: Int | Double = null,
    metadata: Schema$FieldMetadataProto = null,
    temporaryData: Schema$MessageSet = null
  ): Schema$PointProto = {
    val __obj = js.Dynamic.literal()
    if (latE7 != null) __obj.updateDynamic("latE7")(latE7.asInstanceOf[js.Any])
    if (lngE7 != null) __obj.updateDynamic("lngE7")(lngE7.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (temporaryData != null) __obj.updateDynamic("temporaryData")(temporaryData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PointProto]
  }
}

