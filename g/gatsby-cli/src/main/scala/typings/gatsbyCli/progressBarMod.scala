package typings.gatsbyCli

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressBarMod {
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/components/progress-bar", "ProgressBar")
  @js.native
  def ProgressBar(hasMessageCurrentTotalStartTime: IProgressbarProps): Element = js.native
  
  @js.native
  trait IProgressbarProps extends StObject {
    
    var current: Double = js.native
    
    var message: String = js.native
    
    var startTime: js.Tuple2[Double, Double] = js.native
    
    var total: Double = js.native
  }
  object IProgressbarProps {
    
    @scala.inline
    def apply(current: Double, message: String, startTime: js.Tuple2[Double, Double], total: Double): IProgressbarProps = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProgressbarProps]
    }
    
    @scala.inline
    implicit class IProgressbarPropsMutableBuilder[Self <: IProgressbarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
