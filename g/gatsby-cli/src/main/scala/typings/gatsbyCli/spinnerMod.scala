package typings.gatsbyCli

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinnerMod {
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/components/spinner", "Spinner")
  @js.native
  def Spinner(hasTextStatusText: ISpinnerProps): Element = js.native
  
  @js.native
  trait ISpinnerProps extends StObject {
    
    var statusText: js.UndefOr[String] = js.native
    
    var text: String = js.native
  }
  object ISpinnerProps {
    
    @scala.inline
    def apply(text: String): ISpinnerProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpinnerProps]
    }
    
    @scala.inline
    implicit class ISpinnerPropsMutableBuilder[Self <: ISpinnerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
