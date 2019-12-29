package typings.fundamentalDashReact

import typings.fundamentalDashReact.fundamentalDashReactStrings.Panel
import typings.fundamentalDashReact.libPanelPanelMod.PanelActionsProps
import typings.fundamentalDashReact.libPanelPanelMod.PanelBodyProps
import typings.fundamentalDashReact.libPanelPanelMod.PanelFiltersProps
import typings.fundamentalDashReact.libPanelPanelMod.PanelFooterProps
import typings.fundamentalDashReact.libPanelPanelMod.PanelHeadProps
import typings.fundamentalDashReact.libPanelPanelMod.PanelHeaderProps
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actions extends js.Object {
  var Actions: FunctionComponent[PanelActionsProps] with Anon_DisplayNamePanelActions
  var Body: FunctionComponent[PanelBodyProps] with Anon_DisplayNamePanelBody
  var Filters: FunctionComponent[PanelFiltersProps] with Anon_DisplayNamePanelFilters
  var Footer: FunctionComponent[PanelFooterProps] with Anon_DisplayNamePanelFooter
  var Head: FunctionComponent[PanelHeadProps] with Anon_DisplayNamePanelHead
  var Header: FunctionComponent[PanelHeaderProps] with Anon_DisplayNamePanelHeader
  var displayName: Panel
}

object Anon_Actions {
  @scala.inline
  def apply(
    Actions: FunctionComponent[PanelActionsProps] with Anon_DisplayNamePanelActions,
    Body: FunctionComponent[PanelBodyProps] with Anon_DisplayNamePanelBody,
    Filters: FunctionComponent[PanelFiltersProps] with Anon_DisplayNamePanelFilters,
    Footer: FunctionComponent[PanelFooterProps] with Anon_DisplayNamePanelFooter,
    Head: FunctionComponent[PanelHeadProps] with Anon_DisplayNamePanelHead,
    Header: FunctionComponent[PanelHeaderProps] with Anon_DisplayNamePanelHeader,
    displayName: Panel
  ): Anon_Actions = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Footer = Footer.asInstanceOf[js.Any], Head = Head.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Actions]
  }
}

