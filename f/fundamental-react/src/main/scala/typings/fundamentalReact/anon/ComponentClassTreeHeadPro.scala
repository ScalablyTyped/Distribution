package typings.fundamentalReact.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.fundamentalReact.fundamentalReactStrings.TreeViewDotHead
import typings.fundamentalReact.treeViewMod.TreeHeadProps
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeHeadProps, react.react.ComponentState> & {  displayName  :'TreeView.Head'} */
@js.native
trait ComponentClassTreeHeadPro
  extends Instantiable1[/* props */ TreeHeadProps, Component[TreeHeadProps, ComponentState, js.Any]]
     with Instantiable2[
      /* props */ TreeHeadProps, 
      /* context */ js.Any, 
      Component[TreeHeadProps, ComponentState, js.Any]
    ] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTreeHeadProps] = js.native
  var displayName: js.UndefOr[String with TreeViewDotHead] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeHeadProps, ComponentState]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeHeadProps, ComponentState]] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTreeHead] = js.native
}

