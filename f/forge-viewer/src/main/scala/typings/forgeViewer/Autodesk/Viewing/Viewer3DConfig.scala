package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StringDictionary
import typings.forgeViewer.forgeViewerStrings.`dark-theme`
import typings.forgeViewer.forgeViewerStrings.`light-theme`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewer3DConfig
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var addFooter: js.UndefOr[Boolean] = js.undefined
  
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  var heightAdjustment: js.UndefOr[Double] = js.undefined
  
  var left: js.UndefOr[Boolean] = js.undefined
  
  var localizeTitle: js.UndefOr[Boolean] = js.undefined
  
  var marginTop: js.UndefOr[Double] = js.undefined
  
  var startOnInitialize: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[`dark-theme` | `light-theme` | String] = js.undefined
}
object Viewer3DConfig {
  
  inline def apply(): Viewer3DConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Viewer3DConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Viewer3DConfig] (val x: Self) extends AnyVal {
    
    inline def setAddFooter(value: Boolean): Self = StObject.set(x, "addFooter", value.asInstanceOf[js.Any])
    
    inline def setAddFooterUndefined: Self = StObject.set(x, "addFooter", js.undefined)
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setHeightAdjustment(value: Double): Self = StObject.set(x, "heightAdjustment", value.asInstanceOf[js.Any])
    
    inline def setHeightAdjustmentUndefined: Self = StObject.set(x, "heightAdjustment", js.undefined)
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLocalizeTitle(value: Boolean): Self = StObject.set(x, "localizeTitle", value.asInstanceOf[js.Any])
    
    inline def setLocalizeTitleUndefined: Self = StObject.set(x, "localizeTitle", js.undefined)
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setStartOnInitialize(value: Boolean): Self = StObject.set(x, "startOnInitialize", value.asInstanceOf[js.Any])
    
    inline def setStartOnInitializeUndefined: Self = StObject.set(x, "startOnInitialize", js.undefined)
    
    inline def setTheme(value: `dark-theme` | `light-theme` | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
