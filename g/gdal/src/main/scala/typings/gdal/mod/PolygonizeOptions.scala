package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonizeOptions extends js.Object {
  
  var connectedness: js.UndefOr[Double] = js.native
  
  var dst: Layer = js.native
  
  var mask: js.UndefOr[RasterBand] = js.native
  
  var pixValField: Double = js.native
  
  var src: RasterBand = js.native
  
  var useFloats: js.UndefOr[Boolean] = js.native
}
object PolygonizeOptions {
  
  @scala.inline
  def apply(dst: Layer, pixValField: Double, src: RasterBand): PolygonizeOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], pixValField = pixValField.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonizeOptions]
  }
  
  @scala.inline
  implicit class PolygonizeOptionsOps[Self <: PolygonizeOptions] (val x: Self) extends AnyVal {
    
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
    def setDst(value: Layer): Self = this.set("dst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixValField(value: Double): Self = this.set("pixValField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: RasterBand): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedness(value: Double): Self = this.set("connectedness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectedness: Self = this.set("connectedness", js.undefined)
    
    @scala.inline
    def setMask(value: RasterBand): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setUseFloats(value: Boolean): Self = this.set("useFloats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFloats: Self = this.set("useFloats", js.undefined)
  }
}
