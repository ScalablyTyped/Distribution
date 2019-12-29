package typings.fundamentalDashReact

import typings.fundamentalDashReact.fundamentalDashReactStrings.ActionBar
import typings.fundamentalDashReact.libActionBarActionBarMod.ActionBarActionsProps
import typings.fundamentalDashReact.libActionBarActionBarMod.ActionBarBackProps
import typings.fundamentalDashReact.libActionBarActionBarMod.ActionBarHeaderProps
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionBar extends js.Object {
  var Actions: FunctionComponent[ActionBarActionsProps] with Anon_ActionBarActions
  var Back: FunctionComponent[ActionBarBackProps] with Anon_ActionBarBack
  var Header: FunctionComponent[ActionBarHeaderProps] with Anon_ActionBarHeader
  var displayName: ActionBar
}

object Anon_ActionBar {
  @scala.inline
  def apply(
    Actions: FunctionComponent[ActionBarActionsProps] with Anon_ActionBarActions,
    Back: FunctionComponent[ActionBarBackProps] with Anon_ActionBarBack,
    Header: FunctionComponent[ActionBarHeaderProps] with Anon_ActionBarHeader,
    displayName: ActionBar
  ): Anon_ActionBar = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Back = Back.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActionBar]
  }
}

