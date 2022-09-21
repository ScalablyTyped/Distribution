package typings.googleAppsScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exposes options currently configured for a Chart, such as height, color, etc.
  *
  * Please see the visualization
  * reference documentation for information on what options are available. Specific options for
  * each chart can be found by clicking on the specific chart in the chart gallery.
  *
  * These options are immutable.
  */
trait ChartOptions extends StObject {
  
  def get(option: String): Any
}
object ChartOptions {
  
  inline def apply(get: String => Any): ChartOptions = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ChartOptions]
  }
  
  extension [Self <: ChartOptions](x: Self) {
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
