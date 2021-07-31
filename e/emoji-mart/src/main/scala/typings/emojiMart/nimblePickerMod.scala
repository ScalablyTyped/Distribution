package typings.emojiMart

import typings.emojiMart.dataMod.Data
import typings.emojiMart.sharedPropsMod.PickerProps
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nimblePickerMod {
  
  @JSImport("emoji-mart/dist-es/components/picker/nimble-picker", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[NimblePickerProps, js.Object, js.Any]
  
  type NimblePicker = PureComponent[NimblePickerProps, js.Object, js.Any]
  
  trait NimblePickerProps
    extends StObject
       with PickerProps {
    
    var data: Data
  }
  object NimblePickerProps {
    
    @scala.inline
    def apply(data: Data): NimblePickerProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[NimblePickerProps]
    }
    
    @scala.inline
    implicit class NimblePickerPropsMutableBuilder[Self <: NimblePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
