package typings.gapiPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDepartment extends js.Object {
  var department: String
  var description: String
  var endDate: String
  var location: String
  var name: String
  var primary: Boolean
  var startDate: String
  var title: String
  var `type`: String
}

object AnonDepartment {
  @scala.inline
  def apply(
    department: String,
    description: String,
    endDate: String,
    location: String,
    name: String,
    primary: Boolean,
    startDate: String,
    title: String,
    `type`: String
  ): AnonDepartment = {
    val __obj = js.Dynamic.literal(department = department.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDepartment]
  }
}

