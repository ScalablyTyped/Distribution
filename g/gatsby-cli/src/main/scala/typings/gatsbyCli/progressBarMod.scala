package typings.gatsbyCli

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressBarMod {
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/components/progress-bar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ProgressBar(hasMessageCurrentTotalStartTime: IProgressbarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ProgressBar")(hasMessageCurrentTotalStartTime.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait IProgressbarProps extends StObject {
    
    var current: Double
    
    var message: String
    
    var startTime: js.Tuple2[Double, Double]
    
    var total: Double
  }
  object IProgressbarProps {
    
    inline def apply(current: Double, message: String, startTime: js.Tuple2[Double, Double], total: Double): IProgressbarProps = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProgressbarProps]
    }
    
    extension [Self <: IProgressbarProps](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
