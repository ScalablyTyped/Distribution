package typings.figma

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
    val __obj = js.Dynamic.literal(description = description, id = id, key = key, name = name, remote = remote, remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BaseStyle]
  }
}

