package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStorageDataAttributes extends js.Object {
  var extension: js.UndefOr[BaseAttributesExtensionObject] = js.undefined
  var name: String
}

object CreateStorageDataAttributes {
  @scala.inline
  def apply(name: String, extension: BaseAttributesExtensionObject = null): CreateStorageDataAttributes = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStorageDataAttributes]
  }
}

