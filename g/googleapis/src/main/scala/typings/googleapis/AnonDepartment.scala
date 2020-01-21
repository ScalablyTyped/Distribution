package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDepartment extends js.Object {
  var department: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var endDate: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var primary: js.UndefOr[Boolean] = js.native
  var startDate: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AnonDepartment {
  @scala.inline
  def apply(
    department: String = null,
    description: String = null,
    endDate: String = null,
    location: String = null,
    name: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    startDate: String = null,
    title: String = null,
    `type`: String = null
  ): AnonDepartment = {
    val __obj = js.Dynamic.literal()
    if (department != null) __obj.updateDynamic("department")(department.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDepartment]
  }
}

