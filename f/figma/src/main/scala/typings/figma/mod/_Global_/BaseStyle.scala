package typings.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseStyle extends js.Object {
  var description: String
  val id: String
  val key: String
  var name: String
  var remote: Boolean
  val `type`: StyleType
   // The key to use with "importStyleByKeyAsync"
  def remove(): Unit
}

object BaseStyle {
  @scala.inline
  def apply(
    description: String,
    id: String,
    key: String,
    name: String,
    remote: Boolean,
    remove: () => Unit,
    `type`: StyleType
  ): BaseStyle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseStyle]
  }
}

