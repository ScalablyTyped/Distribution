package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.ListDotHeader
import typings.fundamentalReact.listMod.ListHeaderProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListHeaderProps> & {  displayName :'List.Header'} */
@js.native
trait FunctionComponentListHead extends StObject {
  
  def apply(props: ListHeaderProps): ReactElement | Null = js.native
  def apply(props: ListHeaderProps, context: Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialListHeaderProps] = js.native
  
  var displayName: js.UndefOr[String] & ListDotHeader = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapListHead] = js.native
}
