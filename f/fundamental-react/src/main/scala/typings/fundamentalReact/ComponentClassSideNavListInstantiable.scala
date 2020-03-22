package typings.fundamentalReact

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.fundamentalReact.fundamentalReactStrings.SideNavDotListItem
import typings.fundamentalReact.sideNavMod.SideNavListItemProps
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/SideNavigation/SideNav.SideNavListItemProps, react.react.ComponentState> & {  displayName  :'SideNav.ListItem'} */
@js.native
trait ComponentClassSideNavListInstantiable
  extends Instantiable1[
      /* props */ SideNavListItemProps, 
      Component[SideNavListItemProps, ComponentState, js.Any]
    ]
     with Instantiable2[
      /* props */ SideNavListItemProps, 
      /* context */ js.Any, 
      Component[SideNavListItemProps, ComponentState, js.Any]
    ] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialSideNavListItemPro] = js.native
  var displayName: js.UndefOr[String with SideNavDotListItem] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[SideNavListItemProps, ComponentState]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[SideNavListItemProps, ComponentState]] = js.native
  var propTypes: js.UndefOr[WeakValidationMapSideNavLExpanded] = js.native
}

