package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.ListDotItem
import typings.fundamentalReact.listMod.ListItemProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListItemProps> & {  displayName  :'List.Item'} */
@js.native
trait FunctionComponentListItem extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialListItemProps] = js.native
  var displayName: js.UndefOr[String with ListDotItem] = js.native
  var propTypes: js.UndefOr[WeakValidationMapListItem] = js.native
  def apply(props: PropsWithChildren[ListItemProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ListItemProps], context: js.Any): ReactElement | Null = js.native
}

