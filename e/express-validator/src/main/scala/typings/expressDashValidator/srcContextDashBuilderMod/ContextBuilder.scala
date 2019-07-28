package typings.expressDashValidator.srcContextDashBuilderMod

import typings.expressDashValidator.srcBaseMod.Location
import typings.expressDashValidator.srcContextDashItemsContextDashItemMod.ContextItem
import typings.expressDashValidator.srcContextMod.Context
import typings.expressDashValidator.srcContextMod.Optional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-builder", "ContextBuilder")
@js.native
class ContextBuilder () extends js.Object {
  var fields: js.Any = js.native
  var locations: js.Any = js.native
  var message: js.Any = js.native
  var optional: js.Any = js.native
  val stack: js.Any = js.native
  def addItem(items: ContextItem*): this.type = js.native
  def build(): Context = js.native
  def setFields(fields: js.Array[String]): this.type = js.native
  def setLocations(locations: js.Array[Location]): this.type = js.native
  def setMessage(message: js.Any): this.type = js.native
  def setOptional(options: Optional): this.type = js.native
}

