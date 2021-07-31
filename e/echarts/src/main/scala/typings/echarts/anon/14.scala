package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  /**
    * Color of the area.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.data.itemStyle.areaColor
    */
  var areaColor: js.UndefOr[BorderType] = js.undefined
}
object `14` {
  
  @scala.inline
  def apply(): `14` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit class `14MutableBuilder`[Self <: `14`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreaColor(value: BorderType): Self = StObject.set(x, "areaColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaColorUndefined: Self = StObject.set(x, "areaColor", js.undefined)
  }
}
