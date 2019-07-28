package typings.dropkickjs

import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropkick")
@js.native
class Dropkick protected () extends js.Object {
  def this(id: String) = this()
  def this(id: HTMLElement) = this()
  def this(id: String, options: DropkickOptions) = this()
  def this(id: HTMLElement, options: DropkickOptions) = this()
  var disabled: Boolean = js.native
  var form: Node = js.native
  var length: Double = js.native
  var mobile: Boolean = js.native
  var multiple: Boolean = js.native
  var options: js.Array[String] = js.native
  var selectedIndex: Double = js.native
  var selectedOptions: js.Array[String] = js.native
  var value: String = js.native
  def add(value: String): Unit = js.native
  def add(value: String, before: String): Unit = js.native
  def add(value: String, before: Double): Unit = js.native
  def add(value: Node): Unit = js.native
  def add(value: Node, before: String): Unit = js.native
  def add(value: Node, before: Double): Unit = js.native
  def close(): Unit = js.native
  def disable(): Unit = js.native
  def disable(disabled: Boolean): Unit = js.native
  def disable(index: Double): Unit = js.native
  def disable(index: Double, disabled: Boolean): Unit = js.native
  def dispose(): Unit = js.native
  def focus(): Unit = js.native
  def hide(index: Double): Unit = js.native
  def hide(index: Double, hidden: Boolean): Unit = js.native
  def item(index: Double): Node = js.native
  def open(): Unit = js.native
  def refresh(): Unit = js.native
  def remove(index: Double): Unit = js.native
  def reset(): Unit = js.native
  def reset(clear: Boolean): Unit = js.native
  def search(string: String): js.Array[String] = js.native
  def search(string: String, mode: String): js.Array[String] = js.native
  def select(element: String): Node = js.native
  def select(element: String, selectDisabled: Boolean): Node = js.native
  def select(element: Double): Node = js.native
  def select(element: Double, selectDisabled: Boolean): Node = js.native
  def selectOne(element: Double): Node = js.native
  def selectOne(element: Double, selectDisabled: Boolean): Node = js.native
}

