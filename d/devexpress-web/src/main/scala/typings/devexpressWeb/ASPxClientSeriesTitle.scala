package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the SeriesTitle class.
  */
@js.native
trait ASPxClientSeriesTitle extends ASPxClientTitleBase {
  
  /**
    * Gets the series that owns the current title object.
    */
  var series: ASPxClientSeries = js.native
}
object ASPxClientSeriesTitle {
  
  @scala.inline
  def apply(
    alignment: String,
    chart: ASPxClientWebChart,
    dock: String,
    lines: js.Array[String],
    series: ASPxClientSeries
  ): ASPxClientSeriesTitle = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dock = dock.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSeriesTitle]
  }
  
  @scala.inline
  implicit class ASPxClientSeriesTitleMutableBuilder[Self <: ASPxClientSeriesTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeries(value: ASPxClientSeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
  }
}
