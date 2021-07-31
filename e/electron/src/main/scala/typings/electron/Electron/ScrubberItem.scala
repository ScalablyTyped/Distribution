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
  
  @scala.inline
  def apply(): ScrubberItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrubberItem]
  }
  
  @scala.inline
  implicit class ScrubberItemMutableBuilder[Self <: ScrubberItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
