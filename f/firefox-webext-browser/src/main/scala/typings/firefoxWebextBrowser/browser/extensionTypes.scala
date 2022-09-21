package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `browser.extensionTypes` API contains type declarations for WebExtensions.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object extensionTypes {
  
  /** The origin of the CSS to inject, this affects the cascading order (priority) of the stylesheet. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.user
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.author
  */
  trait CSSOrigin extends StObject
  object CSSOrigin {
    
    inline def author: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.author = "author".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.author]
    
    inline def user: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.user = "user".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.user]
  }
  
  type Date = String | Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Date */ Any)
  
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.anon.File
    - typings.firefoxWebextBrowser.anon.Code
  */
  trait ExtensionFileOrCode extends StObject
  object ExtensionFileOrCode {
    
    inline def Code(code: String): typings.firefoxWebextBrowser.anon.Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firefoxWebextBrowser.anon.Code]
    }
    
    inline def File(file: ExtensionURL): typings.firefoxWebextBrowser.anon.File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firefoxWebextBrowser.anon.File]
    }
  }
  
  /** Details about the format, quality, area and scale of the capture. */
  trait ImageDetails extends StObject {
    
    /** The format of the resulting image. Default is `"jpeg"`. */
    var format: js.UndefOr[ImageFormat] = js.undefined
    
    /**
      * When format is `"jpeg"`, controls the quality of the resulting image. This value is ignored for PNG images. As quality is decreased, the resulting image will have more visual artifacts, and the number of bytes needed to store it will decrease.
      */
    var quality: js.UndefOr[Double] = js.undefined
    
    /**
      * The area of the document to capture, in CSS pixels, relative to the page. If omitted, capture the visible viewport.
      */
    var rect: js.UndefOr[ImageDetailsRect] = js.undefined
    
    /**
      * If true, temporarily resets the scroll position of the document to 0\. Only takes effect if rect is also specified.
      */
    var resetScrollPosition: js.UndefOr[Boolean] = js.undefined
    
    /** The scale of the resulting image. Defaults to `devicePixelRatio`. */
    var scale: js.UndefOr[Double] = js.undefined
  }
  object ImageDetails {
    
    inline def apply(): ImageDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageDetails]
    }
    
    extension [Self <: ImageDetails](x: Self) {
      
      inline def setFormat(value: ImageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setRect(value: ImageDetailsRect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
      
      inline def setResetScrollPosition(value: Boolean): Self = StObject.set(x, "resetScrollPosition", value.asInstanceOf[js.Any])
      
      inline def setResetScrollPositionUndefined: Self = StObject.set(x, "resetScrollPosition", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
  
  /**
    * The area of the document to capture, in CSS pixels, relative to the page. If omitted, capture the visible viewport.
    */
  trait ImageDetailsRect extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object ImageDetailsRect {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): ImageDetailsRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageDetailsRect]
    }
    
    extension [Self <: ImageDetailsRect](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* extensionTypes types */
  /** The format of an image. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.png
  */
  trait ImageFormat extends StObject
  object ImageFormat {
    
    inline def jpeg: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg = "jpeg".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg]
    
    inline def png: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.png = "png".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.png]
  }
  
  /**
    * Details of the script or CSS to inject. Either the code or the file property must be set, but both may not be set at the same time.
    */
  trait InjectDetails extends StObject {
    
    /**
      * If allFrames is `true`, implies that the JavaScript or CSS should be injected into all frames of current page. By default, it's `false` and is only injected into the top frame.
      */
    var allFrames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * JavaScript or CSS code to inject.
      *
      * **Warning:**
      * Be careful using the `code` parameter. Incorrect use of it may open your extension to [cross site scripting](https://en.wikipedia.org/wiki/Cross-site_scripting) attacks.
      */
    var code: js.UndefOr[String] = js.undefined
    
    /** The css origin of the stylesheet to inject. Defaults to "author". */
    var cssOrigin: js.UndefOr[CSSOrigin] = js.undefined
    
    /** JavaScript or CSS file to inject. */
    var file: js.UndefOr[String] = js.undefined
    
    /** The ID of the frame to inject the script into. This may not be used in combination with `allFrames`. */
    var frameId: js.UndefOr[Double] = js.undefined
    
    /**
      * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default it is `false`.
      */
    var matchAboutBlank: js.UndefOr[Boolean] = js.undefined
    
    /** The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle". */
    var runAt: js.UndefOr[RunAt] = js.undefined
  }
  object InjectDetails {
    
    inline def apply(): InjectDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InjectDetails]
    }
    
    extension [Self <: InjectDetails](x: Self) {
      
      inline def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
      
      inline def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setCssOrigin(value: CSSOrigin): Self = StObject.set(x, "cssOrigin", value.asInstanceOf[js.Any])
      
      inline def setCssOriginUndefined: Self = StObject.set(x, "cssOrigin", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
      
      inline def setMatchAboutBlank(value: Boolean): Self = StObject.set(x, "matchAboutBlank", value.asInstanceOf[js.Any])
      
      inline def setMatchAboutBlankUndefined: Self = StObject.set(x, "matchAboutBlank", js.undefined)
      
      inline def setRunAt(value: RunAt): Self = StObject.set(x, "runAt", value.asInstanceOf[js.Any])
      
      inline def setRunAtUndefined: Self = StObject.set(x, "runAt", js.undefined)
    }
  }
  
  @js.native
  trait PlainJSONArray
    extends StObject
       with Array[PlainJSONValue]
       with _PlainJSONValue
  
  trait PlainJSONObject
    extends StObject
       with /* key */ StringDictionary[PlainJSONValue]
       with _PlainJSONValue
  object PlainJSONObject {
    
    inline def apply(): PlainJSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlainJSONObject]
    }
  }
  
  /** A plain JSON value */
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.firefoxWebextBrowser.browser.extensionTypes.PlainJSONArray
    - typings.firefoxWebextBrowser.browser.extensionTypes.PlainJSONObject
  */
  type PlainJSONValue = _PlainJSONValue | Null | String | Double | Boolean
  
  /** The soonest that the JavaScript or CSS will be injected into the tab. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_start
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_end
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_idle
  */
  trait RunAt extends StObject
  object RunAt {
    
    inline def document_end: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_end = "document_end".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_end]
    
    inline def document_idle: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_idle = "document_idle".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_idle]
    
    inline def document_start: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_start = "document_start".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_start]
  }
  
  trait _PlainJSONValue extends StObject
}
