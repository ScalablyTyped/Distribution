package typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto

import typings.googleCloudPubsub.protosMod.google.protobuf.IExtensionRangeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ExtensionRange. */
trait IExtensionRange extends js.Object {
  /** ExtensionRange end */
  var end: js.UndefOr[Double | Null] = js.undefined
  /** ExtensionRange options */
  var options: js.UndefOr[IExtensionRangeOptions | Null] = js.undefined
  /** ExtensionRange start */
  var start: js.UndefOr[Double | Null] = js.undefined
}

object IExtensionRange {
  @scala.inline
  def apply(
    end: js.UndefOr[Null | Double] = js.undefined,
    options: js.UndefOr[Null | IExtensionRangeOptions] = js.undefined,
    start: js.UndefOr[Null | Double] = js.undefined
  ): IExtensionRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(options)) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtensionRange]
  }
}

