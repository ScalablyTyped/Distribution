package typings.fusioncharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AddGroup extends StObject {
    
    def addGroup(): Any = js.native
    def addGroup(config: Any): Any = js.native
    def addGroup(config: Any, component: Any): Any = js.native
    def addGroup(config: Unit, component: Any): Any = js.native
    
    def addItem(groupId: Any): Any = js.native
    def addItem(groupId: Any, itemConfig: Any): Any = js.native
    def addItem(groupId: Any, itemConfig: Any, drawImmediate: Any): Any = js.native
    def addItem(groupId: Any, itemConfig: Any, drawImmediate: Any, component: Any): Any = js.native
    def addItem(groupId: Any, itemConfig: Any, drawImmediate: Unit, component: Any): Any = js.native
    def addItem(groupId: Any, itemConfig: Unit, drawImmediate: Any): Any = js.native
    def addItem(groupId: Any, itemConfig: Unit, drawImmediate: Any, component: Any): Any = js.native
    def addItem(groupId: Any, itemConfig: Unit, drawImmediate: Unit, component: Any): Any = js.native
    
    def clear(): Unit = js.native
    
    def destroy(id: String): Unit = js.native
    
    def hide(id: String): Unit = js.native
    
    def show(id: String): Unit = js.native
    
    def update(id: String, config: Any): Any = js.native
  }
  
  trait CreditLabel extends StObject {
    
    var SVGDefinitionURL: js.UndefOr[String] = js.undefined
    
    var creditLabel: js.UndefOr[String | Boolean] = js.undefined
    
    var defaultTheme: js.UndefOr[String] = js.undefined
    
    var `export`: js.UndefOr[UseCanvas] = js.undefined
    
    var preventTrackResize: js.UndefOr[Boolean] = js.undefined
    
    var resizeTrackingInterval: js.UndefOr[Double] = js.undefined
    
    var scriptBaseUri: js.UndefOr[String] = js.undefined
  }
  object CreditLabel {
    
    inline def apply(): CreditLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreditLabel]
    }
    
    extension [Self <: CreditLabel](x: Self) {
      
      inline def setCreditLabel(value: String | Boolean): Self = StObject.set(x, "creditLabel", value.asInstanceOf[js.Any])
      
      inline def setCreditLabelUndefined: Self = StObject.set(x, "creditLabel", js.undefined)
      
      inline def setDefaultTheme(value: String): Self = StObject.set(x, "defaultTheme", value.asInstanceOf[js.Any])
      
      inline def setDefaultThemeUndefined: Self = StObject.set(x, "defaultTheme", js.undefined)
      
      inline def setExport(value: UseCanvas): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
      
      inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
      
      inline def setPreventTrackResize(value: Boolean): Self = StObject.set(x, "preventTrackResize", value.asInstanceOf[js.Any])
      
      inline def setPreventTrackResizeUndefined: Self = StObject.set(x, "preventTrackResize", js.undefined)
      
      inline def setResizeTrackingInterval(value: Double): Self = StObject.set(x, "resizeTrackingInterval", value.asInstanceOf[js.Any])
      
      inline def setResizeTrackingIntervalUndefined: Self = StObject.set(x, "resizeTrackingInterval", js.undefined)
      
      inline def setSVGDefinitionURL(value: String): Self = StObject.set(x, "SVGDefinitionURL", value.asInstanceOf[js.Any])
      
      inline def setSVGDefinitionURLUndefined: Self = StObject.set(x, "SVGDefinitionURL", js.undefined)
      
      inline def setScriptBaseUri(value: String): Self = StObject.set(x, "scriptBaseUri", value.asInstanceOf[js.Any])
      
      inline def setScriptBaseUriUndefined: Self = StObject.set(x, "scriptBaseUri", js.undefined)
    }
  }
  
  trait UseCanvas extends StObject {
    
    var useCanvas: js.UndefOr[String | Boolean] = js.undefined
  }
  object UseCanvas {
    
    inline def apply(): UseCanvas = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseCanvas]
    }
    
    extension [Self <: UseCanvas](x: Self) {
      
      inline def setUseCanvas(value: String | Boolean): Self = StObject.set(x, "useCanvas", value.asInstanceOf[js.Any])
      
      inline def setUseCanvasUndefined: Self = StObject.set(x, "useCanvas", js.undefined)
    }
  }
}
