package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the SeriesLabelBase class.
  */
trait ASPxClientSeriesLabel
  extends StObject
     with ASPxClientWebChartElement {
  
  /**
    * Gets the series that owns the current series label object.
    */
  var series: ASPxClientSeries
  
  /** @deprecated This property is obsolete and isn't used at all. */
  /**
    * Gets the common text for all series point labels.
    */
  var text: String
}
object ASPxClientSeriesLabel {
  
  @scala.inline
  def apply(chart: ASPxClientWebChart, series: ASPxClientSeries, text: String): ASPxClientSeriesLabel = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSeriesLabel]
  }
  
  @scala.inline
  implicit class ASPxClientSeriesLabelMutableBuilder[Self <: ASPxClientSeriesLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeries(value: ASPxClientSeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
