package typings.expoConfigureSplashScreen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  var group: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any = js.native
  var target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any = js.native
}

object Group {
  @scala.inline
  def apply(
    group: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any,
    target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any
  ): Group = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  @scala.inline
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
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
    def setGroup(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any
    ): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any
    ): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

