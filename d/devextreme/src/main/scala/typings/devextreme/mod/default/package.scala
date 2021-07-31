package typings.devextreme.mod.default

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def config(): typings.devextreme.mod.DevExpress.globalConfig = typings.devextreme.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[typings.devextreme.mod.DevExpress.globalConfig]
@scala.inline
def config(config: typings.devextreme.mod.DevExpress.globalConfig): scala.Unit = typings.devextreme.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("config")(config.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def devices: typings.devextreme.mod.DevExpress.DevicesObject = typings.devextreme.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("devices").asInstanceOf[typings.devextreme.mod.DevExpress.DevicesObject]
@scala.inline
def devices_=(x: typings.devextreme.mod.DevExpress.DevicesObject): scala.Unit = typings.devextreme.mod.default.^.asInstanceOf[js.Dynamic].updateDynamic("devices")(x.asInstanceOf[js.Any])

@scala.inline
def hideTopOverlay(): scala.Boolean = typings.devextreme.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("hideTopOverlay")().asInstanceOf[scala.Boolean]

@scala.inline
def registerComponent(name: java.lang.String, componentClass: js.Any): scala.Unit = (typings.devextreme.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("registerComponent")(name.asInstanceOf[js.Any], componentClass.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def registerComponent(name: java.lang.String, namespace: js.Any, componentClass: js.Any): scala.Unit = (typings.devextreme.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("registerComponent")(name.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], componentClass.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def setTemplateEngine(templateEngineName: java.lang.String): scala.Unit = typings.devextreme.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateEngine")(templateEngineName.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def setTemplateEngine(templateEngineOptions: typings.devextreme.anon.Compile): scala.Unit = typings.devextreme.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateEngine")(templateEngineOptions.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
