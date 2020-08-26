package typings.eslint.mod.Rule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleModule extends js.Object {
  var meta: js.UndefOr[RuleMetaData] = js.native
  def create(context: RuleContext): RuleListener = js.native
}

object RuleModule {
  @scala.inline
  def apply(create: RuleContext => RuleListener): RuleModule = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[RuleModule]
  }
  @scala.inline
  implicit class RuleModuleOps[Self <: RuleModule] (val x: Self) extends AnyVal {
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
    def setCreate(value: RuleContext => RuleListener): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setMeta(value: RuleMetaData): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
  }
  
}

