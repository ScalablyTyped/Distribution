package typings.durandal.pluginsWidgetMod

import typings.knockout.KnockoutBindingContext
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plugins/widget", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertKindToModulePath(kind: String): String = js.native
  def convertKindToViewPath(kind: String): String = js.native
  def create(element: HTMLElement, settings: WidgetSettings): Unit = js.native
  def create(element: HTMLElement, settings: WidgetSettings, bindingContext: KnockoutBindingContext): Unit = js.native
  def mapKind(kind: String): Unit = js.native
  def mapKind(kind: String, viewId: String): Unit = js.native
  def mapKind(kind: String, viewId: String, moduleId: String): Unit = js.native
  def mapKindToModuleId(kind: String): String = js.native
  def mapKindToViewId(kind: String): String = js.native
  def registerKind(kind: String): Unit = js.native
}

