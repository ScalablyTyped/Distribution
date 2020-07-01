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
    latE7: js.UndefOr[Double] = js.undefined,
    lngE7: js.UndefOr[Double] = js.undefined,
    metadata: SchemaFieldMetadataProto = null,
    temporaryData: SchemaMessageSet = null
  ): SchemaPointProto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(latE7)) __obj.updateDynamic("latE7")(latE7.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lngE7)) __obj.updateDynamic("lngE7")(lngE7.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (temporaryData != null) __obj.updateDynamic("temporaryData")(temporaryData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPointProto]
  }
}

