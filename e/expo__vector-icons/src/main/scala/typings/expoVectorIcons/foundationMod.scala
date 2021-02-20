package typings.expoVectorIcons

import org.scalablytyped.runtime.Shortcut
import typings.expoVectorIcons.createIconSetMod.Icon
import typings.expoVectorIcons.createIconSetMod.IconButtonProps
import typings.expoVectorIcons.createIconSetMod.IconProps
import typings.expoVectorIcons.expoVectorIconsStrings.foundation
import typings.react.mod.Component
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@expo/vector-icons/build/Foundation", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[IconProps[String], js.Object, js.Any] {
    def this(props: IconProps[String]) = this()
  }
  object default extends Shortcut {
    
    @JSImport("@expo/vector-icons/build/Foundation", JSImport.Default)
    @js.native
    val ^ : Icon[String, foundation] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@expo/vector-icons/build/Foundation", "default.Button")
    @js.native
    class Button protected ()
      extends Component[IconButtonProps[String], ComponentState, js.Any] {
      def this(props: IconButtonProps[String]) = this()
      def this(props: IconButtonProps[String], context: js.Any) = this()
    }
    
    type _To = Icon[String, foundation]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: Icon[String, foundation] = ^
  }
}
