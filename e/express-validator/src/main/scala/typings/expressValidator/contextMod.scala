package typings.expressValidator

import typings.expressValidator.baseMod.FieldInstance
import typings.expressValidator.baseMod.Location
import typings.expressValidator.baseMod.Meta
import typings.expressValidator.baseMod.ValidationError
import typings.expressValidator.contextItemMod.ContextItem
import typings.expressValidator.expressValidatorStrings.addError
import typings.expressValidator.expressValidatorStrings.addFieldInstances
import typings.expressValidator.expressValidatorStrings.setData
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
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
    val fields: js.Array[String] = js.native
    val locations: js.Array[Location] = js.native
    val message: js.UndefOr[js.Any] = js.native
    val optional: Optional = js.native
    val stack: js.Array[ContextItem] = js.native
    def addError(message: js.Any, nestedErrors: js.Array[ValidationError]): Unit = js.native
    def addError(message: js.Any, value: js.Any, meta: Meta): Unit = js.native
    def addFieldInstances(instances: js.Array[FieldInstance]): Unit = js.native
    def errors(): js.Array[ValidationError] = js.native
    def getData(): js.Array[FieldInstance] = js.native
    def getData(options: AnonRequiredOnly): js.Array[FieldInstance] = js.native
    def setData(path: String, value: js.Any, location: Location): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressValidator.AnonCheckFalsyNullable
    - typings.expressValidator.expressValidatorBooleans.`false`
  */
  trait Optional extends js.Object
  
  type ReadonlyContext = Pick[Context, Exclude[String, setData | addFieldInstances | addError]]
}

