package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPointProto extends js.Object {
  var latE7: js.UndefOr[Double] = js.native
  var lngE7: js.UndefOr[Double] = js.native
  var metadata: js.UndefOr[SchemaFieldMetadataProto] = js.native
  var temporaryData: js.UndefOr[SchemaMessageSet] = js.native
}

object SchemaPointProto {
  @scala.inline
  def apply(
    latE7: Int | Double = null,
    lngE7: Int | Double = null,
    metadata: SchemaFieldMetadataProto = null,
    temporaryData: SchemaMessageSet = null
  ): SchemaPointProto = {
    val __obj = js.Dynamic.literal()
    if (latE7 != null) __obj.updateDynamic("latE7")(latE7.asInstanceOf[js.Any])
    if (lngE7 != null) __obj.updateDynamic("lngE7")(lngE7.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (temporaryData != null) __obj.updateDynamic("temporaryData")(temporaryData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPointProto]
  }
}

