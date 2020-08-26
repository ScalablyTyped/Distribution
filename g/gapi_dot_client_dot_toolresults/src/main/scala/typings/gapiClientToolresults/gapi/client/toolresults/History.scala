package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends js.Object {
  /**
    * A short human-readable (plain text) name to display in the UI. Maximum of 100 characters.
    *
    * - In response: present if set during create. - In create request: optional
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * A unique identifier within a project for this History.
    *
    * Returns INVALID_ARGUMENT if this field is set or overwritten by the caller.
    *
    * - In response always set - In create request: never set
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * A name to uniquely identify a history within a project. Maximum of 100 characters.
    *
    * - In response always set - In create request: always set
    */
  var name: js.UndefOr[String] = js.native
}

object History {
  @scala.inline
  def apply(): History = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[History]
  }
  @scala.inline
  implicit class HistoryOps[Self <: History] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setHistoryId(value: String): Self = this.set("historyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoryId: Self = this.set("historyId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

