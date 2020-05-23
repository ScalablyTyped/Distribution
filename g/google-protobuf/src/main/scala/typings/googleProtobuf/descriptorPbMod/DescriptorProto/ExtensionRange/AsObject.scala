package typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[typings.googleProtobuf.descriptorPbMod.ExtensionRangeOptions.AsObject] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    end: js.UndefOr[Double] = js.undefined,
    options: typings.googleProtobuf.descriptorPbMod.ExtensionRangeOptions.AsObject = null,
    start: js.UndefOr[Double] = js.undefined
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

