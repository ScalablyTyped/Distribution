package typings.devextremeRuntime

import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmReactMod {
  
  @JSImport("@devextreme/runtime/esm/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectChildren(children: ReactNode): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("__collectChildren")(children.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  
  inline def equalByValue(object1: Any, object2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalByValue")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalByValue(object1: Any, object2: Any, depth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalByValue")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalByValue(object1: Any, object2: Any, depth: Double, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalByValue")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalByValue(object1: Any, object2: Any, depth: Unit, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalByValue")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getTemplate(TemplateProp: Any, RenderProp: Any, ComponentProp: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(TemplateProp.asInstanceOf[js.Any], RenderProp.asInstanceOf[js.Any], ComponentProp.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def hasTemplate(name: String, props: Record[String, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasTemplate")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasTemplate(name: String, props: Record[String, Any], _component: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasTemplate")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], _component.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def renderTemplate(template: Any, model: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderTemplate(template: Any, model: Any, _component: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], model.asInstanceOf[js.Any], _component.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toComparable(value: Any, caseSensitive: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toComparable")(value.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Any]
}
