package typings.dmx.mod

import typings.dmx.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.dmx.mod.OptionRange
  - typings.dmx.mod.SliderRange
*/
trait Range extends StObject
object Range {
  
  inline def OptionRange(options: js.Array[Label]): typings.dmx.mod.OptionRange = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("option")
    __obj.asInstanceOf[typings.dmx.mod.OptionRange]
  }
  
  inline def SliderRange(max: Double, min: Double): typings.dmx.mod.SliderRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("slider")
    __obj.asInstanceOf[typings.dmx.mod.SliderRange]
  }
}
