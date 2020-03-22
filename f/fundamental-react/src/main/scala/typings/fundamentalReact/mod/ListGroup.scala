package typings.fundamentalReact.mod

import typings.fundamentalReact.FunctionComponentListGrou
import typings.fundamentalReact.FunctionComponentListGrouCall
import typings.fundamentalReact.FunctionComponentListGrouContextTypes
import typings.fundamentalReact.PartialListGroupProps
import typings.fundamentalReact.WeakValidationMapListGrou
import typings.fundamentalReact.listGroupMod.ListGroupProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "ListGroup")
@js.native
object ListGroup extends js.Object {
  var Item: FunctionComponentListGrou = js.native
  var ItemActions: FunctionComponentListGrouCall = js.native
  var ItemCheckbox: FunctionComponentListGrouContextTypes = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialListGroupProps] = js.native
  var displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.ListGroup | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapListGrou] = js.native
  def apply(props: PropsWithChildren[ListGroupProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ListGroupProps], context: js.Any): ReactElement | Null = js.native
}

