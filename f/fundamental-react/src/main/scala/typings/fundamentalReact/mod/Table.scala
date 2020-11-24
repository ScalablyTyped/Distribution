package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialTableProps
import typings.fundamentalReact.anon.WeakValidationMapTablePro
import typings.fundamentalReact.tableMod.TableProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react", "Table")
@js.native
object Table extends js.Object {
  
  def apply(props: PropsWithChildren[TableProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[TableProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialTableProps] = js.native
  
  var displayName: js.UndefOr[String | typings.fundamentalReact.fundamentalReactStrings.Table] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapTablePro] = js.native
}
