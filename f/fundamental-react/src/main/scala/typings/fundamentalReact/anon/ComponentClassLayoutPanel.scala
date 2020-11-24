package typings.fundamentalReact.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.fundamentalReact.fundamentalReactStrings.LayoutPanelDotHead
import typings.fundamentalReact.layoutPanelMod.LayoutPanelHeadProps
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/LayoutPanel/LayoutPanel.LayoutPanelHeadProps, react.react.ComponentState> & {  displayName :'LayoutPanel.Head'} */
@js.native
trait ComponentClassLayoutPanel
  extends Instantiable1[
      /* props */ LayoutPanelHeadProps, 
      Component[LayoutPanelHeadProps, ComponentState, js.Any]
    ]
     with Instantiable2[
      /* props */ LayoutPanelHeadProps, 
      /* context */ js.Any, 
      Component[LayoutPanelHeadProps, ComponentState, js.Any]
    ] {
  
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var contextType: js.UndefOr[Context[_]] = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialLayoutPanelHeadPro] = js.native
  
  var displayName: js.UndefOr[String] with LayoutPanelDotHead = js.native
  
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[LayoutPanelHeadProps, ComponentState]] = js.native
  
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[LayoutPanelHeadProps, ComponentState]] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapLayoutPa] = js.native
}
