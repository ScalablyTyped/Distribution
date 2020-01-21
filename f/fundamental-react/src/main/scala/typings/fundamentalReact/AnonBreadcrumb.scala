package typings.fundamentalReact

import typings.fundamentalReact.breadcrumbMod.BreadcrumbItemProps
import typings.fundamentalReact.fundamentalReactStrings.Breadcrumb
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBreadcrumb extends js.Object {
  var Item: FunctionComponent[BreadcrumbItemProps] with AnonBreadcrumbItem
  var displayName: Breadcrumb
}

object AnonBreadcrumb {
  @scala.inline
  def apply(Item: FunctionComponent[BreadcrumbItemProps] with AnonBreadcrumbItem, displayName: Breadcrumb): AnonBreadcrumb = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBreadcrumb]
  }
}

