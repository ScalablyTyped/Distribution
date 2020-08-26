package typings.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectNumber extends js.Object {
  /** The project number. */
  var projectNumber: js.UndefOr[String] = js.native
  /** The team. */
  var team: js.UndefOr[String] = js.native
}

object ProjectNumber {
  @scala.inline
  def apply(): ProjectNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectNumber]
  }
  @scala.inline
  implicit class ProjectNumberOps[Self <: ProjectNumber] (val x: Self) extends AnyVal {
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
    def setProjectNumber(value: String): Self = this.set("projectNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectNumber: Self = this.set("projectNumber", js.undefined)
    @scala.inline
    def setTeam(value: String): Self = this.set("team", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeam: Self = this.set("team", js.undefined)
  }
  
}

