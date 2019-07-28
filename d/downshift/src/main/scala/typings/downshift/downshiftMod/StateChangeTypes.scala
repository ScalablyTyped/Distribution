package typings.downshift.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StateChangeTypes extends js.Object

@JSImport("downshift", "StateChangeTypes")
@js.native
object StateChangeTypes extends js.Object {
  @js.native
  sealed trait blurButton extends StateChangeTypes
  
  @js.native
  sealed trait blurInput extends StateChangeTypes
  
  @js.native
  sealed trait changeInput extends StateChangeTypes
  
  @js.native
  sealed trait clickButton extends StateChangeTypes
  
  @js.native
  sealed trait clickItem extends StateChangeTypes
  
  @js.native
  sealed trait controlledPropUpdatedSelectedItem extends StateChangeTypes
  
  @js.native
  sealed trait itemMouseEnter extends StateChangeTypes
  
  @js.native
  sealed trait keyDownArrowDown extends StateChangeTypes
  
  @js.native
  sealed trait keyDownArrowUp extends StateChangeTypes
  
  @js.native
  sealed trait keyDownEnter extends StateChangeTypes
  
  @js.native
  sealed trait keyDownEscape extends StateChangeTypes
  
  @js.native
  sealed trait keyDownSpaceButton extends StateChangeTypes
  
  @js.native
  sealed trait mouseUp extends StateChangeTypes
  
  @js.native
  sealed trait touchEnd extends StateChangeTypes
  
  @js.native
  sealed trait unknown extends StateChangeTypes
  
  /* "__autocomplete_blur_button__" */ val blurButton: typings.downshift.downshiftMod.StateChangeTypes.blurButton with String = js.native
  /* "__autocomplete_blur_input__" */ val blurInput: typings.downshift.downshiftMod.StateChangeTypes.blurInput with String = js.native
  /* "__autocomplete_change_input__" */ val changeInput: typings.downshift.downshiftMod.StateChangeTypes.changeInput with String = js.native
  /* "__autocomplete_click_button__" */ val clickButton: typings.downshift.downshiftMod.StateChangeTypes.clickButton with String = js.native
  /* "__autocomplete_click_item__" */ val clickItem: typings.downshift.downshiftMod.StateChangeTypes.clickItem with String = js.native
  /* "__autocomplete_controlled_prop_updated_selected_item__" */ val controlledPropUpdatedSelectedItem: typings.downshift.downshiftMod.StateChangeTypes.controlledPropUpdatedSelectedItem with String = js.native
  /* "__autocomplete_item_mouseenter__" */ val itemMouseEnter: typings.downshift.downshiftMod.StateChangeTypes.itemMouseEnter with String = js.native
  /* "__autocomplete_keydown_arrow_down__" */ val keyDownArrowDown: typings.downshift.downshiftMod.StateChangeTypes.keyDownArrowDown with String = js.native
  /* "__autocomplete_keydown_arrow_up__" */ val keyDownArrowUp: typings.downshift.downshiftMod.StateChangeTypes.keyDownArrowUp with String = js.native
  /* "__autocomplete_keydown_enter__" */ val keyDownEnter: typings.downshift.downshiftMod.StateChangeTypes.keyDownEnter with String = js.native
  /* "__autocomplete_keydown_escape__" */ val keyDownEscape: typings.downshift.downshiftMod.StateChangeTypes.keyDownEscape with String = js.native
  /* "__autocomplete_keydown_space_button__" */ val keyDownSpaceButton: typings.downshift.downshiftMod.StateChangeTypes.keyDownSpaceButton with String = js.native
  /* "__autocomplete_mouseup__" */ val mouseUp: typings.downshift.downshiftMod.StateChangeTypes.mouseUp with String = js.native
  /* "__autocomplete_touchend__" */ val touchEnd: typings.downshift.downshiftMod.StateChangeTypes.touchEnd with String = js.native
  /* "__autocomplete_unknown__" */ val unknown: typings.downshift.downshiftMod.StateChangeTypes.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StateChangeTypes with String] = js.native
}

