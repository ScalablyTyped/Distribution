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
  /** @name validationEngine.getGroupConfig() */
  def getGroupConfig(): js.Any = js.native
  /** @name validationEngine.getGroupConfig(group) */
  def getGroupConfig(group: String): js.Any = js.native
  def getGroupConfig(group: js.Any): js.Any = js.native
  /** @name validationEngine.registerModelForValidation(model) */
  def registerModelForValidation(model: js.Any): Unit = js.native
  /** @name validationEngine.resetGroup() */
  def resetGroup(): Unit = js.native
  /** @name validationEngine.resetGroup(group) */
  def resetGroup(group: String): Unit = js.native
  def resetGroup(group: js.Any): Unit = js.native
  /** @name validationEngine.unregisterModelForValidation(model) */
  def unregisterModelForValidation(model: js.Any): Unit = js.native
  /** @name validationEngine.validateGroup() */
  def validateGroup(): dxValidationGroupResult = js.native
  /** @name validationEngine.validateGroup(group) */
  def validateGroup(group: String): dxValidationGroupResult = js.native
  def validateGroup(group: js.Any): dxValidationGroupResult = js.native
  /** @name validationEngine.validateModel(model) */
  def validateModel(model: js.Any): js.Any = js.native
}

