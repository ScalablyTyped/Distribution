package typings.gapiClientPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Department extends js.Object {
  /** The department within the organization. Deprecated. */
  var department: js.UndefOr[String] = js.native
  /** A short description of the person's role in this organization. Deprecated. */
  var description: js.UndefOr[String] = js.native
  /** The date that the person left this organization. */
  var endDate: js.UndefOr[String] = js.native
  /** The location of this organization. Deprecated. */
  var location: js.UndefOr[String] = js.native
  /** The name of the organization. */
  var name: js.UndefOr[String] = js.native
  /** If "true", indicates this organization is the person's primary one, which is typically interpreted as the current one. */
  var primary: js.UndefOr[Boolean] = js.native
  /** The date that the person joined this organization. */
  var startDate: js.UndefOr[String] = js.native
  /** The person's job title or role within the organization. */
  var title: js.UndefOr[String] = js.native
  /**
    * The type of organization. Possible values include, but are not limited to, the following values:
    * - "work" - Work.
    * - "school" - School.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Department {
  @scala.inline
  def apply(): Department = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Department]
  }
  @scala.inline
  implicit class DepartmentOps[Self <: Department] (val x: Self) extends AnyVal {
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
    def setDepartment(value: String): Self = this.set("department", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepartment: Self = this.set("department", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

