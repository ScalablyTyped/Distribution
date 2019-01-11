package typings
package durandalLib.pluginsWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plugins/widget", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertKindToModulePath(kind: java.lang.String): java.lang.String = js.native
  def convertKindToViewPath(kind: java.lang.String): java.lang.String = js.native
  def create(element: stdLib.HTMLElement, settings: durandalLib.pluginsWidgetMod.WidgetSettings): scala.Unit = js.native
  def create(
    element: stdLib.HTMLElement,
    settings: durandalLib.pluginsWidgetMod.WidgetSettings,
    bindingContext: knockoutLib.KnockoutBindingContext
  ): scala.Unit = js.native
  def mapKind(kind: java.lang.String): scala.Unit = js.native
  def mapKind(kind: java.lang.String, viewId: java.lang.String): scala.Unit = js.native
  def mapKind(kind: java.lang.String, viewId: java.lang.String, moduleId: java.lang.String): scala.Unit = js.native
  def mapKindToModuleId(kind: java.lang.String): java.lang.String = js.native
  def mapKindToViewId(kind: java.lang.String): java.lang.String = js.native
  def registerKind(kind: java.lang.String): scala.Unit = js.native
}

