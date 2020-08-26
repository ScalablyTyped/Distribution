package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseListenOptions extends js.Object {
  /**
    * Listen backlog. Defaults to 10.
    */
  var backlog: js.UndefOr[Double] = js.native
}

object BaseListenOptions {
  @scala.inline
  def apply(): BaseListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseListenOptions]
  }
  @scala.inline
  implicit class BaseListenOptionsOps[Self <: BaseListenOptions] (val x: Self) extends AnyVal {
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
    def setBacklog(value: Double): Self = this.set("backlog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBacklog: Self = this.set("backlog", js.undefined)
  }
  
}

