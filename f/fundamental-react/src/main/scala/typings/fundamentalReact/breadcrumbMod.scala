package typings.fundamentalReact

import typings.fundamentalReact.fundamentalReactStrings.className
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.std.Exclude
import typings.std.HTMLLIElement
import typings.std.HTMLUListElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Breadcrumb/Breadcrumb", JSImport.Namespace)
@js.native
object breadcrumbMod extends js.Object {
  val default: FunctionComponent[BreadcrumbProps] with AnonBreadcrumb = js.native
  type BreadcrumbItemProps = AnonName with HTMLAttributes[HTMLLIElement]
  type BreadcrumbProps = AnonCustomStyles with (Pick[HTMLAttributes[HTMLUListElement], Exclude[String, className]])
}

