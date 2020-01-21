package typings.googleCloudPubsub.iamMod.google.protobuf.DescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ExtensionRange. */
trait IExtensionRange extends js.Object {
  /** ExtensionRange end */
  var end: js.UndefOr[Double | Null] = js.undefined
  /** ExtensionRange start */
  var start: js.UndefOr[Double | Null] = js.undefined
}

object IExtensionRange {
  @scala.inline
  def apply(end: Int | Double = null, start: Int | Double = null): IExtensionRange = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtensionRange]
  }
}

