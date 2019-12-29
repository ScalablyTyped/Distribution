package typings.fundamentalDashReact

import typings.fundamentalDashReact.fundamentalDashReactStrings.className
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.HTMLAttributes
import typings.std.Exclude
import typings.std.HTMLLIElement
import typings.std.HTMLUListElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Breadcrumb/Breadcrumb", JSImport.Namespace)
@js.native
object libBreadcrumbBreadcrumbMod extends js.Object {
  val default: FunctionComponent[BreadcrumbProps] with Anon_Breadcrumb = js.native
  type BreadcrumbItemProps = Anon_Name with HTMLAttributes[HTMLLIElement]
  type BreadcrumbProps = Anon_CustomStyles with (Pick[HTMLAttributes[HTMLUListElement], Exclude[String, className]])
}

