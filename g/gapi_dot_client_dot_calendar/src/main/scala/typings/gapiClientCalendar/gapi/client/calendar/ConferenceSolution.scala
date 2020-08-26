package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConferenceSolution extends js.Object {
  /** The user-visible icon for this solution. */
  var iconUri: js.UndefOr[String] = js.native
  /** The key which can uniquely identify the conference solution for this event. */
  var key: js.UndefOr[ConferenceSolutionKey] = js.native
  /** The user-visible name of this solution. Not localized. */
  var name: js.UndefOr[String] = js.native
}

object ConferenceSolution {
  @scala.inline
  def apply(): ConferenceSolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceSolution]
  }
  @scala.inline
  implicit class ConferenceSolutionOps[Self <: ConferenceSolution] (val x: Self) extends AnyVal {
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
    def setIconUri(value: String): Self = this.set("iconUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconUri: Self = this.set("iconUri", js.undefined)
    @scala.inline
    def setKey(value: ConferenceSolutionKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

