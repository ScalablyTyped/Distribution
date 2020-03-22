package typings.fundamentalReact

import typings.fundamentalReact.fundamentalReactStrings.ListGroupDotItem
import typings.fundamentalReact.listGroupMod.ListGroupItemProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/ListGroup/ListGroup.ListGroupItemProps> & {  displayName  :'ListGroup.Item'} */
@js.native
trait FunctionComponentListGrou extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialListGroupItemProps] = js.native
  var displayName: js.UndefOr[String with ListGroupDotItem] = js.native
  var propTypes: js.UndefOr[WeakValidationMapListGrouClassName] = js.native
  def apply(props: PropsWithChildren[ListGroupItemProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ListGroupItemProps], context: js.Any): ReactElement | Null = js.native
}

