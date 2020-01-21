package typings.fundamentalReact

import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Link/Link", JSImport.Namespace)
@js.native
object linkMod extends js.Object {
  val default: FunctionComponent[LinkProps] with AnonDisplayNameLink = js.native
  type LinkProps = AnonClassNameCustomStyles with HTMLAttributes[HTMLAnchorElement]
}

