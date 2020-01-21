package typings.fundamentalReact

import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLLIElement
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Menu/Menu", JSImport.Namespace)
@js.native
object menuMod extends js.Object {
  val default: FunctionComponent[MenuProps] with AnonDisplayNameGroup = js.native
  type MenuGroupProps = Anon2 with HTMLAttributes[HTMLDivElement]
  type MenuItemProps = AnonAddon with HTMLAttributes[HTMLLIElement]
  type MenuListProps = AnonClassNameString with HTMLAttributes[HTMLUListElement]
  type MenuProps = AnonAddonBefore with HTMLAttributes[HTMLElement]
}

