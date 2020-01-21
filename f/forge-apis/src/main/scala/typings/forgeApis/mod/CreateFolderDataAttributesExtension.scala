package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFolderDataAttributesExtension extends js.Object {
  var data: js.UndefOr[js.Object] = js.undefined
  var `type`: String
  var version: String
}

object CreateFolderDataAttributesExtension {
  @scala.inline
  def apply(`type`: String, version: String, data: js.Object = null): CreateFolderDataAttributesExtension = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFolderDataAttributesExtension]
  }
}

