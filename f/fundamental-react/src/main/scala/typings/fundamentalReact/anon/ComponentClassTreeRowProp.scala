package typings.fundamentalReact.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.fundamentalReact.fundamentalReactStrings.TreeViewDotRow
import typings.fundamentalReact.treeViewMod.TreeRowProps
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeRowProps, react.react.ComponentState> & {  displayName :'TreeView.Row'} */
@js.native
trait ComponentClassTreeRowProp
  extends Instantiable1[/* props */ TreeRowProps, Component[TreeRowProps, ComponentState, js.Any]]
     with Instantiable2[
      /* props */ TreeRowProps, 
      /* context */ js.Any, 
      Component[TreeRowProps, ComponentState, js.Any]
    ] {
  
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var contextType: js.UndefOr[Context[_]] = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialTreeRowProps] = js.native
  
  var displayName: js.UndefOr[String] with TreeViewDotRow = js.native
  
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeRowProps, ComponentState]] = js.native
  
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeRowProps, ComponentState]] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapTreeRowP] = js.native
}
