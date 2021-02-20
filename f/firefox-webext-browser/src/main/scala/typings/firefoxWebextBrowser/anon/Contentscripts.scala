package typings.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contentscripts extends StObject {
  
  /** The Content Security Policy used for content scripts. */
  var content_scripts: js.UndefOr[String] = js.native
  
  /** The Content Security Policy used for extension pages. */
  var extension_pages: js.UndefOr[String] = js.native
  
  /**
    * An alias for content_scripts to support Chrome compatibility. Content Security Policy implementations may differ between Firefox and Chrome. If both isolated_world and content_scripts exist, the value from content_scripts will be used.
    */
  var isolated_world: js.UndefOr[String] = js.native
}
object Contentscripts {
  
  @scala.inline
  def apply(): Contentscripts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contentscripts]
  }
  
  @scala.inline
  implicit class ContentscriptsMutableBuilder[Self <: Contentscripts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent_scripts(value: String): Self = StObject.set(x, "content_scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_scriptsUndefined: Self = StObject.set(x, "content_scripts", js.undefined)
    
    @scala.inline
    def setExtension_pages(value: String): Self = StObject.set(x, "extension_pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension_pagesUndefined: Self = StObject.set(x, "extension_pages", js.undefined)
    
    @scala.inline
    def setIsolated_world(value: String): Self = StObject.set(x, "isolated_world", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolated_worldUndefined: Self = StObject.set(x, "isolated_world", js.undefined)
  }
}
