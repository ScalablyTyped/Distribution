package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  /**
    * The color of a node. It use global palette
    * [option.color](https://echarts.apache.org/en/option.html#color)
    * by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.itemStyle.color
    */
  var color: js.UndefOr[String] = js.undefined
}
object `25` {
  
  @scala.inline
  def apply(): `25` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`25`]
  }
  
  @scala.inline
  implicit class `25MutableBuilder`[Self <: `25`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
