package typings
package downshiftLib.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StateChangeTypes extends js.Object

@JSImport("downshift", "StateChangeTypes")
@js.native
object StateChangeTypes extends js.Object {
  @js.native
  sealed trait blurButton
    extends downshiftLib.downshiftMod.StateChangeTypes
  
  @js.native
  sealed trait blurInput
    extends downshiftLib.downshiftMod.StateChangeTypes
  
  @js.native
  sealed trait changeInput
    extends downshiftLib.downshiftMod.StateChangeTypes
  
  @js.native
  sealed trait clickButton
    extends downshiftLib.downshiftMod.StateChangeTypes
  
  @js.native
  sealed trait clickItem
    extends downshiftLib.downshiftMod.StateChangeTypes
  
  @js.native
  sealed trait controlledPropUpdatedSelectedItem
    extends downshiftLib.downshiftMod.StateChangeTypes
  
  @js.native
  sealed trait itemMouseEnter
    extends downshiftLib.downshiftMod.StateChangeTypes
  
  @js.native
  sealed trait keyDownArrowDown
    extends downshiftLib.downshiftMod.StateChangeTypes
  
  @js.native
  sealed trait keyDownArrowUp
    extends downshiftLib.downshiftMod.StateChangeTypes
  
  @js.native
  sealed trait keyDownEnter
    extends downshiftLib.downshiftMod.StateChangeTypes
  
  @js.native
  sealed trait keyDownEscape
    extends downshiftLib.downshiftMod.StateChangeTypes
  
  @js.native
  sealed trait keyDownSpaceButton
    extends downshiftLib.downshiftMod.StateChangeTypes
  
  @js.native
  sealed trait mouseUp
    extends downshiftLib.downshiftMod.StateChangeTypes
  
  @js.native
  sealed trait touchEnd
    extends downshiftLib.downshiftMod.StateChangeTypes
  
  @js.native
  sealed trait unknown
    extends downshiftLib.downshiftMod.StateChangeTypes
  
  /* "__autocomplete_blur_button__" */ val blurButton: blurButton with java.lang.String = js.native
  /* "__autocomplete_blur_input__" */ val blurInput: blurInput with java.lang.String = js.native
  /* "__autocomplete_change_input__" */ val changeInput: changeInput with java.lang.String = js.native
  /* "__autocomplete_click_button__" */ val clickButton: clickButton with java.lang.String = js.native
  /* "__autocomplete_click_item__" */ val clickItem: clickItem with java.lang.String = js.native
  /* "__autocomplete_controlled_prop_updated_selected_item__" */ val controlledPropUpdatedSelectedItem: controlledPropUpdatedSelectedItem with java.lang.String = js.native
  /* "__autocomplete_item_mouseenter__" */ val itemMouseEnter: itemMouseEnter with java.lang.String = js.native
  /* "__autocomplete_keydown_arrow_down__" */ val keyDownArrowDown: keyDownArrowDown with java.lang.String = js.native
  /* "__autocomplete_keydown_arrow_up__" */ val keyDownArrowUp: keyDownArrowUp with java.lang.String = js.native
  /* "__autocomplete_keydown_enter__" */ val keyDownEnter: keyDownEnter with java.lang.String = js.native
  /* "__autocomplete_keydown_escape__" */ val keyDownEscape: keyDownEscape with java.lang.String = js.native
  /* "__autocomplete_keydown_space_button__" */ val keyDownSpaceButton: keyDownSpaceButton with java.lang.String = js.native
  /* "__autocomplete_mouseup__" */ val mouseUp: mouseUp with java.lang.String = js.native
  /* "__autocomplete_touchend__" */ val touchEnd: touchEnd with java.lang.String = js.native
  /* "__autocomplete_unknown__" */ val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[downshiftLib.downshiftMod.StateChangeTypes with java.lang.String] = js.native
}

