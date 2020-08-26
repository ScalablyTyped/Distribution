package typings.eonasdanBootstrapDatetimepicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Icons extends js.Object {
  /**
    * Default: "glyphicon glyphicon-trash"
    */
  var clear: js.UndefOr[String] = js.native
  /**
    * Default: "glyphicon glyphicon-remove"
    */
  var close: js.UndefOr[String] = js.native
  /**
    * Default: "glyphicon glyphicon-calendar"
    */
  var date: js.UndefOr[String] = js.native
  /**
    * Default: "glyphicon glyphicon-time"
    */
  var down: js.UndefOr[String] = js.native
  /**
    * Default: "glyphicon glyphicon-chevron-left"
    */
  var next: js.UndefOr[String] = js.native
  /**
    * Default: "glyphicon glyphicon-screenshot"
    */
  var previous: js.UndefOr[String] = js.native
  /**
    * Default: "glyphicon glyphicon-chevron-right"
    */
  var time: js.UndefOr[String] = js.native
  /**
    * Default: "glyphicon glyphicon-chevron-down"
    */
  var today: js.UndefOr[String] = js.native
  /**
    * Default: "glyphicon glyphicon-chevron-up"
    */
  var up: js.UndefOr[String] = js.native
}

object Icons {
  @scala.inline
  def apply(): Icons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Icons]
  }
  @scala.inline
  implicit class IconsOps[Self <: Icons] (val x: Self) extends AnyVal {
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
    def setClear(value: String): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDown(value: String): Self = this.set("down", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setPrevious(value: String): Self = this.set("previous", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setToday(value: String): Self = this.set("today", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
    @scala.inline
    def setUp(value: String): Self = this.set("up", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
  }
  
}

