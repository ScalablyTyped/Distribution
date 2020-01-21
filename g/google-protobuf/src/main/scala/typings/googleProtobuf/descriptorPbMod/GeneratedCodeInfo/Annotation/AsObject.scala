package typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var begin: js.UndefOr[Double] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var pathList: js.Array[Double]
  var sourceFile: js.UndefOr[String] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    pathList: js.Array[Double],
    begin: Int | Double = null,
    end: Int | Double = null,
    sourceFile: String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(pathList = pathList.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (sourceFile != null) __obj.updateDynamic("sourceFile")(sourceFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

