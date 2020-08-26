package typings.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseDefault extends js.Object {
  var overrides: js.UndefOr[js.Array[Method]] = js.native
  var useDefault: Boolean = js.native
}

object UseDefault {
  @scala.inline
  def apply(useDefault: Boolean): UseDefault = {
    val __obj = js.Dynamic.literal(useDefault = useDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseDefault]
  }
  @scala.inline
  implicit class UseDefaultOps[Self <: UseDefault] (val x: Self) extends AnyVal {
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
    def setUseDefault(value: Boolean): Self = this.set("useDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverridesVarargs(value: Method*): Self = this.set("overrides", js.Array(value :_*))
    @scala.inline
    def setOverrides(value: js.Array[Method]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
  
}

