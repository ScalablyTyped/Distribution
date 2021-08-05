package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait item extends StObject {
  
  // the point, e.g. [0, 2]
  var dataIndex: Double
  
  var datapoint: js.Array[Double]
  
  //the index of the series
  var pageX: Double
  
  var pageY: Double
  
  // the index of the point in the data array
  var series: dataSeries
  
  //the series object
  var seriesIndex: Double
}
object item {
  
  inline def apply(
    dataIndex: Double,
    datapoint: js.Array[Double],
    pageX: Double,
    pageY: Double,
    series: dataSeries,
    seriesIndex: Double
  ): item = {
    val __obj = js.Dynamic.literal(dataIndex = dataIndex.asInstanceOf[js.Any], datapoint = datapoint.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[item]
  }
  
  extension [Self <: item](x: Self) {
    
    inline def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    inline def setDatapoint(value: js.Array[Double]): Self = StObject.set(x, "datapoint", value.asInstanceOf[js.Any])
    
    inline def setDatapointVarargs(value: Double*): Self = StObject.set(x, "datapoint", js.Array(value :_*))
    
    inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    inline def setSeries(value: dataSeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesIndex(value: Double): Self = StObject.set(x, "seriesIndex", value.asInstanceOf[js.Any])
  }
}
