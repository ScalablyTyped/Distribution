package typings
package gapiDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Department extends js.Object {
  var department: java.lang.String
  var description: java.lang.String
  var endDate: java.lang.String
  var location: java.lang.String
  var name: java.lang.String
  var primary: scala.Boolean
  var startDate: java.lang.String
  var title: java.lang.String
  var `type`: java.lang.String
}

object Anon_Department {
  @scala.inline
  def apply(
    department: java.lang.String,
    description: java.lang.String,
    endDate: java.lang.String,
    location: java.lang.String,
    name: java.lang.String,
    primary: scala.Boolean,
    startDate: java.lang.String,
    title: java.lang.String,
    `type`: java.lang.String
  ): Anon_Department = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("department")(department)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("endDate")(endDate)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("primary")(primary)
    __obj.updateDynamic("startDate")(startDate)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Department]
  }
}

