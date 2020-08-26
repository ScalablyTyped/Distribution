package typings.doubleclickGpt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeCorrelator extends js.Object {
  var changeCorrelator: Boolean = js.native
}

object ChangeCorrelator {
  @scala.inline
  def apply(changeCorrelator: Boolean): ChangeCorrelator = {
    val __obj = js.Dynamic.literal(changeCorrelator = changeCorrelator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeCorrelator]
  }
  @scala.inline
  implicit class ChangeCorrelatorOps[Self <: ChangeCorrelator] (val x: Self) extends AnyVal {
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
    def setChangeCorrelator(value: Boolean): Self = this.set("changeCorrelator", value.asInstanceOf[js.Any])
  }
  
}

