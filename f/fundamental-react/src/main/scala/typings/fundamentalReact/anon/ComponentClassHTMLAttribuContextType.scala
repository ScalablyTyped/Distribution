package typings.fundamentalReact.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.fundamentalReact.fundamentalReactStrings.LayoutPanelDotFooter
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.ValidationMap
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ComponentClass<react.react.HTMLAttributes<std.HTMLDivElement>, react.react.ComponentState> & {  displayName :'LayoutPanel.Footer'} */
@js.native
trait ComponentClassHTMLAttribuContextType
  extends Instantiable1[
      /* props */ HTMLAttributes[HTMLDivElement], 
      Component[HTMLAttributes[HTMLDivElement], ComponentState, js.Any]
    ]
     with Instantiable2[
      /* props */ HTMLAttributes[HTMLDivElement], 
      /* context */ js.Any, 
      Component[HTMLAttributes[HTMLDivElement], ComponentState, js.Any]
    ] {
  
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var contextType: js.UndefOr[Context[_]] = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialHTMLAttributesHTML] = js.native
  
  var displayName: js.UndefOr[String] with LayoutPanelDotFooter = js.native
  
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[HTMLAttributes[HTMLDivElement], ComponentState]] = js.native
  
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[HTMLAttributes[HTMLDivElement], ComponentState]] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapHTMLAttr] = js.native
}
