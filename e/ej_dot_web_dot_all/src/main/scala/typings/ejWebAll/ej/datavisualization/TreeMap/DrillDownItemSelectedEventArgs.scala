package typings.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrillDownItemSelectedEventArgs extends js.Object {
  /** Returns selected drilldown treeMap object.
    */
  var originalEvent: js.UndefOr[js.Any] = js.native
}

object DrillDownItemSelectedEventArgs {
  @scala.inline
  def apply(): DrillDownItemSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrillDownItemSelectedEventArgs]
  }
  @scala.inline
  implicit class DrillDownItemSelectedEventArgsOps[Self <: DrillDownItemSelectedEventArgs] (val x: Self) extends AnyVal {
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
    def setOriginalEvent(value: js.Any): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalEvent: Self = this.set("originalEvent", js.undefined)
  }
  
}

