package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.ListDotFooter
import typings.fundamentalReact.listMod.ListFooterProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListFooterProps> & {  displayName :'List.Footer'} */
@js.native
trait FunctionComponentListFoot extends js.Object {
  
  def apply(props: PropsWithChildren[ListFooterProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ListFooterProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialListFooterProps] = js.native
  
  var displayName: js.UndefOr[String] with ListDotFooter = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapListFoot] = js.native
}
