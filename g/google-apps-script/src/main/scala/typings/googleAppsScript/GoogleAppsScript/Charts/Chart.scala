package typings.googleAppsScript.GoogleAppsScript.Charts

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Chart object, which can be converted to a static image. For charts embedded in spreadsheets,
  * see EmbeddedChart.
  */
trait Chart extends StObject {
  
  def getAs(contentType: String): Blob
  
  def getBlob(): Blob
  
  def getOptions(): ChartOptions
}
object Chart {
  
  inline def apply(getAs: String => Blob, getBlob: () => Blob, getOptions: () => ChartOptions): Chart = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getOptions = js.Any.fromFunction0(getOptions))
    __obj.asInstanceOf[Chart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chart] (val x: Self) extends AnyVal {
    
    inline def setGetAs(value: String => Blob): Self = StObject.set(x, "getAs", js.Any.fromFunction1(value))
    
    inline def setGetBlob(value: () => Blob): Self = StObject.set(x, "getBlob", js.Any.fromFunction0(value))
    
    inline def setGetOptions(value: () => ChartOptions): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
  }
}
