package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CounterLabel extends js.Object {
  var counterLabel: js.UndefOr[String] = js.native
}

object CounterLabel {
  @scala.inline
  def apply(): CounterLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterLabel]
  }
  @scala.inline
  implicit class CounterLabelOps[Self <: CounterLabel] (val x: Self) extends AnyVal {
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
    def setCounterLabel(value: String): Self = this.set("counterLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounterLabel: Self = this.set("counterLabel", js.undefined)
  }
  
}

