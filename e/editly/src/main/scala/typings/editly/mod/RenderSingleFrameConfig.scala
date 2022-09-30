package typings.editly.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderSingleFrameConfig
  extends StObject
     with Config {
  
  /**
  		 * Timestamp to render.
  		 */
  var time: js.UndefOr[Double] = js.undefined
}
object RenderSingleFrameConfig {
  
  inline def apply(clips: js.Array[Clip], outPath: String): RenderSingleFrameConfig = {
    val __obj = js.Dynamic.literal(clips = clips.asInstanceOf[js.Any], outPath = outPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderSingleFrameConfig]
  }
  
  extension [Self <: RenderSingleFrameConfig](x: Self) {
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
