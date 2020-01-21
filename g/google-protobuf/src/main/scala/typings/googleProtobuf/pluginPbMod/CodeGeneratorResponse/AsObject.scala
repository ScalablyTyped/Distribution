package typings.googleProtobuf.pluginPbMod.CodeGeneratorResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var error: js.UndefOr[String] = js.undefined
  var fileList: js.Array[typings.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    fileList: js.Array[typings.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File.AsObject],
    error: String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

