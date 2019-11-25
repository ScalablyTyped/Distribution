package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFolderDataAttributes extends js.Object {
  var extension: BaseAttributesExtensionObject
  var name: String
}

object CreateFolderDataAttributes {
  @scala.inline
  def apply(extension: BaseAttributesExtensionObject, name: String): CreateFolderDataAttributes = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateFolderDataAttributes]
  }
}

