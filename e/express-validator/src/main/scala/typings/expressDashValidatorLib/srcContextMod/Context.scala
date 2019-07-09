package typings
package expressDashValidatorLib.srcContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context", "Context")
@js.native
class Context protected () extends js.Object {
  def this(fields: js.Array[java.lang.String], locations: js.Array[expressDashValidatorLib.srcBaseMod.Location], stack: js.Array[expressDashValidatorLib.srcContextDashItemsContextDashItemMod.ContextItem], optional: Optional) = this()
  def this(fields: js.Array[java.lang.String], locations: js.Array[expressDashValidatorLib.srcBaseMod.Location], stack: js.Array[expressDashValidatorLib.srcContextDashItemsContextDashItemMod.ContextItem], optional: Optional, message: js.Any) = this()
  val _errors: js.Any = js.native
  val dataMap: js.Any = js.native
  val errors: js.Array[expressDashValidatorLib.srcBaseMod.ValidationError] = js.native
  val fields: js.Array[java.lang.String] = js.native
  val locations: js.Array[expressDashValidatorLib.srcBaseMod.Location] = js.native
  val message: js.UndefOr[js.Any] = js.native
  val optional: Optional = js.native
  val stack: js.Array[expressDashValidatorLib.srcContextDashItemsContextDashItemMod.ContextItem] = js.native
  def addError(message: js.Any, nestedErrors: js.Array[expressDashValidatorLib.srcBaseMod.ValidationError]): scala.Unit = js.native
  def addError(message: js.Any, value: js.Any, meta: expressDashValidatorLib.srcBaseMod.Meta): scala.Unit = js.native
  def addFieldInstances(instances: js.Array[expressDashValidatorLib.srcBaseMod.FieldInstance]): scala.Unit = js.native
  def getData(): js.Array[expressDashValidatorLib.srcBaseMod.FieldInstance] = js.native
  def getData(options: expressDashValidatorLib.Anon_RequiredOnly): js.Array[expressDashValidatorLib.srcBaseMod.FieldInstance] = js.native
  def setData(path: java.lang.String, value: js.Any, location: expressDashValidatorLib.srcBaseMod.Location): scala.Unit = js.native
}

