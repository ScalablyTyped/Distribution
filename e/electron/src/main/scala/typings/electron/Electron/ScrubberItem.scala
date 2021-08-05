package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrubberItem extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/scrubber-item
  /**
    * The image to appear in this item.
    */
  var icon: js.UndefOr[NativeImage_] = js.undefined
  
  /**
    * The text to appear in this item.
    */
  var label: js.UndefOr[String] = js.undefined
}
object ScrubberItem {
  
  inline def apply(): ScrubberItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrubberItem]
  }
  
  extension [Self <: ScrubberItem](x: Self) {
    
    inline def setIcon(value: NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
