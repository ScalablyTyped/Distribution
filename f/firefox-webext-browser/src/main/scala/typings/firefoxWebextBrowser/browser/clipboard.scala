package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Offers the ability to write to the clipboard. Reading is not supported because the clipboard can already be read through the standard web platform APIs.
  *
  * Permissions: `clipboardWrite`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object clipboard {
  
  /** The type of imageData. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.png
  */
  trait SetImageDataImageType extends StObject
  object SetImageDataImageType {
    
    @scala.inline
    def jpeg: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg = "jpeg".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg]
    
    @scala.inline
    def png: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.png = "png".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.png]
  }
}
