package typings.googleCloudPubsub.protosMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FieldMask. */
trait IFieldMask extends js.Object {
  /** FieldMask paths */
  var paths: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object IFieldMask {
  @scala.inline
  def apply(paths: js.UndefOr[Null | js.Array[String]] = js.undefined): IFieldMask = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(paths)) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldMask]
  }
}

