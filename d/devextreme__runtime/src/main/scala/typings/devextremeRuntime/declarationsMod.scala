package typings.devextremeRuntime

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationsMod {
  
  @JSImport("@devextreme/runtime/cjs/declarations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasTemplate(_name: String, _props: Record[String, Any], _component: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasTemplate")(_name.asInstanceOf[js.Any], _props.asInstanceOf[js.Any], _component.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def renderTemplate(_template: Any, _model: Any, _component: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(_template.asInstanceOf[js.Any], _model.asInstanceOf[js.Any], _component.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
