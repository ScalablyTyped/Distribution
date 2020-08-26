package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create, access and modify named ranges in a spreadsheet. Named ranges are ranges that have
  * associated string aliases. They can be viewed and edited via the Sheets UI under the Data >
  * Named ranges... menu.
  */
@js.native
trait NamedRange extends js.Object {
  def getName(): String = js.native
  def getRange(): Range = js.native
  def remove(): Unit = js.native
  def setName(name: String): NamedRange = js.native
  def setRange(range: Range): NamedRange = js.native
}

object NamedRange {
  @scala.inline
  def apply(
    getName: () => String,
    getRange: () => Range,
    remove: () => Unit,
    setName: String => NamedRange,
    setRange: Range => NamedRange
  ): NamedRange = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), getRange = js.Any.fromFunction0(getRange), remove = js.Any.fromFunction0(remove), setName = js.Any.fromFunction1(setName), setRange = js.Any.fromFunction1(setRange))
    __obj.asInstanceOf[NamedRange]
  }
  @scala.inline
  implicit class NamedRangeOps[Self <: NamedRange] (val x: Self) extends AnyVal {
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
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRange(value: () => Range): Self = this.set("getRange", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def setSetName(value: String => NamedRange): Self = this.set("setName", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRange(value: Range => NamedRange): Self = this.set("setRange", js.Any.fromFunction1(value))
  }
  
}

