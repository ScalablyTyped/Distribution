package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.ui.dxValidationGroupResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "default.validationEngine")
@js.native
class validationEngine ()
  extends StObject
     with typings.devextreme.mod.DevExpress.validationEngine
/* static members */
object validationEngine {
  
  @JSImport("devextreme", "default.validationEngine")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * [descr:validationEngine.getGroupConfig()]
    */
  @scala.inline
  def getGroupConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGroupConfig")().asInstanceOf[js.Any]
  /**
    * [descr:validationEngine.getGroupConfig(group)]
    */
  @scala.inline
  def getGroupConfig(group: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGroupConfig")(group.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getGroupConfig(group: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGroupConfig")(group.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * [descr:validationEngine.registerModelForValidation(model)]
    */
  @scala.inline
  def registerModelForValidation(model: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerModelForValidation")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * [descr:validationEngine.resetGroup()]
    */
  @scala.inline
  def resetGroup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGroup")().asInstanceOf[Unit]
  /**
    * [descr:validationEngine.resetGroup(group)]
    */
  @scala.inline
  def resetGroup(group: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGroup")(group.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def resetGroup(group: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGroup")(group.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * [descr:validationEngine.unregisterModelForValidation(model)]
    */
  @scala.inline
  def unregisterModelForValidation(model: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterModelForValidation")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * [descr:validationEngine.validateGroup()]
    */
  @scala.inline
  def validateGroup(): dxValidationGroupResult = ^.asInstanceOf[js.Dynamic].applyDynamic("validateGroup")().asInstanceOf[dxValidationGroupResult]
  /**
    * [descr:validationEngine.validateGroup(group)]
    */
  @scala.inline
  def validateGroup(group: String): dxValidationGroupResult = ^.asInstanceOf[js.Dynamic].applyDynamic("validateGroup")(group.asInstanceOf[js.Any]).asInstanceOf[dxValidationGroupResult]
  @scala.inline
  def validateGroup(group: js.Any): dxValidationGroupResult = ^.asInstanceOf[js.Dynamic].applyDynamic("validateGroup")(group.asInstanceOf[js.Any]).asInstanceOf[dxValidationGroupResult]
  
  /**
    * [descr:validationEngine.validateModel(model)]
    */
  @scala.inline
  def validateModel(model: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("validateModel")(model.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
