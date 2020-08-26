package typings.durandal.widgetMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plugins/widget", "create")
@js.native
object create extends js.Object {
  def apply(element: HTMLElement, settings: WidgetSettings): Unit = js.native
  def apply(
    element: HTMLElement,
    settings: WidgetSettings,
    bindingContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ js.Any
  ): Unit = js.native
}

