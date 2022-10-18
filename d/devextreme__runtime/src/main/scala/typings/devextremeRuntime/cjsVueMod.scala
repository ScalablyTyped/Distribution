package typings.devextremeRuntime

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsVueMod {
  
  @JSImport("@devextreme/runtime/cjs/vue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasTemplate(name: String, _props: Record[String, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasTemplate")(name.asInstanceOf[js.Any], _props.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasTemplate(name: String, _props: Record[String, Any], component: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasTemplate")(name.asInstanceOf[js.Any], _props.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def renderTemplate(template: Any, model: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderTemplate(template: Any, model: Any, component: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], model.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
