package typings.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extensionpages extends StObject {
  
  /** The Content Security Policy used for extension pages. */
  var extension_pages: js.UndefOr[String] = js.undefined
}
object Extensionpages {
  
  inline def apply(): Extensionpages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extensionpages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Extensionpages] (val x: Self) extends AnyVal {
    
    inline def setExtension_pages(value: String): Self = StObject.set(x, "extension_pages", value.asInstanceOf[js.Any])
    
    inline def setExtension_pagesUndefined: Self = StObject.set(x, "extension_pages", js.undefined)
  }
}
