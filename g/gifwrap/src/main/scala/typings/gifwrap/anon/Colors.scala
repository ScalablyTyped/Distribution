package typings.gifwrap.anon

import typings.gifwrap.mod.GifPalette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Colors extends js.Object {
  
  var colors: js.UndefOr[js.Array[Double]] = js.native
  
  var indexCount: js.UndefOr[Double] = js.native
  
  var palettes: js.Array[GifPalette] = js.native
  
  var usesTransparency: Boolean = js.native
}
object Colors {
  
  @scala.inline
  def apply(palettes: js.Array[GifPalette], usesTransparency: Boolean): Colors = {
    val __obj = js.Dynamic.literal(palettes = palettes.asInstanceOf[js.Any], usesTransparency = usesTransparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  
  @scala.inline
  implicit class ColorsOps[Self <: Colors] (val x: Self) extends AnyVal {
    
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
    def setPalettesVarargs(value: GifPalette*): Self = this.set("palettes", js.Array(value :_*))
    
    @scala.inline
    def setPalettes(value: js.Array[GifPalette]): Self = this.set("palettes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsesTransparency(value: Boolean): Self = this.set("usesTransparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsVarargs(value: Double*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[Double]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setIndexCount(value: Double): Self = this.set("indexCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexCount: Self = this.set("indexCount", js.undefined)
  }
}
