package typings.dwt

import typings.dwt.addonDotCameraMod.Resolution
import typings.dwt.anon.AllImage
import typings.dwt.anon.AsideBackground
import typings.dwt.anon.AsideMenu
import typings.dwt.anon.AutoFit
import typings.dwt.anon.BackgroundColor
import typings.dwt.anon.Crop
import typings.dwt.anon.CropBar
import typings.dwt.anon.DisplayMode
import typings.dwt.anon.Global
import typings.dwt.anon.GoToThumbnail
import typings.dwt.anon.IfResize
import typings.dwt.webTwainDotAcquireMod.WebTwainAcquire
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webTwainDotViewerMod {
  
  trait BasicViewerConfig extends StObject {
    
    /**
      * Specify the size of the viewer.
      */
    var Height: Double | String
    
    var Width: Double | String
    
    /**
      * Set up the content view.
      */
    var view: ContentView
  }
  object BasicViewerConfig {
    
    inline def apply(Height: Double | String, Width: Double | String, view: ContentView): BasicViewerConfig = {
      val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicViewerConfig]
    }
    
    extension [Self <: BasicViewerConfig](x: Self) {
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
      
      inline def setView(value: ContentView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentView extends StObject {
    
    /**
      * Specify the width of the major content view.
      */
    var Width: Double | String
    
    /**
      * Whether to show the content view or not.
      * If set to false, then only thumbnails view is shown.
      */
    var bShow: Boolean
  }
  object ContentView {
    
    inline def apply(Width: Double | String, bShow: Boolean): ContentView = {
      val __obj = js.Dynamic.literal(Width = Width.asInstanceOf[js.Any], bShow = bShow.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentView]
    }
    
    extension [Self <: ContentView](x: Self) {
      
      inline def setBShow(value: Boolean): Self = StObject.set(x, "bShow", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DynamsoftViewer extends StObject {
    
    /**
      * Whether to only show the thumbnails view.
      */
    var bOnlyShowThumbnailsView: Boolean = js.native
    
    /**
      * Bind a custom element to the viewer to add extra features.
      * @param Id Specify the element by its Id.
      * @param priority Specify the importance of the element.
      * @param fullScreen Whether to show the element full-screen.
      */
    def bindCustomElement(Id: String, priority: Double, fullScreen: Boolean): Boolean = js.native
    
    /**
      * Close the camera and hide the video streaming UI.
      */
    def closeVideo(): Unit = js.native
    
    /**
      * Set the shape of the cursor over the thumbnails view.
      */
    var cursorOverThumbnailsView: String = js.native
    
    /**
      * Hide the custom element.
      * @param name Specify the element by its Id.
      */
    def hideCustomElement(Id: String): Boolean = js.native
    
    /**
      * Return or set the margin between two images or the margin between one side of an image and the border of the viewer.
      */
    var imageMargin: Double = js.native
    
    /**
      * Remove a built-in event handler.
      * @param eventName Specify the event.
      */
    def off(eventName: String): Boolean = js.native
    
    /**
      * The mode of operation. Allowed values are 0(no selection, cursor is pointer), 1 (seleciton, cursor is crosshair)
      */
    var operationMode: Double = js.native
    
    /**
      * Set the CSS class name of the specified button.
      * @param name Specify the button.
      * @param className Specify the CSS class name.
      */
    def setButtonClass(name: String, className: String): Boolean = js.native
    
    /**
      * Select a rectangular area on the specified image.
      * @param left Specify the rectangle (leftmost coordinate).
      * @param top Specify the rectangle (topmost coordinate).
      * @param width Specify the rectangle (the width).
      * @param height Specify the rectangle (the height).
      */
    def setSelectedImageArea(left: Double, top: Double, width: Double, height: Double): Boolean = js.native
    
    /**
      * Set the view mode of the viewer.
      * @param columns Specify the number of images per row.
      * @param rows Specify the number of images per column.
      */
    def setViewMode(columns: Double, rows: Double): Boolean = js.native
    
    /**
      * Show the custom element.
      * @param name Specify the element by its Id.
      */
    def showCustomElement(Id: String): Boolean = js.native
    
    /**
      * Return or set whether to show the footer of the viewer.
      */
    var showFooter: Boolean = js.native
    
    /**
      * Return or set whether to show the header of the viewer.
      */
    var showHeader: Boolean = js.native
    
    /**
      * Start streaming video from the current camera in the viewer.
      * @param deviceId Specify a camera.
      * @param resolution Specify the initial resolution.
      */
    def showVideo(): js.Promise[Resolution] = js.native
    def showVideo(deviceId: String): js.Promise[Resolution] = js.native
    def showVideo(deviceId: String, resolution: Resolution): js.Promise[Resolution] = js.native
    def showVideo(deviceId: Unit, resolution: Resolution): js.Promise[Resolution] = js.native
    
    /**
      * Show or hide the custom element.
      * @param name Specify the element by its Id.
      */
    def toggleCustomElement(Id: String): Boolean = js.native
    
    /**
      * Unbind a custom element from the viewer.
      * @param Id Specify the element by its Id.
      */
    def unBindCustomElement(Id: String): Boolean = js.native
    
    /**
      * Update the viewer with detailed configuration.
      * @param config Specify the detailed configuration.
      */
    def updateUISettings(config: ViewerConfig): Boolean = js.native
    
    /**
      * Zoom in by 6/5.
      */
    def zoomIn(): Boolean = js.native
    
    /**
      * Zoom out by 5/6.
      */
    def zoomOut(): Boolean = js.native
  }
  
  trait ViewerConfig extends StObject {
    
    var buttonResize: js.UndefOr[IfResize] = js.undefined
    
    var buttons: js.UndefOr[AutoFit] = js.undefined
    
    /**
      * Specify which components are shown.
      */
    var component: js.UndefOr[AsideMenu] = js.undefined
    
    var content: js.UndefOr[AllImage] = js.undefined
    
    var cropStyle: js.UndefOr[CropBar] = js.undefined
    
    var group: js.UndefOr[Global] = js.undefined
    
    var presetMode: js.UndefOr[String] = js.undefined
    
    var skinColor: js.UndefOr[AsideBackground] = js.undefined
    
    var tag: js.UndefOr[DisplayMode] = js.undefined
    
    // Example: 'basic'
    var theme: js.UndefOr[String] = js.undefined
    
    var thumbnail: js.UndefOr[BackgroundColor] = js.undefined
    
    var tipsConfig: js.UndefOr[Crop] = js.undefined
    
    var tree: js.UndefOr[GoToThumbnail] = js.undefined
  }
  object ViewerConfig {
    
    inline def apply(): ViewerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewerConfig]
    }
    
    extension [Self <: ViewerConfig](x: Self) {
      
      inline def setButtonResize(value: IfResize): Self = StObject.set(x, "buttonResize", value.asInstanceOf[js.Any])
      
      inline def setButtonResizeUndefined: Self = StObject.set(x, "buttonResize", js.undefined)
      
      inline def setButtons(value: AutoFit): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setComponent(value: AsideMenu): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setContent(value: AllImage): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCropStyle(value: CropBar): Self = StObject.set(x, "cropStyle", value.asInstanceOf[js.Any])
      
      inline def setCropStyleUndefined: Self = StObject.set(x, "cropStyle", js.undefined)
      
      inline def setGroup(value: Global): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setPresetMode(value: String): Self = StObject.set(x, "presetMode", value.asInstanceOf[js.Any])
      
      inline def setPresetModeUndefined: Self = StObject.set(x, "presetMode", js.undefined)
      
      inline def setSkinColor(value: AsideBackground): Self = StObject.set(x, "skinColor", value.asInstanceOf[js.Any])
      
      inline def setSkinColorUndefined: Self = StObject.set(x, "skinColor", js.undefined)
      
      inline def setTag(value: DisplayMode): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setThumbnail(value: BackgroundColor): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      inline def setTipsConfig(value: Crop): Self = StObject.set(x, "tipsConfig", value.asInstanceOf[js.Any])
      
      inline def setTipsConfigUndefined: Self = StObject.set(x, "tipsConfig", js.undefined)
      
      inline def setTree(value: GoToThumbnail): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
    }
  }
  
  @js.native
  trait WebTwainViewer
    extends StObject
       with WebTwainAcquire {
    
    /**
      * Return or set the background colour of the viewer.
      */
    var BackgroundColor: Double = js.native
    
    /**
      * Create a Dynamsoft Viewer instance and bind it to the WebTwain instance.
      * @param elementId Specify an HTML element to create the viewer.
      * @param config Configuration of the viewer.
      */
    def BindViewer(elementId: String): Boolean = js.native
    def BindViewer(elementId: String, config: BasicViewerConfig): Boolean = js.native
    
    /**
      * Return or set how the image is fit in the viewer.
      */
    var FitWindowType: Double = js.native
    
    /**
      * Return or set the height of the viewer.
      */
    var Height: Double | String = js.native
    
    /**
      * Return or set whether the thumbnails view scrolls when new images come in.
      */
    var IfAutoScroll: Boolean = js.native
    
    /**
      * Return or set the border colour for selected image(s).
      */
    var IfFitWindow: Boolean = js.native
    
    /**
      * Return or set the margin between images (in pixels).
      */
    var ImageMargin: Double = js.native
    
    /**
      * Return or set the shape of the cursor.
      */
    var MouseShape: Boolean = js.native
    
    /**
      * Return the horizontal coordinate of the mouse.
      */
    val MouseX: Double = js.native
    
    /**
      * Return the vertical coordinate of the mouse.
      */
    val MouseY: Double = js.native
    
    /**
      * Return or set the border colour for selected image(s).
      */
    var SelectionImageBorderColor: Double = js.native
    
    /**
      * Return or set whether to show the page numbers.
      */
    var ShowPageNumber: Boolean = js.native
    
    /**
      * Unbind and destroy the viewer.
      */
    def UnbindViewer(): Boolean = js.native
    
    /**
      * Update the viewer with the new configuration.
      * @param config Configuration of the viewer.
      */
    def UpdateViewer(config: BasicViewerConfig): Boolean = js.native
    
    var Viewer: DynamsoftViewer = js.native
    
    /**
      * Return or set the width of the viewer.
      */
    var Width: Double | String = js.native
    
    /**
      * Return or set the zoom factor.
      */
    var Zoom: Double = js.native
  }
}
