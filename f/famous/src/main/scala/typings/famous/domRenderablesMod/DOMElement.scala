package typings.famous.domRenderablesMod

import typings.famous.coreMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("famous/dom-renderables", "DOMElement")
@js.native
class DOMElement protected () extends js.Object {
  def this(node: Node) = this()
  def this(node: Node, options: IDOMElementOptions) = this()
  
  def addClass(value: String): DOMElement = js.native
  
  def on(event: String, listener: js.Function1[/* payload */ js.UndefOr[js.Any], Unit]): js.Function0[Unit] = js.native
  
  def onHide(): Unit = js.native
  
  def onShow(): Unit = js.native
  
  def removeClass(value: String): DOMElement = js.native
  
  def setAttribute(name: String, value: String): DOMElement = js.native
  
  def setContent(content: String): Node = js.native
  
  def setProperty(name: String, value: String): DOMElement = js.native
}
