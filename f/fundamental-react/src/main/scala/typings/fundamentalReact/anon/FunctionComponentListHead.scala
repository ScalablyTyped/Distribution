package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.ListDotHeader
import typings.fundamentalReact.listMod.ListHeaderProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListHeaderProps> & {  displayName :'List.Header'} */
@js.native
trait FunctionComponentListHead extends js.Object {
  
  def apply(props: PropsWithChildren[ListHeaderProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ListHeaderProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialListHeaderProps] = js.native
  
  var displayName: js.UndefOr[String] with ListDotHeader = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapListHead] = js.native
}
