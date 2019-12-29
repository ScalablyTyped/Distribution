package typings.fundamentalDashReact

import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLLIElement
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Menu/Menu", JSImport.Namespace)
@js.native
object libMenuMenuMod extends js.Object {
  val default: FunctionComponent[MenuProps] with Anon_DisplayNameGroup = js.native
  type MenuGroupProps = Anon_2 with HTMLAttributes[HTMLDivElement]
  type MenuItemProps = Anon_Addon with HTMLAttributes[HTMLLIElement]
  type MenuListProps = Anon_ClassNameString with HTMLAttributes[HTMLUListElement]
  type MenuProps = Anon_AddonBefore with HTMLAttributes[HTMLElement]
}

