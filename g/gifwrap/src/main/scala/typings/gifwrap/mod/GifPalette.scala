package typings.gifwrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GifPalette extends js.Object {
  
  var colors: js.Array[Double] = js.native
  
  var indexCount: Double = js.native
  
  var usesTransparency: Boolean = js.native
}
object GifPalette {
  
  @scala.inline
  def apply(colors: js.Array[Double], indexCount: Double, usesTransparency: Boolean): GifPalette = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], indexCount = indexCount.asInstanceOf[js.Any], usesTransparency = usesTransparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[GifPalette]
  }
  
  @scala.inline
  implicit class GifPaletteOps[Self <: GifPalette] (val x: Self) extends AnyVal {
    
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
    def setColorsVarargs(value: Double*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[Double]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexCount(value: Double): Self = this.set("indexCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsesTransparency(value: Boolean): Self = this.set("usesTransparency", value.asInstanceOf[js.Any])
  }
}
