package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarGaugeBarInfo extends StObject {
  
  /**
    * The bar&apos;s hexadecimal color code.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * The bar&apos;s zero-based index. Bars closest to the gauge&apos;s center have higher indexes.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * The bar&apos;s value.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object BarGaugeBarInfo {
  
  inline def apply(): BarGaugeBarInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarGaugeBarInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarGaugeBarInfo] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
