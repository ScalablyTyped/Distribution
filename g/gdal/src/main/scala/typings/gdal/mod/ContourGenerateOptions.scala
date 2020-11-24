package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContourGenerateOptions extends js.Object {
  
  var dst: Layer = js.native
  
  var elevField: js.UndefOr[Double] = js.native
  
  var fixedLevels: js.UndefOr[js.Array[Double]] = js.native
  
  var idField: js.UndefOr[Double] = js.native
  
  var interval: js.UndefOr[Double] = js.native
  
  var nodata: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var src: RasterBand = js.native
}
object ContourGenerateOptions {
  
  @scala.inline
  def apply(dst: Layer, src: RasterBand): ContourGenerateOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContourGenerateOptions]
  }
  
  @scala.inline
  implicit class ContourGenerateOptionsOps[Self <: ContourGenerateOptions] (val x: Self) extends AnyVal {
    
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
    def setSrc(value: RasterBand): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevField(value: Double): Self = this.set("elevField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElevField: Self = this.set("elevField", js.undefined)
    
    @scala.inline
    def setFixedLevelsVarargs(value: Double*): Self = this.set("fixedLevels", js.Array(value :_*))
    
    @scala.inline
    def setFixedLevels(value: js.Array[Double]): Self = this.set("fixedLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedLevels: Self = this.set("fixedLevels", js.undefined)
    
    @scala.inline
    def setIdField(value: Double): Self = this.set("idField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdField: Self = this.set("idField", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setNodata(value: Double): Self = this.set("nodata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodata: Self = this.set("nodata", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
