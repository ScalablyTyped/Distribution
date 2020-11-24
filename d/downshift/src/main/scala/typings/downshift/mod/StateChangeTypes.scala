package typings.downshift.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StateChangeTypes extends js.Object
@JSImport("downshift", "StateChangeTypes")
@js.native
object StateChangeTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StateChangeTypes with String] = js.native
  
  @js.native
  sealed trait blurButton extends StateChangeTypes
  /* "__autocomplete_blur_button__" */ @js.native
  object blurButton extends TopLevel[blurButton with String]
  
  @js.native
  sealed trait blurInput extends StateChangeTypes
  /* "__autocomplete_blur_input__" */ @js.native
  object blurInput extends TopLevel[blurInput with String]
  
  @js.native
  sealed trait changeInput extends StateChangeTypes
  /* "__autocomplete_change_input__" */ @js.native
  object changeInput extends TopLevel[changeInput with String]
  
  @js.native
  sealed trait clickButton extends StateChangeTypes
  /* "__autocomplete_click_button__" */ @js.native
  object clickButton extends TopLevel[clickButton with String]
  
  @js.native
  sealed trait clickItem extends StateChangeTypes
  /* "__autocomplete_click_item__" */ @js.native
  object clickItem extends TopLevel[clickItem with String]
  
  @js.native
  sealed trait controlledPropUpdatedSelectedItem extends StateChangeTypes
  /* "__autocomplete_controlled_prop_updated_selected_item__" */ @js.native
  object controlledPropUpdatedSelectedItem extends TopLevel[controlledPropUpdatedSelectedItem with String]
  
  @js.native
  sealed trait itemMouseEnter extends StateChangeTypes
  /* "__autocomplete_item_mouseenter__" */ @js.native
  object itemMouseEnter extends TopLevel[itemMouseEnter with String]
  
  @js.native
  sealed trait keyDownArrowDown extends StateChangeTypes
  /* "__autocomplete_keydown_arrow_down__" */ @js.native
  object keyDownArrowDown extends TopLevel[keyDownArrowDown with String]
  
  @js.native
  sealed trait keyDownArrowUp extends StateChangeTypes
  /* "__autocomplete_keydown_arrow_up__" */ @js.native
  object keyDownArrowUp extends TopLevel[keyDownArrowUp with String]
  
  @js.native
  sealed trait keyDownEnter extends StateChangeTypes
  /* "__autocomplete_keydown_enter__" */ @js.native
  object keyDownEnter extends TopLevel[keyDownEnter with String]
  
  @js.native
  sealed trait keyDownEscape extends StateChangeTypes
  /* "__autocomplete_keydown_escape__" */ @js.native
  object keyDownEscape extends TopLevel[keyDownEscape with String]
  
  @js.native
  sealed trait keyDownSpaceButton extends StateChangeTypes
  /* "__autocomplete_keydown_space_button__" */ @js.native
  object keyDownSpaceButton extends TopLevel[keyDownSpaceButton with String]
  
  @js.native
  sealed trait mouseUp extends StateChangeTypes
  /* "__autocomplete_mouseup__" */ @js.native
  object mouseUp extends TopLevel[mouseUp with String]
  
  @js.native
  sealed trait touchEnd extends StateChangeTypes
  /* "__autocomplete_touchend__" */ @js.native
  object touchEnd extends TopLevel[touchEnd with String]
  
  @js.native
  sealed trait unknown extends StateChangeTypes
  /* "__autocomplete_unknown__" */ @js.native
  object unknown extends TopLevel[unknown with String]
}
