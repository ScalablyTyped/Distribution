package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use sidebar actions to add a sidebar to Firefox.
  *
  * Manifest keys: `sidebar_action`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object sidebarAction {
  
  trait GetPanelDetails extends StObject {
    
    /**
      * Specify the tab to get the panel from. If no tab nor window is specified, the global panel is returned.
      */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify the window to get the panel from. If no tab nor window is specified, the global panel is returned.
      */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object GetPanelDetails {
    
    inline def apply(): GetPanelDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPanelDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetPanelDetails] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  trait GetTitleDetails extends StObject {
    
    /**
      * Specify the tab to get the title from. If no tab nor window is specified, the global title is returned.
      */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify the window to get the title from. If no tab nor window is specified, the global title is returned.
      */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object GetTitleDetails {
    
    inline def apply(): GetTitleDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTitleDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetTitleDetails] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  /* sidebarAction types */
  /** Pixel data for an image. Must be an ImageData object (for example, from a `canvas` element). */
  type ImageDataType = ImageData
  
  trait IsOpenDetails extends StObject {
    
    /** Specify the window to get the openness from. */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object IsOpenDetails {
    
    inline def apply(): IsOpenDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsOpenDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsOpenDetails] (val x: Self) extends AnyVal {
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  trait SetIconDetails extends StObject {
    
    /**
      * Either an ImageData object or a dictionary {size -> ImageData} representing icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals `scale`, then image with size `scale` * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.imageData = foo' is equivalent to 'details.imageData = {'19': foo}'
      */
    var imageData: js.UndefOr[ImageDataType | NumberDictionary[ImageDataType]] = js.undefined
    
    /**
      * Either a relative image path or a dictionary {size -> relative image path} pointing to icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals `scale`, then image with size `scale` * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.path = foo' is equivalent to 'details.imageData = {'19': foo}'
      */
    var path: js.UndefOr[String | StringDictionary[String]] = js.undefined
    
    /** Sets the sidebar icon for the tab specified by tabId. Automatically resets when the tab is closed. */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /** Sets the sidebar icon for the window specified by windowId. */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object SetIconDetails {
    
    inline def apply(): SetIconDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetIconDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetIconDetails] (val x: Self) extends AnyVal {
      
      inline def setImageData(value: ImageDataType | NumberDictionary[ImageDataType]): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
      
      inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
      
      inline def setPath(value: String | StringDictionary[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  trait SetPanelDetails extends StObject {
    
    /** The url to the html file to show in a sidebar. If set to the empty string (''), no sidebar is shown. */
    var panel: String | Null
    
    /** Sets the sidebar url for the tab specified by tabId. Automatically resets when the tab is closed. */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /** Sets the sidebar url for the window specified by windowId. */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object SetPanelDetails {
    
    inline def apply(): SetPanelDetails = {
      val __obj = js.Dynamic.literal(panel = null)
      __obj.asInstanceOf[SetPanelDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetPanelDetails] (val x: Self) extends AnyVal {
      
      inline def setPanel(value: String): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      inline def setPanelNull: Self = StObject.set(x, "panel", null)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  trait SetTitleDetails extends StObject {
    
    /** Sets the sidebar title for the tab specified by tabId. Automatically resets when the tab is closed. */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /** The string the sidebar action should display when moused over. */
    var title: String | Null
    
    /** Sets the sidebar title for the window specified by windowId. */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object SetTitleDetails {
    
    inline def apply(): SetTitleDetails = {
      val __obj = js.Dynamic.literal(title = null)
      __obj.asInstanceOf[SetTitleDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetTitleDetails] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
}
