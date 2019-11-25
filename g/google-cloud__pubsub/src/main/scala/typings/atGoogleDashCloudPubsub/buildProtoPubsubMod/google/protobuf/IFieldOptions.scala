package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf

import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf.FieldOptions.CType
import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf.FieldOptions.JSType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FieldOptions. */
trait IFieldOptions extends js.Object {
  /** FieldOptions ctype */
  var ctype: js.UndefOr[CType | Null] = js.undefined
  /** FieldOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  /** FieldOptions jstype */
  var jstype: js.UndefOr[JSType | Null] = js.undefined
  /** FieldOptions lazy */
  var `lazy`: js.UndefOr[Boolean | Null] = js.undefined
  /** FieldOptions packed */
  var packed: js.UndefOr[Boolean | Null] = js.undefined
  /** FieldOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
  /** FieldOptions weak */
  var weak: js.UndefOr[Boolean | Null] = js.undefined
}

object IFieldOptions {
  @scala.inline
  def apply(
    ctype: CType = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    jstype: JSType = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    packed: js.UndefOr[Boolean] = js.undefined,
    uninterpretedOption: js.Array[IUninterpretedOption] = null,
    weak: js.UndefOr[Boolean] = js.undefined
  ): IFieldOptions = {
    val __obj = js.Dynamic.literal()
    if (ctype != null) __obj.updateDynamic("ctype")(ctype.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (jstype != null) __obj.updateDynamic("jstype")(jstype.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (!js.isUndefined(packed)) __obj.updateDynamic("packed")(packed.asInstanceOf[js.Any])
    if (uninterpretedOption != null) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption.asInstanceOf[js.Any])
    if (!js.isUndefined(weak)) __obj.updateDynamic("weak")(weak.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldOptions]
  }
}

