package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesColor extends StObject {
  
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
  implicit class SeriesColorMutableBuilder[Self <: SeriesColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeriesColor(value: String): Self = StObject.set(x, "seriesColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesColorUndefined: Self = StObject.set(x, "seriesColor", js.undefined)
    
    @scala.inline
    def setSeriesIndex(value: Double): Self = StObject.set(x, "seriesIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesIndexUndefined: Self = StObject.set(x, "seriesIndex", js.undefined)
    
    @scala.inline
    def setSeriesName(value: js.Any): Self = StObject.set(x, "seriesName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesNameUndefined: Self = StObject.set(x, "seriesName", js.undefined)
  }
}
