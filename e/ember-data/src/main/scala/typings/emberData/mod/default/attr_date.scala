package typings.emberData.mod.default

import typings.ember.mod.default.ComputedProperty
import typings.emberData.emberDataStrings.date
import typings.emberData.mod.DS.AttrOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "attr")
@js.native
object attr_date extends js.Object {
  def apply(`type`: date): ComputedProperty[Date, Date] = js.native
  def apply(`type`: date, options: AttrOptions[Date]): ComputedProperty[Date, Date] = js.native
}

