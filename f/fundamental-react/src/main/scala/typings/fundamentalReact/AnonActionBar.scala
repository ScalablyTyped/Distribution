package typings.fundamentalReact

import typings.fundamentalReact.actionBarMod.ActionBarActionsProps
import typings.fundamentalReact.actionBarMod.ActionBarBackProps
import typings.fundamentalReact.actionBarMod.ActionBarHeaderProps
import typings.fundamentalReact.fundamentalReactStrings.ActionBar
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionBar extends js.Object {
  var Actions: FunctionComponent[ActionBarActionsProps] with AnonActionBarActions
  var Back: FunctionComponent[ActionBarBackProps] with AnonActionBarBack
  var Header: FunctionComponent[ActionBarHeaderProps] with AnonActionBarHeader
  var displayName: ActionBar
}

object AnonActionBar {
  @scala.inline
  def apply(
    Actions: FunctionComponent[ActionBarActionsProps] with AnonActionBarActions,
    Back: FunctionComponent[ActionBarBackProps] with AnonActionBarBack,
    Header: FunctionComponent[ActionBarHeaderProps] with AnonActionBarHeader,
    displayName: ActionBar
  ): AnonActionBar = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Back = Back.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActionBar]
  }
}

