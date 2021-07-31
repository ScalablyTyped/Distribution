package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ColorCurveness] = js.undefined
}
object `21` {
  
  @scala.inline
  def apply(): `21` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`21`]
  }
  
  @scala.inline
  implicit class `21MutableBuilder`[Self <: `21`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineStyle(value: ColorCurveness): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
  }
}
