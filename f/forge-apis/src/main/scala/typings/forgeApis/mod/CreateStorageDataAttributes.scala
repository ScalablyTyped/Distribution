package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStorageDataAttributes extends js.Object {
  var extension: BaseAttributesExtensionObject
  var name: String
}

object CreateStorageDataAttributes {
  @scala.inline
  def apply(extension: BaseAttributesExtensionObject, name: String): CreateStorageDataAttributes = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateStorageDataAttributes]
  }
}

