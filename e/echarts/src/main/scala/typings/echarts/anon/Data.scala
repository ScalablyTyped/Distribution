package typings.echarts.anon

import typings.echarts.echarts.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  // The data to be appended.
  var data: js.UndefOr[js.Array[js.Any] | TypedArray] = js.undefined
  
  // Specify which series the data will be appended to.
  var seriesIndex: js.UndefOr[String] = js.undefined
}
object Data {
  
  @scala.inline
  def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[js.Any] | TypedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setSeriesIndex(value: String): Self = StObject.set(x, "seriesIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesIndexUndefined: Self = StObject.set(x, "seriesIndex", js.undefined)
  }
}
