package typings.fundamentalReact.listMod

import typings.fundamentalReact.anon.FunctionComponentListFoot
import typings.fundamentalReact.anon.FunctionComponentListHead
import typings.fundamentalReact.anon.FunctionComponentListIcon
import typings.fundamentalReact.anon.FunctionComponentListItem
import typings.fundamentalReact.anon.FunctionComponentListSele
import typings.fundamentalReact.anon.FunctionComponentListText
import typings.fundamentalReact.anon.PartialListProps
import typings.fundamentalReact.anon.WeakValidationMapListProp
import typings.fundamentalReact.fundamentalReactStrings.List
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react/lib/List/List", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(props: PropsWithChildren[ListProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ListProps], context: js.Any): ReactElement | Null = js.native
  
  var Footer: FunctionComponentListFoot = js.native
  
  var Header: FunctionComponentListHead = js.native
  
  var Icon: FunctionComponentListIcon = js.native
  
  var Item: FunctionComponentListItem = js.native
  
  var Selection: FunctionComponentListSele = js.native
  
  var Text: FunctionComponentListText = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialListProps] = js.native
  
  var displayName: js.UndefOr[List | String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapListProp] = js.native
}
