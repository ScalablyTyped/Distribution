package typings
package expressDashValidatorLib.srcContextDashBuilderMod

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
  def addItem(items: expressDashValidatorLib.srcContextDashItemsContextDashItemMod.ContextItem*): this.type = js.native
  def build(): expressDashValidatorLib.srcContextMod.Context = js.native
  def setFields(fields: js.Array[java.lang.String]): this.type = js.native
  def setLocations(locations: js.Array[expressDashValidatorLib.srcBaseMod.Location]): this.type = js.native
  def setMessage(message: js.Any): this.type = js.native
  def setOptional(options: expressDashValidatorLib.srcContextMod.Optional): this.type = js.native
}

