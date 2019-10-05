package typings.fundamentalDashReact

import typings.fundamentalDashReact.libSideNavigationSideNavMod.SideNavListItemProps
import typings.fundamentalDashReact.libSideNavigationSideNavMod.SideNavListProps
import typings.fundamentalDashReact.libSideNavigationSideNavMod.default
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/SideNavigation", JSImport.Namespace)
@js.native
object libSideNavigationMod extends js.Object {
  @js.native
  class SideNav () extends default
  
  /* static members */
  @js.native
  object SideNav extends js.Object {
    var List: ComponentClass[SideNavListProps, ComponentState] = js.native
    var ListItem: ComponentClass[SideNavListItemProps, ComponentState] = js.native
  }
  
}

