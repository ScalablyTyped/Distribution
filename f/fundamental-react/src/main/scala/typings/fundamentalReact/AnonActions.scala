package typings.fundamentalReact

import typings.fundamentalReact.fundamentalReactStrings.Panel
import typings.fundamentalReact.panelMod.PanelActionsProps
import typings.fundamentalReact.panelMod.PanelBodyProps
import typings.fundamentalReact.panelMod.PanelFiltersProps
import typings.fundamentalReact.panelMod.PanelFooterProps
import typings.fundamentalReact.panelMod.PanelHeadProps
import typings.fundamentalReact.panelMod.PanelHeaderProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActions extends js.Object {
  var Actions: FunctionComponent[PanelActionsProps] with AnonDisplayNamePanelActions
  var Body: FunctionComponent[PanelBodyProps] with AnonDisplayNamePanelBody
  var Filters: FunctionComponent[PanelFiltersProps] with AnonDisplayNamePanelFilters
  var Footer: FunctionComponent[PanelFooterProps] with AnonDisplayNamePanelFooter
  var Head: FunctionComponent[PanelHeadProps] with AnonDisplayNamePanelHead
  var Header: FunctionComponent[PanelHeaderProps] with AnonDisplayNamePanelHeader
  var displayName: Panel
}

object AnonActions {
  @scala.inline
  def apply(
    Actions: FunctionComponent[PanelActionsProps] with AnonDisplayNamePanelActions,
    Body: FunctionComponent[PanelBodyProps] with AnonDisplayNamePanelBody,
    Filters: FunctionComponent[PanelFiltersProps] with AnonDisplayNamePanelFilters,
    Footer: FunctionComponent[PanelFooterProps] with AnonDisplayNamePanelFooter,
    Head: FunctionComponent[PanelHeadProps] with AnonDisplayNamePanelHead,
    Header: FunctionComponent[PanelHeaderProps] with AnonDisplayNamePanelHeader,
    displayName: Panel
  ): AnonActions = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Footer = Footer.asInstanceOf[js.Any], Head = Head.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActions]
  }
}

