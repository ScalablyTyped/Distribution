package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.ui.dxValidationGroup.ValidationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "default.validationEngine")
@js.native
open class validationEngine ()
  extends StObject
     with typings.devextreme.mod.DevExpress.validationEngine
/* static members */
object validationEngine {
  
  @JSImport("devextreme", "default.validationEngine")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the default validation group.
    */
  inline def getGroupConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGroupConfig")().asInstanceOf[Any]
  /**
    * Gets a validation group with a specific key.
    */
  inline def getGroupConfig(group: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGroupConfig")(group.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getGroupConfig(group: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGroupConfig")(group.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Registers all the Validator objects extending fields of the specified ViewModel.
    */
  inline def registerModelForValidation(model: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerModelForValidation")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Resets the values and validation result of the editors that belong to the default validation group.
    */
  inline def resetGroup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGroup")().asInstanceOf[Unit]
  /**
    * Resets the values and validation result of the editors that belong to the specified validation group.
    */
  inline def resetGroup(group: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGroup")(group.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def resetGroup(group: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGroup")(group.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Unregisters all the Validator objects extending fields of the specified ViewModel.
    */
  inline def unregisterModelForValidation(model: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterModelForValidation")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Validates editors from the default validation group.
    */
  inline def validateGroup(): ValidationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("validateGroup")().asInstanceOf[ValidationResult]
  /**
    * Validates editors from a specific validation group.
    */
  inline def validateGroup(group: String): ValidationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("validateGroup")(group.asInstanceOf[js.Any]).asInstanceOf[ValidationResult]
  inline def validateGroup(group: Any): ValidationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("validateGroup")(group.asInstanceOf[js.Any]).asInstanceOf[ValidationResult]
  
  /**
    * Validates a view model.
    */
  inline def validateModel(model: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("validateModel")(model.asInstanceOf[js.Any]).asInstanceOf[Any]
}
