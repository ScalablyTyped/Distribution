package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MessageOptions. */
trait IMessageOptions extends js.Object {
  /** MessageOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  /** MessageOptions mapEntry */
  var mapEntry: js.UndefOr[Boolean | Null] = js.undefined
  /** MessageOptions messageSetWireFormat */
  var messageSetWireFormat: js.UndefOr[Boolean | Null] = js.undefined
  /** MessageOptions noStandardDescriptorAccessor */
  var noStandardDescriptorAccessor: js.UndefOr[Boolean | Null] = js.undefined
  /** MessageOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}

object IMessageOptions {
  @scala.inline
  def apply(
    deprecated: js.UndefOr[Boolean] = js.undefined,
    mapEntry: js.UndefOr[Boolean] = js.undefined,
    messageSetWireFormat: js.UndefOr[Boolean] = js.undefined,
    noStandardDescriptorAccessor: js.UndefOr[Boolean] = js.undefined,
    uninterpretedOption: js.Array[IUninterpretedOption] = null
  ): IMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (!js.isUndefined(mapEntry)) __obj.updateDynamic("mapEntry")(mapEntry.asInstanceOf[js.Any])
    if (!js.isUndefined(messageSetWireFormat)) __obj.updateDynamic("messageSetWireFormat")(messageSetWireFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(noStandardDescriptorAccessor)) __obj.updateDynamic("noStandardDescriptorAccessor")(noStandardDescriptorAccessor.asInstanceOf[js.Any])
    if (uninterpretedOption != null) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageOptions]
  }
}

