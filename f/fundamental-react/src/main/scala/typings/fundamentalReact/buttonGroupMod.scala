package typings.fundamentalReact

import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Button/ButtonGroup", JSImport.Namespace)
@js.native
object buttonGroupMod extends js.Object {
  val default: FunctionComponent[ButtonGroupProps] with AnonButtonGroup = js.native
  type ButtonGroupProps = AnonCustomStylesDisableStyles with HTMLAttributes[HTMLDivElement]
}

