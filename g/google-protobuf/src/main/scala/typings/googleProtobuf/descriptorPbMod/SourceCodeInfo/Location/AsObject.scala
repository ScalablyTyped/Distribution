package typings.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var leadingComments: js.UndefOr[String] = js.undefined
  var leadingDetachedCommentsList: js.Array[String]
  var pathList: js.Array[Double]
  var spanList: js.Array[Double]
  var trailingComments: js.UndefOr[String] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    leadingDetachedCommentsList: js.Array[String],
    pathList: js.Array[Double],
    spanList: js.Array[Double],
    leadingComments: String = null,
    trailingComments: String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(leadingDetachedCommentsList = leadingDetachedCommentsList.asInstanceOf[js.Any], pathList = pathList.asInstanceOf[js.Any], spanList = spanList.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

