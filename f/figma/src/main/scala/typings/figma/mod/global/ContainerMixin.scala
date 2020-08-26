package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerMixin extends js.Object {
   // DEPRECATED: use 'fills' instead
  var backgroundStyleId: String = js.native
  var backgrounds: js.Array[Paint] = js.native
  var expanded: Boolean = js.native
}

object ContainerMixin {
  @scala.inline
  def apply(backgroundStyleId: String, backgrounds: js.Array[Paint], expanded: Boolean): ContainerMixin = {
    val __obj = js.Dynamic.literal(backgroundStyleId = backgroundStyleId.asInstanceOf[js.Any], backgrounds = backgrounds.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerMixin]
  }
  @scala.inline
  implicit class ContainerMixinOps[Self <: ContainerMixin] (val x: Self) extends AnyVal {
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
    def setBackgroundStyleId(value: String): Self = this.set("backgroundStyleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundsVarargs(value: Paint*): Self = this.set("backgrounds", js.Array(value :_*))
    @scala.inline
    def setBackgrounds(value: js.Array[Paint]): Self = this.set("backgrounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
  }
  
}

