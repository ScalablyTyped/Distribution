package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseStyle extends js.Object {
  var description: String = js.native
  val id: String = js.native
  val key: String = js.native
  var name: String = js.native
  var remote: Boolean = js.native
  val `type`: StyleType = js.native
   // The key to use with "importStyleByKeyAsync"
  def remove(): Unit = js.native
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
  @scala.inline
  implicit class BaseStyleOps[Self <: BaseStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemote(value: Boolean): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: StyleType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

