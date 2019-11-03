package typings.dialogflow.protosProtosMod.google.protobuf

import typings.dialogflow.protosProtosMod.google.api.IResourceDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MessageOptions. */
trait IMessageOptions extends js.Object {
  /** MessageOptions .google.api.resource */
  var `.google.api.resource`: js.UndefOr[IResourceDescriptor | Null] = js.undefined
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
    `.google.api.resource`: IResourceDescriptor = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    mapEntry: js.UndefOr[Boolean] = js.undefined,
    messageSetWireFormat: js.UndefOr[Boolean] = js.undefined,
    noStandardDescriptorAccessor: js.UndefOr[Boolean] = js.undefined,
    uninterpretedOption: js.Array[IUninterpretedOption] = null
  ): IMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (`.google.api.resource` != null) __obj.updateDynamic(".google.api.resource")(`.google.api.resource`)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (!js.isUndefined(mapEntry)) __obj.updateDynamic("mapEntry")(mapEntry)
    if (!js.isUndefined(messageSetWireFormat)) __obj.updateDynamic("messageSetWireFormat")(messageSetWireFormat)
    if (!js.isUndefined(noStandardDescriptorAccessor)) __obj.updateDynamic("noStandardDescriptorAccessor")(noStandardDescriptorAccessor)
    if (uninterpretedOption != null) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption)
    __obj.asInstanceOf[IMessageOptions]
  }
}

