package typings.fundamentalReact.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.fundamentalReact.fundamentalReactStrings.TreeViewDotBranch
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentClass<{}, react.react.ComponentState> & {  displayName  :'TreeView.Branch'} */
@js.native
trait ComponentClassComponentStInstantiable
  extends Instantiable1[/* props */ js.Object, Component[js.Object, ComponentState, js.Any]]
     with Instantiable2[
      /* props */ js.Object, 
      /* context */ js.Any, 
      Component[js.Object, ComponentState, js.Any]
    ] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[js.Object] = js.native
  var displayName: js.UndefOr[String with TreeViewDotBranch] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[js.Object, ComponentState]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[js.Object, ComponentState]] = js.native
  var propTypes: js.UndefOr[js.Object] = js.native
}

