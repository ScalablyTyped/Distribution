package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the SingleLevelIndicator class.
  */
trait ASPxClientSingleLevelIndicator
  extends StObject
     with ASPxClientIndicator {
  
  /**
    * Gets a value specifying the value level to which the single-level indicator corresponds.
    */
  var valueLevel: String
}
object ASPxClientSingleLevelIndicator {
  
  inline def apply(chart: ASPxClientWebChart, name: String, series: ASPxClientSeries, valueLevel: String): ASPxClientSingleLevelIndicator = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], valueLevel = valueLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSingleLevelIndicator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientSingleLevelIndicator] (val x: Self) extends AnyVal {
    
    inline def setValueLevel(value: String): Self = StObject.set(x, "valueLevel", value.asInstanceOf[js.Any])
  }
}
