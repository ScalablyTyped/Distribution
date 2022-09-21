package typings.devextremeRuntime

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactTemplateMod {
  
  @JSImport("@devextreme/runtime/cjs/react/template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTemplate(TemplateProp: Any, RenderProp: Any, ComponentProp: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(TemplateProp.asInstanceOf[js.Any], RenderProp.asInstanceOf[js.Any], ComponentProp.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def hasTemplate(name: String, props: Record[String, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasTemplate")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasTemplate(name: String, props: Record[String, Any], _component: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasTemplate")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], _component.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def renderTemplate(template: Any, model: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderTemplate(template: Any, model: Any, _component: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], model.asInstanceOf[js.Any], _component.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
