package typings.fundamentalReact

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.fundamentalReact.fundamentalReactStrings.SideNavDotList
import typings.fundamentalReact.sideNavMod.SideNavListProps
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/SideNavigation/SideNav.SideNavListProps, react.react.ComponentState> & {  displayName  :'SideNav.List'} */
@js.native
trait ComponentClassSideNavList
  extends Instantiable1[/* props */ SideNavListProps, Component[SideNavListProps, ComponentState, js.Any]]
     with Instantiable2[
      /* props */ SideNavListProps, 
      /* context */ js.Any, 
      Component[SideNavListProps, ComponentState, js.Any]
    ] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialSideNavListProps] = js.native
  var displayName: js.UndefOr[String with SideNavDotList] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[SideNavListProps, ComponentState]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[SideNavListProps, ComponentState]] = js.native
  var propTypes: js.UndefOr[WeakValidationMapSideNavL] = js.native
}

