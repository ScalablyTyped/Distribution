package typings.gapiDotPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Department extends js.Object {
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

object Anon_Department {
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
  ): Anon_Department = {
    val __obj = js.Dynamic.literal(department = department, description = description, endDate = endDate, location = location, name = name, primary = primary, startDate = startDate, title = title)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Department]
  }
}

