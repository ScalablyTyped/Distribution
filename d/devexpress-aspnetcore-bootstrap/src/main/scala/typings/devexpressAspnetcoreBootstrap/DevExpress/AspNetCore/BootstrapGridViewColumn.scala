package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapGridViewColumn extends js.Object {
  val fieldName: String = js.native
  val index: Double = js.native
  val instance: js.Any = js.native
  val name: String = js.native
  val visible: Boolean = js.native
}

object BootstrapGridViewColumn {
  @scala.inline
  def apply(fieldName: String, index: Double, instance: js.Any, name: String, visible: Boolean): BootstrapGridViewColumn = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapGridViewColumn]
  }
  @scala.inline
  implicit class BootstrapGridViewColumnOps[Self <: BootstrapGridViewColumn] (val x: Self) extends AnyVal {
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstance(value: js.Any): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

