package typings.fundamentalReact.sideNavMod

import typings.fundamentalReact.AnonDisplayNameSideNavList
import typings.fundamentalReact.AnonDisplayNameSideNavListItem
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/SideNavigation/SideNav", JSImport.Default)
@js.native
class default ()
  extends Component[SideNavProps, js.Object, js.Any]

/* static members */
@JSImport("fundamental-react/lib/SideNavigation/SideNav", JSImport.Default)
@js.native
object default extends js.Object {
  var List: (ComponentClass[SideNavListProps, ComponentState]) with AnonDisplayNameSideNavList = js.native
  var ListItem: (ComponentClass[SideNavListItemProps, ComponentState]) with AnonDisplayNameSideNavListItem = js.native
  var displayName: typings.fundamentalReact.fundamentalReactStrings.SideNav = js.native
}

