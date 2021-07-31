package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StringDictionary
import typings.forgeViewer.anon.Bimwalk
import typings.forgeViewer.forgeViewerStrings.`dark-theme`
import typings.forgeViewer.forgeViewerStrings.`light-theme`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewerConfig
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var bubbleNode: js.UndefOr[BubbleNode] = js.undefined
  
  var canvasConfig: js.UndefOr[js.Any] = js.undefined
  
  var consolidationMemoryLimit: js.UndefOr[Double] = js.undefined
  
  var disableBrowserContextMenu: js.UndefOr[Boolean] = js.undefined
  
  var disabledExtensions: js.UndefOr[Bimwalk] = js.undefined
  
  var experimental: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  var sharedPropertyDbPath: js.UndefOr[String] = js.undefined
  
  var startOnInitialize: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[`dark-theme` | `light-theme` | String] = js.undefined
  
  var useConsolidation: js.UndefOr[Boolean] = js.undefined
}
object ViewerConfig {
  
  @scala.inline
  def apply(): ViewerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewerConfig]
  }
  
  @scala.inline
  implicit class ViewerConfigMutableBuilder[Self <: ViewerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbleNode(value: BubbleNode): Self = StObject.set(x, "bubbleNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbleNodeUndefined: Self = StObject.set(x, "bubbleNode", js.undefined)
    
    @scala.inline
    def setCanvasConfig(value: js.Any): Self = StObject.set(x, "canvasConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasConfigUndefined: Self = StObject.set(x, "canvasConfig", js.undefined)
    
    @scala.inline
    def setConsolidationMemoryLimit(value: Double): Self = StObject.set(x, "consolidationMemoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsolidationMemoryLimitUndefined: Self = StObject.set(x, "consolidationMemoryLimit", js.undefined)
    
    @scala.inline
    def setDisableBrowserContextMenu(value: Boolean): Self = StObject.set(x, "disableBrowserContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableBrowserContextMenuUndefined: Self = StObject.set(x, "disableBrowserContextMenu", js.undefined)
    
    @scala.inline
    def setDisabledExtensions(value: Bimwalk): Self = StObject.set(x, "disabledExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledExtensionsUndefined: Self = StObject.set(x, "disabledExtensions", js.undefined)
    
    @scala.inline
    def setExperimental(value: js.Array[js.Any]): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    @scala.inline
    def setExperimentalVarargs(value: js.Any*): Self = StObject.set(x, "experimental", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setSharedPropertyDbPath(value: String): Self = StObject.set(x, "sharedPropertyDbPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedPropertyDbPathUndefined: Self = StObject.set(x, "sharedPropertyDbPath", js.undefined)
    
    @scala.inline
    def setStartOnInitialize(value: Boolean): Self = StObject.set(x, "startOnInitialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOnInitializeUndefined: Self = StObject.set(x, "startOnInitialize", js.undefined)
    
    @scala.inline
    def setTheme(value: `dark-theme` | `light-theme` | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setUseConsolidation(value: Boolean): Self = StObject.set(x, "useConsolidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseConsolidationUndefined: Self = StObject.set(x, "useConsolidation", js.undefined)
  }
}
