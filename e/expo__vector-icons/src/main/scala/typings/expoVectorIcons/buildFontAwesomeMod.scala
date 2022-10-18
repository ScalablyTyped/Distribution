package typings.expoVectorIcons

import org.scalablytyped.runtime.Shortcut
import typings.expoVectorIcons.buildCreateIconSetMod.Icon
import typings.expoVectorIcons.buildCreateIconSetMod.IconButtonProps
import typings.expoVectorIcons.buildCreateIconSetMod.IconProps
import typings.expoVectorIcons.expoVectorIconsStrings.FontAwesome
import typings.react.mod.Component
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFontAwesomeMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@expo/vector-icons/build/FontAwesome", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[
          IconProps[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 298, starting with typings.expoVectorIcons.expoVectorIconsStrings.link, typings.expoVectorIcons.expoVectorIconsStrings.form, typings.expoVectorIcons.expoVectorIconsStrings.picture */ Any
          ], 
          js.Object, 
          Any
        ] {
    def this(props: IconProps[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 786, starting with typings.expoVectorIcons.expoVectorIconsStrings.link, typings.expoVectorIcons.expoVectorIconsStrings.search, typings.expoVectorIcons.expoVectorIconsStrings.image */ Any
          ]) = this()
  }
  object default extends Shortcut {
    
    @JSImport("@expo/vector-icons/build/FontAwesome", JSImport.Default)
    @js.native
    val ^ : Icon[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 786, starting with typings.expoVectorIcons.expoVectorIconsStrings.link, typings.expoVectorIcons.expoVectorIconsStrings.search, typings.expoVectorIcons.expoVectorIconsStrings.image */ Any, 
        FontAwesome
      ] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@expo/vector-icons/build/FontAwesome", "default.Button")
    @js.native
    open class Button protected ()
      extends Component[
              IconButtonProps[
                /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 298, starting with typings.expoVectorIcons.expoVectorIconsStrings.link, typings.expoVectorIcons.expoVectorIconsStrings.form, typings.expoVectorIcons.expoVectorIconsStrings.picture */ Any
              ], 
              ComponentState, 
              Any
            ] {
      def this(props: IconButtonProps[
                /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 786, starting with typings.expoVectorIcons.expoVectorIconsStrings.link, typings.expoVectorIcons.expoVectorIconsStrings.search, typings.expoVectorIcons.expoVectorIconsStrings.image */ Any
              ]) = this()
      def this(
        props: IconButtonProps[
                /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 786, starting with typings.expoVectorIcons.expoVectorIconsStrings.link, typings.expoVectorIcons.expoVectorIconsStrings.search, typings.expoVectorIcons.expoVectorIconsStrings.image */ Any
              ],
        context: Any
      ) = this()
    }
    
    type _To = Icon[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 786, starting with typings.expoVectorIcons.expoVectorIconsStrings.link, typings.expoVectorIcons.expoVectorIconsStrings.search, typings.expoVectorIcons.expoVectorIconsStrings.image */ Any, 
        FontAwesome
      ]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: Icon[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 786, starting with typings.expoVectorIcons.expoVectorIconsStrings.link, typings.expoVectorIcons.expoVectorIconsStrings.search, typings.expoVectorIcons.expoVectorIconsStrings.image */ Any, 
        FontAwesome
      ] = ^
  }
}
