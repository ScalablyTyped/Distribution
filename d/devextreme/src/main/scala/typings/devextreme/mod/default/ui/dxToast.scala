package typings.devextreme.mod.default.ui

import typings.devextreme.mod.DevExpress.ui.dxToastOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "ui.dxToast")
@js.native
class dxToast protected ()
  extends typings.devextreme.mod.DevExpress.ui.dxOverlay {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: dxToastOptions) = this()
  def this(element: Element, options: dxToastOptions) = this()
}
