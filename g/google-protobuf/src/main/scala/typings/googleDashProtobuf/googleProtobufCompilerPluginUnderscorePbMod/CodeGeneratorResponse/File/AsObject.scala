package typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponse.File

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var insertionPoint: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(content: String = null, insertionPoint: String = null, name: String = null): AsObject = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (insertionPoint != null) __obj.updateDynamic("insertionPoint")(insertionPoint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

