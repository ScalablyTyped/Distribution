package typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Location. */
trait ILocation extends js.Object {
  /** Location leadingComments */
  var leadingComments: js.UndefOr[String | Null] = js.undefined
  /** Location leadingDetachedComments */
  var leadingDetachedComments: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** Location path */
  var path: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** Location span */
  var span: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** Location trailingComments */
  var trailingComments: js.UndefOr[String | Null] = js.undefined
}

object ILocation {
  @scala.inline
  def apply(
    leadingComments: js.UndefOr[Null | String] = js.undefined,
    leadingDetachedComments: js.UndefOr[Null | js.Array[String]] = js.undefined,
    path: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    span: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    trailingComments: js.UndefOr[Null | String] = js.undefined
  ): ILocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leadingComments)) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(leadingDetachedComments)) __obj.updateDynamic("leadingDetachedComments")(leadingDetachedComments.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(span)) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(trailingComments)) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocation]
  }
}

