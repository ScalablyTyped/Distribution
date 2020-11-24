package typings.devextreme.mod.default.ui

import typings.devextreme.mod.DevExpress.ui.dxOverlayOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "ui.dxOverlay")
@js.native
class dxOverlay protected ()
  extends typings.devextreme.mod.DevExpress.ui.dxOverlay {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: dxOverlayOptions[typings.devextreme.mod.DevExpress.ui.dxOverlay]) = this()
  def this(element: Element, options: dxOverlayOptions[typings.devextreme.mod.DevExpress.ui.dxOverlay]) = this()
}
@JSImport("devextreme", "ui.dxOverlay")
@js.native
object dxOverlay extends js.Object {
  
  def baseZIndex(zIndex: Double): Unit = js.native
}
