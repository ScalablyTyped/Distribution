package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.ListDotSelection
import typings.fundamentalReact.listMod.ListSelectionProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListSelectionProps> & {  displayName :'List.Selection'} */
@js.native
trait FunctionComponentListSele extends StObject {
  
  def apply(props: PropsWithChildren[ListSelectionProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ListSelectionProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialListSelectionProps] = js.native
  
  var displayName: js.UndefOr[String] & ListDotSelection = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapListSele] = js.native
}
