package typings.durandal

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Layers the widget sugar on top of the composition system.
  * @requires system
  * @requires composition
  * @requires jquery
  * @requires knockout
  */
object widgetMod {
  
  @JSImport("plugins/widget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertKindToModulePath(kind: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertKindToModulePath")(kind.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertKindToViewPath(kind: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertKindToViewPath")(kind.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def create(element: HTMLElement, settings: WidgetSettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def create(
    element: HTMLElement,
    settings: WidgetSettings,
    bindingContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], bindingContext.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mapKind(kind: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mapKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mapKind(kind: String, viewId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapKind")(kind.asInstanceOf[js.Any], viewId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mapKind(kind: String, viewId: String, moduleId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapKind")(kind.asInstanceOf[js.Any], viewId.asInstanceOf[js.Any], moduleId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mapKind(kind: String, viewId: Unit, moduleId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapKind")(kind.asInstanceOf[js.Any], viewId.asInstanceOf[js.Any], moduleId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mapKindToModuleId(kind: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mapKindToModuleId")(kind.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mapKindToViewId(kind: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mapKindToViewId")(kind.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def registerKind(kind: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait WidgetSettings extends StObject {
    
    var kind: String
    
    var model: js.UndefOr[js.Any] = js.undefined
    
    var view: js.UndefOr[js.Any] = js.undefined
  }
  object WidgetSettings {
    
    inline def apply(kind: String): WidgetSettings = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[WidgetSettings]
    }
    
    extension [Self <: WidgetSettings](x: Self) {
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setView(value: js.Any): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
}
