package typings.fundamentalDashReact

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
  var Actions: FunctionComponent[PanelActionsProps]
  var Body: FunctionComponent[PanelBodyProps]
  var Filters: FunctionComponent[PanelFiltersProps]
  var Footer: FunctionComponent[PanelFooterProps]
  var Head: FunctionComponent[PanelHeadProps]
  var Header: FunctionComponent[PanelHeaderProps]
}

object Anon_Actions {
  @scala.inline
  def apply(
    Actions: FunctionComponent[PanelActionsProps],
    Body: FunctionComponent[PanelBodyProps],
    Filters: FunctionComponent[PanelFiltersProps],
    Footer: FunctionComponent[PanelFooterProps],
    Head: FunctionComponent[PanelHeadProps],
    Header: FunctionComponent[PanelHeaderProps]
  ): Anon_Actions = {
    val __obj = js.Dynamic.literal(Actions = Actions, Body = Body, Filters = Filters, Footer = Footer, Head = Head, Header = Header)
  
    __obj.asInstanceOf[Anon_Actions]
  }
}

