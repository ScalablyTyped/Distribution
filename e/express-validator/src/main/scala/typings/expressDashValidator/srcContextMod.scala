package typings.expressDashValidator

import typings.expressDashValidator.expressDashValidatorStrings.addError
import typings.expressDashValidator.expressDashValidatorStrings.addFieldInstances
import typings.expressDashValidator.expressDashValidatorStrings.setData
import typings.expressDashValidator.srcBaseMod.FieldInstance
import typings.expressDashValidator.srcBaseMod.Location
import typings.expressDashValidator.srcBaseMod.Meta
import typings.expressDashValidator.srcBaseMod.ValidationError
import typings.expressDashValidator.srcContextDashItemsContextDashItemMod.ContextItem
import typings.expressDashValidator.srcContextMod.Context
import typings.expressDashValidator.srcContextMod.Optional
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context", JSImport.Namespace)
@js.native
object srcContextMod extends js.Object {
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressDashValidator.Anon_CheckFalsyNullable
    - typings.expressDashValidator.expressDashValidatorNumbers.`false`
  */
  trait Optional extends js.Object
  
  type ReadonlyContext = Pick[Context, Exclude[String, setData | addFieldInstances | addError]]
}

