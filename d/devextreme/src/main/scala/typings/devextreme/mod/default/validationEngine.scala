package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.ui.dxValidationGroupResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "validationEngine")
@js.native
class validationEngine ()
  extends typings.devextreme.mod.DevExpress.validationEngine

/* static members */
@JSImport("devextreme", "validationEngine")
@js.native
object validationEngine extends js.Object {
  /** Gets the default validation group. */
  def getGroupConfig(): js.Any = js.native
  /** Gets a validation group with a specific key. */
  def getGroupConfig(group: String): js.Any = js.native
  def getGroupConfig(group: js.Any): js.Any = js.native
  /** Registers all the Validator objects extending fields of the specified ViewModel. */
  def registerModelForValidation(model: js.Any): Unit = js.native
  /** Resets the values and validation result of the editors that belong to the default validation group. */
  def resetGroup(): Unit = js.native
  /** Resets the values and validation result of the editors that belong to the specified validation group. */
  def resetGroup(group: String): Unit = js.native
  def resetGroup(group: js.Any): Unit = js.native
  /** Unregisters all the Validator objects extending fields of the specified ViewModel. */
  def unregisterModelForValidation(model: js.Any): Unit = js.native
  /** Validates editors from the default validation group. */
  def validateGroup(): dxValidationGroupResult = js.native
  /** Validates editors from a specific validation group. */
  def validateGroup(group: String): dxValidationGroupResult = js.native
  def validateGroup(group: js.Any): dxValidationGroupResult = js.native
  /** Validates a view model. */
  def validateModel(model: js.Any): js.Any = js.native
}

