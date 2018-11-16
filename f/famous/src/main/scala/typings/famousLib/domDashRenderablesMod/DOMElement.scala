package typings
package famousLib.domDashRenderablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/dom-renderables", "DOMElement")
@js.native
class DOMElement protected () extends js.Object {
  def this(node: famousLib.coreMod.Node) = this()
  def this(node: famousLib.coreMod.Node, options: IDOMElementOptions) = this()
  def addClass(value: java.lang.String): DOMElement = js.native
  def on(event: java.lang.String, listener: js.Function1[/* payload */ js.UndefOr[js.Any], scala.Unit]): js.Function0[scala.Unit] = js.native
  def onHide(): scala.Unit = js.native
  def onShow(): scala.Unit = js.native
  def removeClass(value: java.lang.String): DOMElement = js.native
  def setAttribute(name: java.lang.String, value: java.lang.String): DOMElement = js.native
  def setContent(content: java.lang.String): famousLib.coreMod.Node = js.native
  def setProperty(name: java.lang.String, value: java.lang.String): DOMElement = js.native
}

