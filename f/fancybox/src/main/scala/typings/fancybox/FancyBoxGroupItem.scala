package typings.fancybox

import typings.fancybox.fancyboxStrings.`inline`
import typings.fancybox.fancyboxStrings.ajax
import typings.fancybox.fancyboxStrings.html
import typings.fancybox.fancyboxStrings.iframe
import typings.fancybox.fancyboxStrings.image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxGroupItem extends StObject {
  
  var opts: js.UndefOr[FancyBoxOptions] = js.undefined
  
  var src: String
  
  var `type`: js.UndefOr[image | `inline` | ajax | iframe | html] = js.undefined
}
object FancyBoxGroupItem {
  
  inline def apply(src: String): FancyBoxGroupItem = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxGroupItem]
  }
  
  extension [Self <: FancyBoxGroupItem](x: Self) {
    
    inline def setOpts(value: FancyBoxOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setType(value: image | `inline` | ajax | iframe | html): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
