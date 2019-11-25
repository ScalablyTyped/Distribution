package typings.dialogflow.protosProtosMod.google.protobuf.SourceCodeInfo

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
    leadingComments: String = null,
    leadingDetachedComments: js.Array[String] = null,
    path: js.Array[Double] = null,
    span: js.Array[Double] = null,
    trailingComments: String = null
  ): ILocation = {
    val __obj = js.Dynamic.literal()
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (leadingDetachedComments != null) __obj.updateDynamic("leadingDetachedComments")(leadingDetachedComments.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocation]
  }
}

