package typings.fundamentalReact.mod

import typings.fundamentalReact.AnonDisplayNameSideNavList
import typings.fundamentalReact.AnonDisplayNameSideNavListItem
import typings.fundamentalReact.sideNavMod.SideNavListItemProps
import typings.fundamentalReact.sideNavMod.SideNavListProps
import typings.fundamentalReact.sideNavMod.default
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "SideNav")
@js.native
class SideNav () extends default

/* static members */
@JSImport("fundamental-react", "SideNav")
@js.native
object SideNav extends js.Object {
  var List: (ComponentClass[SideNavListProps, ComponentState]) with AnonDisplayNameSideNavList = js.native
  var ListItem: (ComponentClass[SideNavListItemProps, ComponentState]) with AnonDisplayNameSideNavListItem = js.native
  var displayName: typings.fundamentalReact.fundamentalReactStrings.SideNav = js.native
}

