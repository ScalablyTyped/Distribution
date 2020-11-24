package typings.gifEncoder.anon

import typings.gifEncoder.mod.Pixels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexedPixels extends js.Object {
  
  /**
    * Indicator to treat imageData as RGBA values (false) or indices in palette (true)
    */
  var indexedPixels: Boolean = js.native
  
  /**
    * Array of pixels to use as palette for the frame.
    * It should follow the sequence of r, g, b, a.
    *
    * Must be used with options.indexedPixels
    */
  var palette: Pixels = js.native
}
object IndexedPixels {
  
  @scala.inline
  def apply(indexedPixels: Boolean, palette: Pixels): IndexedPixels = {
    val __obj = js.Dynamic.literal(indexedPixels = indexedPixels.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedPixels]
  }
  
  @scala.inline
  implicit class IndexedPixelsOps[Self <: IndexedPixels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndexedPixels(value: Boolean): Self = this.set("indexedPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPalette(value: Pixels): Self = this.set("palette", value.asInstanceOf[js.Any])
  }
}
