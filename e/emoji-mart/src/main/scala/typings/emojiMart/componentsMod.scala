package typings.emojiMart

import typings.emojiMart.categoryMod.Props
import typings.emojiMart.nimblePickerMod.NimblePickerProps
import typings.emojiMart.sharedPropsMod.PickerProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("emoji-mart/dist-es/components", JSImport.Namespace)
@js.native
object componentsMod extends js.Object {
  
  @js.native
  class Category ()
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class NimblePicker ()
    extends Component[NimblePickerProps, js.Object, js.Any]
  
  @js.native
  class Picker ()
    extends Component[PickerProps, js.Object, js.Any]
}
