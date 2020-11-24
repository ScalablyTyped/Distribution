package typings.fundamentalReact.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.fundamentalReact.fundamentalReactStrings.TreeViewDotCol
import typings.fundamentalReact.treeViewMod.TreeColProps
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeColProps, react.react.ComponentState> & {  displayName :'TreeView.Col'} */
@js.native
trait ComponentClassTreeColProp
  extends Instantiable1[/* props */ TreeColProps, Component[TreeColProps, ComponentState, js.Any]]
     with Instantiable2[
      /* props */ TreeColProps, 
      /* context */ js.Any, 
      Component[TreeColProps, ComponentState, js.Any]
    ] {
  
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var contextType: js.UndefOr[Context[_]] = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialTreeColProps] = js.native
  
  var displayName: js.UndefOr[String] with TreeViewDotCol = js.native
  
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeColProps, ComponentState]] = js.native
  
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeColProps, ComponentState]] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapTreeColP] = js.native
}
