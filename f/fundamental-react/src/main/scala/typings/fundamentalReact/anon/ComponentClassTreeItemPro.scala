package typings.fundamentalReact.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.fundamentalReact.fundamentalReactStrings.TreeViewDotItem
import typings.fundamentalReact.treeViewMod.TreeItemProps
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeItemProps, react.react.ComponentState> & {  displayName :'TreeView.Item'} */
@js.native
trait ComponentClassTreeItemPro
  extends Instantiable1[/* props */ TreeItemProps, Component[TreeItemProps, ComponentState, js.Any]]
     with Instantiable2[
      /* props */ TreeItemProps, 
      /* context */ js.Any, 
      Component[TreeItemProps, ComponentState, js.Any]
    ] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTreeItemProps] = js.native
  var displayName: js.UndefOr[String] with TreeViewDotItem = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeItemProps, ComponentState]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeItemProps, ComponentState]] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTreeItem] = js.native
}

