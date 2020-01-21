package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFieldMetadataProto extends js.Object {
  var internal: js.UndefOr[SchemaInternalFieldMetadataProto] = js.native
}

object SchemaFieldMetadataProto {
  @scala.inline
  def apply(internal: SchemaInternalFieldMetadataProto = null): SchemaFieldMetadataProto = {
    val __obj = js.Dynamic.literal()
    if (internal != null) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldMetadataProto]
  }
}

