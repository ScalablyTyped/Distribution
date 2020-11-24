package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesColor extends js.Object {
  
  var seriesColor: js.UndefOr[String] = js.native
  
  var seriesIndex: js.UndefOr[Double] = js.native
  
  var seriesName: js.UndefOr[js.Any] = js.native
}
object SeriesColor {
  
  @scala.inline
  def apply(): SeriesColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesColor]
  }
  
  @scala.inline
  implicit class SeriesColorOps[Self <: SeriesColor] (val x: Self) extends AnyVal {
    
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
    def setSeriesColor(value: String): Self = this.set("seriesColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesColor: Self = this.set("seriesColor", js.undefined)
    
    @scala.inline
    def setSeriesIndex(value: Double): Self = this.set("seriesIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesIndex: Self = this.set("seriesIndex", js.undefined)
    
    @scala.inline
    def setSeriesName(value: js.Any): Self = this.set("seriesName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesName: Self = this.set("seriesName", js.undefined)
  }
}
