package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$FieldMetadataProto extends js.Object {
  var internal: js.UndefOr[Schema$InternalFieldMetadataProto] = js.native
}

object Schema$FieldMetadataProto {
  @scala.inline
  def apply(internal: Schema$InternalFieldMetadataProto = null): Schema$FieldMetadataProto = {
    val __obj = js.Dynamic.literal()
    if (internal != null) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FieldMetadataProto]
  }
}

