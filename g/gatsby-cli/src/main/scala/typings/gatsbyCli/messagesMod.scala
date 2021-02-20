package typings.gatsbyCli

import typings.gatsbyCli.constantsMod.ActivityLogLevels
import typings.gatsbyCli.constantsMod.LogLevels
import typings.react.mod.NamedExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesMod {
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/components/messages", "Message")
  @js.native
  val Message: NamedExoticComponent[IMessageProps] = js.native
  
  @js.native
  trait IMessageProps extends StObject {
    
    var duration: js.UndefOr[Double] = js.native
    
    var level: ActivityLogLevels | LogLevels = js.native
    
    var statusText: js.UndefOr[String] = js.native
    
    var text: String = js.native
  }
  object IMessageProps {
    
    @scala.inline
    def apply(level: ActivityLogLevels | LogLevels, text: String): IMessageProps = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMessageProps]
    }
    
    @scala.inline
    implicit class IMessagePropsMutableBuilder[Self <: IMessageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setLevel(value: ActivityLogLevels | LogLevels): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
