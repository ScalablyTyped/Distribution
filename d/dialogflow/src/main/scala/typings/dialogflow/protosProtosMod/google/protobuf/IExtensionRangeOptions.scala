package typings.dialogflow.protosProtosMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ExtensionRangeOptions. */
trait IExtensionRangeOptions extends js.Object {
  /** ExtensionRangeOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}

object IExtensionRangeOptions {
  @scala.inline
  def apply(uninterpretedOption: js.Array[IUninterpretedOption] = null): IExtensionRangeOptions = {
    val __obj = js.Dynamic.literal()
    if (uninterpretedOption != null) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtensionRangeOptions]
  }
}

