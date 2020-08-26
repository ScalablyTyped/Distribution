package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitterSettings extends js.Object {
  /** Specifies the position of splitter in Gantt, based on column index in Gantt.
    */
  var index: js.UndefOr[String] = js.native
  /** Specifies position of the splitter in Gantt , splitter can be placed either based on percentage values or pixel values.
    */
  var position: js.UndefOr[String] = js.native
}

object SplitterSettings {
  @scala.inline
  def apply(): SplitterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitterSettings]
  }
  @scala.inline
  implicit class SplitterSettingsOps[Self <: SplitterSettings] (val x: Self) extends AnyVal {
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
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

