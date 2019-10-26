package typings.forgeDashApis.forgeDashApisMod

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
    val __obj = js.Dynamic.literal(version = version)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[CreateFolderDataAttributesExtension]
  }
}

