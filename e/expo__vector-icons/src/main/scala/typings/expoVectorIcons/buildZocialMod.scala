package typings.expoVectorIcons

import org.scalablytyped.runtime.Shortcut
import typings.expoVectorIcons.buildCreateIconSetMod.Icon
import typings.expoVectorIcons.buildCreateIconSetMod.IconButtonProps
import typings.expoVectorIcons.buildCreateIconSetMod.IconProps
import typings.expoVectorIcons.expoVectorIconsStrings.zocial
import typings.react.mod.Component
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildZocialMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@expo/vector-icons/build/Zocial", JSImport.Default)
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
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100, starting with typings.expoVectorIcons.expoVectorIconsStrings.email, typings.expoVectorIcons.expoVectorIconsStrings.windows, typings.expoVectorIcons.expoVectorIconsStrings.ie */ Any
          ]) = this()
  }
  object default extends Shortcut {
    
    @JSImport("@expo/vector-icons/build/Zocial", JSImport.Default)
    @js.native
    val ^ : Icon[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100, starting with typings.expoVectorIcons.expoVectorIconsStrings.email, typings.expoVectorIcons.expoVectorIconsStrings.windows, typings.expoVectorIcons.expoVectorIconsStrings.ie */ Any, 
        zocial
      ] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@expo/vector-icons/build/Zocial", "default.Button")
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
                /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100, starting with typings.expoVectorIcons.expoVectorIconsStrings.email, typings.expoVectorIcons.expoVectorIconsStrings.windows, typings.expoVectorIcons.expoVectorIconsStrings.ie */ Any
              ]) = this()
      def this(
        props: IconButtonProps[
                /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100, starting with typings.expoVectorIcons.expoVectorIconsStrings.email, typings.expoVectorIcons.expoVectorIconsStrings.windows, typings.expoVectorIcons.expoVectorIconsStrings.ie */ Any
              ],
        context: Any
      ) = this()
    }
    
    type _To = Icon[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100, starting with typings.expoVectorIcons.expoVectorIconsStrings.email, typings.expoVectorIcons.expoVectorIconsStrings.windows, typings.expoVectorIcons.expoVectorIconsStrings.ie */ Any, 
        zocial
      ]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: Icon[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100, starting with typings.expoVectorIcons.expoVectorIconsStrings.email, typings.expoVectorIcons.expoVectorIconsStrings.windows, typings.expoVectorIcons.expoVectorIconsStrings.ie */ Any, 
        zocial
      ] = ^
  }
}
