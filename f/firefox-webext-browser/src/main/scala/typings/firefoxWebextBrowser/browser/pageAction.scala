package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.NumberDictionary
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.pageAction` API to put icons inside the address bar. Page actions represent actions that can be taken on the current page, but that aren't applicable to all pages.
  *
  * Manifest keys: `page_action`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object pageAction {
  
  trait GetPopupDetails extends StObject {
    
    /** Specify the tab to get the popup from. */
    var tabId: Double
  }
  object GetPopupDetails {
    
    inline def apply(tabId: Double): GetPopupDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPopupDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetPopupDetails] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetTitleDetails extends StObject {
    
    /** Specify the tab to get the title from. */
    var tabId: Double
  }
  object GetTitleDetails {
    
    inline def apply(tabId: Double): GetTitleDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTitleDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetTitleDetails] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  /* pageAction types */
  /** Pixel data for an image. Must be an ImageData object (for example, from a `canvas` element). */
  type ImageDataType = ImageData
  
  trait IsShownDetails extends StObject {
    
    /** Specify the tab to get the shownness from. */
    var tabId: Double
  }
  object IsShownDetails {
    
    inline def apply(tabId: Double): IsShownDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsShownDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsShownDetails] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  /** Information sent when a page action is clicked. */
  trait OnClickData extends StObject {
    
    /** An integer value of button by which menu item was clicked. */
    var button: js.UndefOr[Double] = js.undefined
    
    /** An array of keyboard modifiers that were held while the menu item was clicked. */
    var modifiers: js.Array[OnClickDataModifiers]
  }
  object OnClickData {
    
    inline def apply(modifiers: js.Array[OnClickDataModifiers]): OnClickData = {
      val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnClickData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnClickData] (val x: Self) extends AnyVal {
      
      inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setModifiers(value: js.Array[OnClickDataModifiers]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersVarargs(value: OnClickDataModifiers*): Self = StObject.set(x, "modifiers", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Shift
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Alt
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Command
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Ctrl
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.MacCtrl
  */
  trait OnClickDataModifiers extends StObject
  object OnClickDataModifiers {
    
    inline def Alt: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Alt = "Alt".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Alt]
    
    inline def Command: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Command = "Command".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Command]
    
    inline def Ctrl: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Ctrl = "Ctrl".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Ctrl]
    
    inline def MacCtrl: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.MacCtrl = "MacCtrl".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.MacCtrl]
    
    inline def Shift: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Shift = "Shift".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Shift]
  }
  
  trait SetIconDetails extends StObject {
    
    /**
      * Either an ImageData object or a dictionary {size -> ImageData} representing icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals `scale`, then image with size `scale` * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.imageData = foo' is equivalent to 'details.imageData = {'19': foo}'
      */
    var imageData: js.UndefOr[ImageDataType | NumberDictionary[ImageDataType]] = js.undefined
    
    /**
      * Either a relative image path or a dictionary {size -> relative image path} pointing to icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals `scale`, then image with size `scale` * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.path = foo' is equivalent to 'details.imageData = {'19': foo}'
      */
    var path: js.UndefOr[String | NumberDictionary[String]] = js.undefined
    
    /** The id of the tab for which you want to modify the page action. */
    var tabId: Double
  }
  object SetIconDetails {
    
    inline def apply(tabId: Double): SetIconDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetIconDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetIconDetails] (val x: Self) extends AnyVal {
      
      inline def setImageData(value: ImageDataType | NumberDictionary[ImageDataType]): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
      
      inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
      
      inline def setPath(value: String | NumberDictionary[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetPopupDetails extends StObject {
    
    /** The html file to show in a popup. If set to the empty string (''), no popup is shown. */
    var popup: String | Null
    
    /** The id of the tab for which you want to modify the page action. */
    var tabId: Double
  }
  object SetPopupDetails {
    
    inline def apply(tabId: Double): SetPopupDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], popup = null)
      __obj.asInstanceOf[SetPopupDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetPopupDetails] (val x: Self) extends AnyVal {
      
      inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupNull: Self = StObject.set(x, "popup", null)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetTitleDetails extends StObject {
    
    /** The id of the tab for which you want to modify the page action. */
    var tabId: Double
    
    /** The tooltip string. */
    var title: String | Null
  }
  object SetTitleDetails {
    
    inline def apply(tabId: Double): SetTitleDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], title = null)
      __obj.asInstanceOf[SetTitleDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetTitleDetails] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
    }
  }
}
