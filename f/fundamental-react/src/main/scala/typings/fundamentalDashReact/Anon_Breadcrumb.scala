package typings.fundamentalDashReact

import typings.fundamentalDashReact.fundamentalDashReactStrings.Breadcrumb
import typings.fundamentalDashReact.libBreadcrumbBreadcrumbMod.BreadcrumbItemProps
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Breadcrumb extends js.Object {
  var Item: FunctionComponent[BreadcrumbItemProps] with Anon_BreadcrumbItem
  var displayName: Breadcrumb
}

object Anon_Breadcrumb {
  @scala.inline
  def apply(Item: FunctionComponent[BreadcrumbItemProps] with Anon_BreadcrumbItem, displayName: Breadcrumb): Anon_Breadcrumb = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Breadcrumb]
  }
}

