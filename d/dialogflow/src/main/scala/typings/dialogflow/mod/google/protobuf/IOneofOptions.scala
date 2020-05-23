package typings.dialogflow.mod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an OneofOptions. */
trait IOneofOptions extends js.Object {
  /** OneofOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}

object IOneofOptions {
  @scala.inline
  def apply(uninterpretedOption: js.UndefOr[Null | js.Array[IUninterpretedOption]] = js.undefined): IOneofOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(uninterpretedOption)) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOneofOptions]
  }
}

