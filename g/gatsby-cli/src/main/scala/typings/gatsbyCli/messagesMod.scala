package typings.gatsbyCli

import typings.gatsbyCli.constantsMod.ActivityLogLevels
import typings.gatsbyCli.constantsMod.LogLevels
import typings.react.mod.NamedExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesMod {
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/components/messages", "Message")
  @js.native
  val Message: NamedExoticComponent[IMessageProps] = js.native
  
  trait IMessageProps extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var level: ActivityLogLevels | LogLevels
    
    var statusText: js.UndefOr[String] = js.undefined
    
    var text: String
  }
  object IMessageProps {
    
    inline def apply(level: ActivityLogLevels | LogLevels, text: String): IMessageProps = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMessageProps]
    }
    
    extension [Self <: IMessageProps](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setLevel(value: ActivityLogLevels | LogLevels): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
