package typings
package dropkickjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropkick")
@js.native
class Dropkick protected () extends js.Object {
  def this(id: java.lang.String) = this()
  def this(id: stdLib.HTMLElement) = this()
  def this(id: java.lang.String, options: DropkickOptions) = this()
  def this(id: stdLib.HTMLElement, options: DropkickOptions) = this()
  var disabled: scala.Boolean = js.native
  var form: stdLib.Node = js.native
  var length: scala.Double = js.native
  var mobile: scala.Boolean = js.native
  var multiple: scala.Boolean = js.native
  var options: js.Array[java.lang.String] = js.native
  var selectedIndex: scala.Double = js.native
  var selectedOptions: js.Array[java.lang.String] = js.native
  var value: java.lang.String = js.native
  def add(value: java.lang.String): scala.Unit = js.native
  def add(value: java.lang.String, before: java.lang.String): scala.Unit = js.native
  def add(value: java.lang.String, before: scala.Double): scala.Unit = js.native
  def add(value: stdLib.Node): scala.Unit = js.native
  def add(value: stdLib.Node, before: java.lang.String): scala.Unit = js.native
  def add(value: stdLib.Node, before: scala.Double): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def disable(disabled: scala.Boolean): scala.Unit = js.native
  def disable(index: scala.Double): scala.Unit = js.native
  def disable(index: scala.Double, disabled: scala.Boolean): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def hide(index: scala.Double): scala.Unit = js.native
  def hide(index: scala.Double, hidden: scala.Boolean): scala.Unit = js.native
  def item(index: scala.Double): stdLib.Node = js.native
  def open(): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def remove(index: scala.Double): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def reset(clear: scala.Boolean): scala.Unit = js.native
  def search(string: java.lang.String): js.Array[java.lang.String] = js.native
  def search(string: java.lang.String, mode: java.lang.String): js.Array[java.lang.String] = js.native
  def select(element: java.lang.String): stdLib.Node = js.native
  def select(element: java.lang.String, selectDisabled: scala.Boolean): stdLib.Node = js.native
  def select(element: scala.Double): stdLib.Node = js.native
  def select(element: scala.Double, selectDisabled: scala.Boolean): stdLib.Node = js.native
  def selectOne(element: scala.Double): stdLib.Node = js.native
  def selectOne(element: scala.Double, selectDisabled: scala.Boolean): stdLib.Node = js.native
}

