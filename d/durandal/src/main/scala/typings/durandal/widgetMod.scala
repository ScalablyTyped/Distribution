package typings.durandal

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Layers the widget sugar on top of the composition system.
  * @requires system
  * @requires composition
  * @requires jquery
  * @requires knockout
  */
object widgetMod {
  
  @JSImport("plugins/widget", "convertKindToModulePath")
  @js.native
  def convertKindToModulePath(kind: String): String = js.native
  
  @JSImport("plugins/widget", "convertKindToViewPath")
  @js.native
  def convertKindToViewPath(kind: String): String = js.native
  
  @JSImport("plugins/widget", "create")
  @js.native
  def create(element: HTMLElement, settings: WidgetSettings): Unit = js.native
  @JSImport("plugins/widget", "create")
  @js.native
  def create(
    element: HTMLElement,
    settings: WidgetSettings,
    bindingContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ js.Any
  ): Unit = js.native
  
  @JSImport("plugins/widget", "mapKind")
  @js.native
  def mapKind(kind: String): Unit = js.native
  @JSImport("plugins/widget", "mapKind")
  @js.native
  def mapKind(kind: String, viewId: js.UndefOr[scala.Nothing], moduleId: String): Unit = js.native
  @JSImport("plugins/widget", "mapKind")
  @js.native
  def mapKind(kind: String, viewId: String): Unit = js.native
  @JSImport("plugins/widget", "mapKind")
  @js.native
  def mapKind(kind: String, viewId: String, moduleId: String): Unit = js.native
  
  @JSImport("plugins/widget", "mapKindToModuleId")
  @js.native
  def mapKindToModuleId(kind: String): String = js.native
  
  @JSImport("plugins/widget", "mapKindToViewId")
  @js.native
  def mapKindToViewId(kind: String): String = js.native
  
  @JSImport("plugins/widget", "registerKind")
  @js.native
  def registerKind(kind: String): Unit = js.native
  
  @js.native
  trait WidgetSettings extends StObject {
    
    var kind: String = js.native
    
    var model: js.UndefOr[js.Any] = js.native
    
    var view: js.UndefOr[js.Any] = js.native
  }
  object WidgetSettings {
    
    @scala.inline
    def apply(kind: String): WidgetSettings = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[WidgetSettings]
    }
    
    @scala.inline
    implicit class WidgetSettingsMutableBuilder[Self <: WidgetSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setView(value: js.Any): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
}
