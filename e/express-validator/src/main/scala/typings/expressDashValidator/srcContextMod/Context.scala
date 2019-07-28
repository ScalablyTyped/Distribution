package typings.expressDashValidator.srcContextMod

import typings.expressDashValidator.Anon_RequiredOnly
import typings.expressDashValidator.srcBaseMod.FieldInstance
import typings.expressDashValidator.srcBaseMod.Location
import typings.expressDashValidator.srcBaseMod.Meta
import typings.expressDashValidator.srcBaseMod.ValidationError
import typings.expressDashValidator.srcContextDashItemsContextDashItemMod.ContextItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context", "Context")
@js.native
class Context protected () extends js.Object {
  def this(
    fields: js.Array[String],
    locations: js.Array[Location],
    stack: js.Array[ContextItem],
    optional: Optional
  ) = this()
  def this(
    fields: js.Array[String],
    locations: js.Array[Location],
    stack: js.Array[ContextItem],
    optional: Optional,
    message: js.Any
  ) = this()
  val _errors: js.Any = js.native
  val dataMap: js.Any = js.native
  val errors: js.Array[ValidationError] = js.native
  val fields: js.Array[String] = js.native
  val locations: js.Array[Location] = js.native
  val message: js.UndefOr[js.Any] = js.native
  val optional: Optional = js.native
  val stack: js.Array[ContextItem] = js.native
  def addError(message: js.Any, nestedErrors: js.Array[ValidationError]): Unit = js.native
  def addError(message: js.Any, value: js.Any, meta: Meta): Unit = js.native
  def addFieldInstances(instances: js.Array[FieldInstance]): Unit = js.native
  def getData(): js.Array[FieldInstance] = js.native
  def getData(options: Anon_RequiredOnly): js.Array[FieldInstance] = js.native
  def setData(path: String, value: js.Any, location: Location): Unit = js.native
}

