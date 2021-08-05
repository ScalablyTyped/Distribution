package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateViews extends StObject {
  
  /**
    * The URL that you navigate to in order to start the view.
    */
  var url: js.UndefOr[String] = js.undefined
}
object TemplateViews {
  
  inline def apply(): TemplateViews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateViews]
  }
  
  extension [Self <: TemplateViews](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
